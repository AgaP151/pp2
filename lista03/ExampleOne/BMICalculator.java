public class BMICalculator {
    private String name;
    private int weight;
    private float height;
    private double bmi;

    public BMICalculator(String n, int w, float h){
        name = n;
        weight = w;
        height = h;
    }
    public void calculateBMI(){
        bmi = weight / (height * height);
    }
    public boolean isOverweight(){
        return (bmi > 25);
    }
    public String getName(){
        return name;
    }
    public double getBMI() { return bmi;

    }
}


