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
public class Processor {

    public static void main(String[] args) {
        PersonArrayList a = new PersonArrayList();
        Scanner sc = new Scanner(System.in);
        int nhap;
        do {
            System.out.println("1.add\n2.update\n3.delete\n4.display\n5.find\n6.count");
            System.out.println("Choose: ");
            nhap = sc.nextInt();
            sc.nextLine();
            switch (nhap) {
                case 1: {
                    System.out.println("1.student |  2.teacher");
                    int enter = sc.nextInt();
                    if (enter == 1) {
                        Student student = new Student();
                        student.addPersonInfo();
                        a.addPersonInfo(student);
                    } else if (enter == 2) {
                        Teacher teacher = new Teacher();
                        teacher.addPersonInfo();
                        a.addPersonInfo(teacher);
                    } else {
                        System.out.println("option not found!");
                    }
                }
                case 2: {
                    System.out.println("Enter id to update: ");
                    String id = sc.nextLine();
                    a.updatePersonInfo(id);
                    break;
                }
                case 3: {
                    System.out.println("Enter id to delete: ");
                    String id = sc.nextLine();
                    a.deletePersonById(id);
                    break;
                }
                case 4: {
                    a.displayEveryone();
                    break;
                }
                case 5: {
                    System.out.println("Enter department to find");
                    String department = sc.nextLine();
                    a.findTeacherByDepartment(department);
                    break;
                }
                case 6:{
                    a.countPersonByType();
                    break;
                }
                case 0:{
                    System.out.println("Exit");
                    break;
                }
                default :
                    System.out.println("option not found");
            }
        } while (nhap != 0);
    }
}
