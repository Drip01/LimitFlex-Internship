package internship.week6;

record BaseballPlayer (String name, String position) {}

public class Generics {

    public static void main(String[] args) {
        BaseballTeam jane = new BaseballTeam("Jane Fc");
        BaseballTeam ckc = new BaseballTeam("Ckc Fc");
        scoreResult(jane, 1, ckc, 3);

        var Drip = new BaseballPlayer("Drip", "Right Fielder");
        var Ifeanyi = new BaseballPlayer("Ifeanyi", "Right Fielder");
        jane.addTeamMember(Drip);
        jane.addTeamMember(Ifeanyi);
        jane.listTeamMembers();
    }

    public static void scoreResult(BaseballTeam team1, int t1_score,
                                   BaseballTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
