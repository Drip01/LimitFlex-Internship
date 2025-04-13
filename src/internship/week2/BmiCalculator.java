package internship.week2;

public class BmiCalculator {
    double weight;
    double height;

    public BmiCalculator(double weight, double height){
        this.weight = weight;
        this.height =height;
    }
    public double calculateBMI(){
        return weight / (height * height);
    }

    public String bmiCategory() {
        double bmi = calculateBMI();
        if (bmi < 19.6) {
            return "Under weight";
        } else if (bmi >= 19.6 && bmi < 24.9) {
            return "Normal weight";
        } else if(bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
    public static void main(String[] args) {
        BmiCalculator bmi = new BmiCalculator(70, 1.75);
        System.out.println("BMI: " + bmi.calculateBMI());
        System.out.println("Category: " + bmi.bmiCategory());
    }
    }
