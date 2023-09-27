package exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        while (true) {
            showMenu();
            System.out.println("Choose 1 option");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Enter type to select (1: worker 2: engineer 3: Staff)");
                    int choiceEmployee =Integer.parseInt(scanner.nextLine());
                    switch (choiceEmployee) {
                        case 1:
                            Employee workerEmployee = new Worker();
                            workerEmployee.inputInformation();
                            employeeArrayList.add(workerEmployee);
                            break;
                        case 2:
                            Employee engineerEmployee = new Engineer();
                            engineerEmployee.inputInformation();
                            employeeArrayList.add(engineerEmployee);
                            break;
                        case 3:
                            Employee staffEmployee = new Staff();
                            staffEmployee.inputInformation();
                            employeeArrayList.add(staffEmployee);
                            break;
                        default:
                            System.out.println("choose is not valid");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Enter name employee need search");
                    String searchName = scanner.nextLine();
                    for (int i = 0; i < employeeArrayList.size(); i++) {
                        if (employeeArrayList.get(i).getFullName().equals(searchName)){
                            System.out.println(employeeArrayList.get(i).toString());
                        } else {
                            System.out.println("haven't employee in list");

                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < employeeArrayList.size(); i++) {
                        System.out.println(employeeArrayList.get(i).toString());
                    }
                    break;
                case 4:
                    System.out.println("Enter employee name need delete");
                    String deleteName = scanner.nextLine();
                    for (int i = 0; i < employeeArrayList.size(); i++) {
                        if (employeeArrayList.get(i).getFullName().equals(deleteName)) {
                            employeeArrayList.remove(i);
                        } else {
                            System.out.println("Employee name is not valid");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exit!!");
                    System.exit(choose);
                    break;
                default:
                    System.out.println("choose is not valid");
                    break;
            }
        }
    }
    public static void showMenu(){
        System.out.println("1. Add new employee");
        System.out.println("2. Search by name");
        System.out.println("3. Display information");
        System.out.println("4. Enter name delete employee");
        System.out.println("5. exit program");
    }
}
