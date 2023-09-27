import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student[] students = new Student[2];
        Student student = new Student();
        for (int i = 0; i < 2; i++) {
            student.inputInfo();
            students[i] = student;
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(students[i].toString());
        }
//        int choice;
//        do {
//            showMenu();
//            System.out.println("Choice Option");
//            choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("Nhập số sinh viên");
//                    int n = scanner.nextInt();
//                    for (int i = 0; i < n; i++) {
//                        Student student = new Student();
//                        student.inputInfo();
//                        studentArrayList.add(student);
//                    }
//                    break;
//                case 2:
//                    for (int i = 0; i < studentArrayList.size(); i++) {
//                        System.out.println(studentArrayList.get(i).toString());
//                    }
//                    break;
//                case 3:
//                    int minIndex = 0, maxIndex = 0;
//                    float minMark, maxMark;
//                    minMark = studentArrayList.get(0).getMark();
//                    maxMark = studentArrayList.get(0).getMark();
//                    for (int i = 1; i < studentArrayList.size(); i++) {
//                        if (studentArrayList.get(i).getMark() < minMark) {
//                            minIndex = i;
//                            minMark = studentArrayList.get(i).getMark();
//                        }
//                        if (studentArrayList.get(i).getMark() > maxMark) {
//                            maxIndex = i;
//                            maxMark = studentArrayList.get(i).getMark();
//                        }
//                    }
//                    System.out.println("Sinh viên có điểm trung bình cao nhất");
//                    System.out.println(studentArrayList.get(maxIndex).toString());
//                    System.out.println("Sinh viên có điểm trung bình thấp nhất");
//                    System.out.println(studentArrayList.get(minIndex).toString());
//                    break;
//                case 4:
//                    System.out.println("Nhập mã sinh viên cần tìm");
//                    scanner.nextLine();
//                    String rolNoSearch = scanner.nextLine();
//                    for (Student student : studentArrayList
//                    ) {
//                        if (student.getRollNo().equalsIgnoreCase(rolNoSearch)) {
//                            System.out.println(student);
//                        }else {
//                            System.out.println("Không tìm thấy sinh viên nào");
//                        }
//                    }
//                    break;
//                case 5:
//                    Collections.sort(studentArrayList, new Comparator<Student>() {
//                        @Override
//                        public int compare(Student o1, Student o2) {
//                            int cmp = o1.getName().compareTo(o2.getName());
//                            if (cmp >= 0) {
//                                return 1;
//                            }
//                            return -1;
//                        }
//                    });
//                    System.out.println("list được sắp xếp");
//                    for (int i = 0; i < studentArrayList.size(); i++) {
//                        System.out.println(studentArrayList.get(i).toString());
//                    }
//                    break;
//                case 6:
//                    Collections.sort(studentArrayList, new Comparator<Student>() {
//                        @Override
//                        public int compare(Student o1, Student o2) {
//                            return o1.getMark()>= o2.getMark()? -1:1;
//                        }
//                    });
//                    System.out.println("Sinh viên có học bổng");
//                    for (int i = 0; i < studentArrayList.size(); i++) {
//                        if (studentArrayList.get(i).checkScholarship()){
//                            System.out.println(studentArrayList.get(i).toString());
//                        }
//                    }
//                    break;
//                case 7:
//                    System.out.println("Exit!!");
//                    break;
//                default:
//                    System.err.println("Nhập sai");
//            }
//
//        }while (choice != 7) ;
//    }
//    public static void showMenu(){
//        System.out.println("1. Enter n students");
//        System.out.println("2. Show information student");
//        System.out.println("3. Show sinh viên min and max theo điểm trung bình");
//        System.out.println("4. Tìm kiếm theo mã sinh viên ");
//        System.out.println("5. sắp xếp A-Z theo tên sinh viên và hiển thị");
//        System.out.println("6. Hiển thị sinh viên được học bổng");
//        System.out.println("7. Thoát");
    }
}