package internship.week10.ThreadingExamples;

// ThreadingExamples.java

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ConcurrentSkipListMap;

public class Main {

	// 1. Deadlock
	public static void deadlockExample() {
		final Object toy1 = new Object();
		final Object toy2 = new Object();

		Thread kid1 = new Thread(() -> {
			synchronized (toy1) {
				System.out.println("Kid1: Holding toy1...");
				try { Thread.sleep(100); } catch (Exception ignored) {}
				synchronized (toy2) {
					System.out.println("Kid1: Holding toy2 too!");
				}
			}
		});

		Thread kid2 = new Thread(() -> {
			synchronized (toy2) {
				System.out.println("Kid2: Holding toy2...");
				try { Thread.sleep(100); } catch (Exception ignored) {}
				synchronized (toy1) {
					System.out.println("Kid2: Holding toy1 too!");
				}
			}
		});

		kid1.start();
		kid2.start();
	}

	// 2. Single Thread Executor
	public static void singleThreadExecutorExample() {
		ExecutorService singleKid = Executors.newSingleThreadExecutor();
		for (int i = 1; i <= 3; i++) {
			int task = i;
			singleKid.submit(() -> System.out.println("Kid is doing task " + task));
		}
		singleKid.shutdown();
	}

	// 3. Thread Pool
	public static void threadPoolExample() {
		ExecutorService team = Executors.newFixedThreadPool(3);
		for (int i = 1; i <= 6; i++) {
			int task = i;
			team.submit(() -> {
				System.out.println("Kid is doing task " + task);
				try { Thread.sleep(500); } catch (Exception ignored) {}
			});
		}
		team.shutdown();
	}

	// 4. invokeAll & invokeAny
	public static void invokeAllAndAnyExample() throws Exception {
		ExecutorService kids = Executors.newFixedThreadPool(3);
		List<Callable<String>> tasks = List.of(
				() -> { Thread.sleep(100); return "Kid 1 done"; },
				() -> { Thread.sleep(200); return "Kid 2 done"; },
				() -> { Thread.sleep(300); return "Kid 3 done"; }
		);

		List<Future<String>> all = kids.invokeAll(tasks);
		for (Future<String> f : all) System.out.println(f.get());

		String first = kids.invokeAny(tasks);
		System.out.println("First to finish: " + first);

		kids.shutdown();
	}

	// 5. Scheduled Tasks
	public static void scheduledTaskExample() throws InterruptedException {
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		Runnable feedDog = () -> System.out.println("Feeding the dog at " + System.currentTimeMillis());
		scheduler.scheduleAtFixedRate(feedDog, 0, 2, TimeUnit.SECONDS);
		Thread.sleep(5000); // Let it run for 5 seconds then shut down
		scheduler.shutdown();
	}

	// 6. ForkJoinPool
	static class AddTask extends RecursiveTask<Integer> {
		int start, end;
		AddTask(int start, int end) { this.start = start; this.end = end; }
		protected Integer compute() {
			if (end - start <= 10) {
				int sum = 0;
				for (int i = start; i <= end; i++) sum += i;
				return sum;
			}
			int mid = (start + end) / 2;
			AddTask left = new AddTask(start, mid);
			AddTask right = new AddTask(mid + 1, end);
			left.fork();
			return right.compute() + left.join();
		}
	}

	public static void forkJoinExample() {
		ForkJoinPool pool = new ForkJoinPool();
		System.out.println("Sum 1 to 100 = " + pool.invoke(new AddTask(1, 100)));
	}

	// 7. Work Stealing Pool
	public static void workStealingExample() throws Exception {
		ExecutorService pool = Executors.newWorkStealingPool();
		List<Callable<String>> tasks = List.of(
				() -> { Thread.sleep(500); return "Task 1"; },
				() -> { Thread.sleep(500); return "Task 2"; },
				() -> { Thread.sleep(500); return "Task 3"; },
				() -> { Thread.sleep(500); return "Task 4"; }
		);

		pool.invokeAll(tasks).forEach(f -> {
			try { System.out.println(f.get()); } catch (Exception e) {}
		});

		pool.shutdown();
	}

	// 8. Parallel Streams
	public static void parallelStreamExample() {
		List<String> toys = List.of("Ball", "Doll", "Blocks", "Car");
		toys.parallelStream().forEach(toy ->
				System.out.println(Thread.currentThread().getName() + " plays with " + toy));
	}

	// 9. ConcurrentSkipListMap
	public static void skipListMapExample() {
		ConcurrentSkipListMap<Integer, String> leaderboard = new ConcurrentSkipListMap<>();
		leaderboard.put(3, "Alice");
		leaderboard.put(1, "Bob");
		leaderboard.put(2, "Carol");
		leaderboard.forEach((score, name) ->
				System.out.println(name + " scored " + score));
	}

	public static void main(String[] args) throws Exception {
		System.out.println("=== Deadlock ===");
		deadlockExample();
		Thread.sleep(500); // Just a pause between examples

		System.out.println("\n=== Single Thread Executor ===");
		singleThreadExecutorExample();
		Thread.sleep(1000);

		System.out.println("\n=== Thread Pool ===");
		threadPoolExample();
		Thread.sleep(2000);

		System.out.println("\n=== invokeAll & invokeAny ===");
		invokeAllAndAnyExample();

		System.out.println("\n=== Scheduled Tasks ===");
		scheduledTaskExample();

		System.out.println("\n=== ForkJoinPool ===");
		forkJoinExample();

		System.out.println("\n=== Work Stealing Pool ===");
		workStealingExample();

		System.out.println("\n=== Parallel Streams ===");
		parallelStreamExample();

		System.out.println("\n=== ConcurrentSkipListMap ===");
		skipListMapExample();
	}
}

