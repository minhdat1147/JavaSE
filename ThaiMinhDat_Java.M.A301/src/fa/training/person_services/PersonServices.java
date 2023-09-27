package fa.training.person_services;

import fa.training.entities.Teacher;

public class PersonServices {
    public boolean checkSalary(){
        Teacher teacher = new Teacher();
        return teacher.caculateSalary()>=1000;
    }
}
