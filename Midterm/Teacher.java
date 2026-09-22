/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvutrunghieu_2738.Lec10_Abtrastion.Midterm;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Trung Hieu
 */
public class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher() {
    }

    public Teacher(String department, String teachingSubject) {
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public Teacher(String department, String teachingSubject, String id, String fullName, boolean isActive, Date dateOfBirth) {
        super(id, fullName, isActive, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void addPersonInfo() {
        super.addPersonInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("department: ");
        setDepartment(sc.nextLine());
        System.out.println("subject: ");
        setTeachingSubject(sc.nextLine());
    }

    public void updateInfo() {
        super.updatePersonInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("department: ");
        setDepartment(sc.nextLine());
        System.out.println("subject: ");
        setTeachingSubject(sc.nextLine());
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("department: "+this.getDepartment());
        System.out.println("subject: "+this.getTeachingSubject());
    }
}
