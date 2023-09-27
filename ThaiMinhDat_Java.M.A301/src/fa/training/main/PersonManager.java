package fa.training.main;

import fa.training.entities.Person;
import fa.training.entities.Student;
import fa.training.entities.Teacher;
import  fa.training.person_services.PersonServices;
import fa.training.utils.Validator;

import java.util.*;

public class PersonManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person>  personArrayList = new ArrayList<>();
        Validator valid = new Validator();
        while (true){
            showMenu();
            System.out.println("Choice 1 option");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Enter number person");
                    int numberPerson = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < numberPerson; i++) {
                        System.out.println("input type to select {1 : student 2: teecher } ");
                        int choosePerson = Integer.parseInt(scanner.nextLine());
                        switch (choosePerson) {
                            case 1:
                                Person studentPerson = new Student();
                                studentPerson.input();
                                personArrayList.add(studentPerson);
                                break;
                            case 2:
                                Person teacherPerson = new Teacher();
                                teacherPerson.input();
                                personArrayList.add(teacherPerson);
                                break;
                            default:
                                System.out.println("choice is not valid");
                                break;
                        }
                    }
                    for (int i = 0; i < personArrayList.size(); i++) {
                        System.out.println(personArrayList.get(i).toString());
                    }
                    break;
                    case 2:
                        System.out.println("Enter student id need update");
                        String searchIdStudent = scanner.nextLine();
                        for (Person x: personArrayList
                             ) {
                           if(x instanceof Student){
                               if (((Student) x).getStudentId().equalsIgnoreCase(searchIdStudent)==true){
                                   System.out.println("Name:");
                                   String nameUpdate = scanner.nextLine();
                                   System.out.println("Gerder");
                                   String genderUpdate = scanner.nextLine();
                                   System.out.println("Phone number:");
                                   String phoneNumberUpdate = scanner.nextLine();
                                   System.out.println("Email");
                                   String emailUpdate = scanner.nextLine();
                                   System.out.println("Theory");
                                   double theoryUpdate = Double.parseDouble(scanner.nextLine());
                                   System.out.println("Practice");
                                   double practiceUpdate = Double.parseDouble(scanner.nextLine());

                                   x.setName(nameUpdate);
                                   x.setGender(genderUpdate);
                                   x.setPhoneNumber(phoneNumberUpdate);
                                   x.setEmail(emailUpdate);
                                   ((Student) x).setTheory(theoryUpdate);
                                   ((Student) x).setPractice(practiceUpdate);
                                   System.out.println("Update Successfully!!");
                                   System.out.println(x);
                               }
                               for (Person list: personArrayList
                                    ) {
                                   System.out.println(list.toString());
                               }
                        }

                        }
                        break;
                    case 3:
                        System.out.println("Teacher have salary higher than 1000$");
                        for (Person salaryTeacher: personArrayList
                             ) {
                            if(salaryTeacher instanceof Teacher){
                                if(valid.checkSalary(((Teacher) salaryTeacher).caculateSalary())== true){
                                    System.out.println(salaryTeacher);
                                }

                            }
                        }
                        break;
                    case 4:
                        System.out.println("list student pass the course");
                        for (Person markStudent: personArrayList
                             ) {
                            if(markStudent instanceof Student){
                                if(valid.checkMark(((Student) markStudent).calculateFinalmark())== true){
                                    System.out.println(markStudent);
                                }
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Exit!!");
                        System.exit(choice);
                    default:
                        System.out.println("Data is not valid");
                }
            }

    }
    public static void showMenu(){
        System.out.println("1. Input data from the keyboard: create an array of 10 Person of all types as mentioned above.");
        System.out.println("2. Update student: update student info by entering studentId." );
        System.out.println("3. Display teacher: displays information about teachers, who has a salary higher than 1000$.");
        System.out.println("4. Report: display all students and their final mark, who qualify to pass the course (final mark >=6)");
        System.out.println("5. Exit!!");

    }
}
