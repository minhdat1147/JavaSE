package exercise2;

import java.util.Scanner;

public class Worker extends Employee{
    private int tier;
    public Worker(){
        super();
    }

    public Worker(int tier) {
        super();
        this.tier = tier;
    }

    public int getTier() {
        return tier;
    }

    public boolean setTier(int tier) {
        if(tier >=1 && tier <=10){
            this.tier = tier;
            return true;
        }else{
            System.out.println("Tier is not valid.Enter again range 1 to 10");
            return false;
        }

    }
    public void inputInformation(){
        Scanner sc = new Scanner(System.in);
        super.inputInformation();
        System.out.println("Enter tier");
        while (!setTier(Integer.parseInt(sc.nextLine())));

    }

    @Override
    public String toString() {
        return super.toString()+"Worker{" +
                "tier=" + tier +
                '}';
    }
}
