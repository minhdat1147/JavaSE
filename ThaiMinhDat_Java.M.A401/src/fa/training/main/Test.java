package fa.training.main;

import fa.training.management.MultimediaManagement;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultimediaManagement multimediaManagement = new MultimediaManagement();
        int choice;
        while(true){
            showMenu();
            System.out.println("Choice option");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    multimediaManagement.addVideo();
                    break;
                case 2:
                    multimediaManagement.addSong();
                    break;
                case 3:
                    multimediaManagement.display();
                    break;
                case 4:
                    System.out.println("Exit!!");
                    System.exit(choice);
                    break;
                default:
                    System.out.println("Option is not valid");
                    break;
            }
        }
    }
    public static void showMenu(){
        System.out.println("1. Add a new video");
        System.out.println("2. Add a new song");
        System.out.println("3. Show all multimedia");
        System.out.println("4. Exit");
    }
}
