/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvutrunghieu_2738.Lec10_Abtrastion.Midterm;

import java.util.*;

/**
 *
 * @author Trung Hieu
 */
public class PersonArrayList {

    ArrayList<Person> personArrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addPersonInfo(Person person) {
        person.addPersonInfo();
    }

    public void updatePersonInfo(String id) {
        for (int i = 0; i < personArrayList.size(); i++) {
            Person person = personArrayList.get(i);
            if (person.getId().equalsIgnoreCase(id)) {
                person.updatePersonInfo();
                System.out.println("Update successfully!");
                return;
            }
        }
        System.out.println("Id not found!");
    }

    public void deletePersonById(String id) {
        for (int i = 0; i < personArrayList.size(); i++) {
            Person person = personArrayList.get(i);
            if (person.getId().equalsIgnoreCase(id)) {
                personArrayList.remove(i);
                System.out.println("Delete successfully!");
                return;
            }
        }
        System.out.println("Id not found!");
    }

    public void findPersonById(String id) {
        for (int i = 0; i < personArrayList.size(); i++) {
            Person person = personArrayList.get(i);
            if (person.getId().equalsIgnoreCase(id)) {
                personArrayList.remove(i);
                System.out.println("Delete successfully!");
                return;
            }
        }
        System.out.println("Id not found!");
    }

    public void displayEveryone() {
        for (int i = 0; i < personArrayList.size(); i++) {
            Person person = personArrayList.get(i);
            person.displayInfo();
            return;
        }
    }

    public void findTeacherByDepartment(String department) {
        for (int i = 0; i < personArrayList.size(); i++) {
            Person person = personArrayList.get(i);
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equalsIgnoreCase(department)) {
                    teacher.displayInfo();
                }
            }
        }
    }

    public void countPersonByType() {
        int studentcount = 0;
        int teachercount = 0;
        for (int i = 0; i < personArrayList.size(); i++) {
            Person person = personArrayList.get(i);
            if (person instanceof Student) {
                studentcount++;
            } else if (person instanceof Teacher) {
                teachercount++;
            }
        }
        System.out.println("number of student: " + studentcount);
        System.out.println("number of teacher: " + teachercount);
    }
}
