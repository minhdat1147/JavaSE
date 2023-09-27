package exercise2;

import java.util.Scanner;

public class Engineer extends Employee{
    private String trainingIndustry;
    public Engineer(){
        super();
    }

    public Engineer(String trainingIndustry) {
        super();
        this.trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }
    public void inputInformation(){
        Scanner sc = new Scanner(System.in);
        super.inputInformation();
        System.out.println("Enter trainning inductry");
        setTrainingIndustry(sc.nextLine());
    }
    @Override
    public String toString() {
        return super.toString()+"Engineer{" +
                "trainingIndustry='" + trainingIndustry + '\'' +
                '}';
    }
}
