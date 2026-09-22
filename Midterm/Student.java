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
public class Student extends Person {

    private float gpa;
    private String major;

    public Student() {
    }

    public Student(float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public Student(float gpa, String major, String id, String fullName, boolean isActive, Date dateOfBirth) {
        super(id, fullName, isActive, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void addPersonInfo() {
        super.addPersonInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("GPA: ");
        setGpa(sc.nextFloat());
        System.out.println("Major: ");
        setMajor(sc.nextLine());
    }

    public void updateInfo() {
        super.updatePersonInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("GPA: ");
        setGpa(sc.nextFloat());
        System.out.println("Major: ");
        setMajor(sc.nextLine());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("GPA: " + this.getGpa());
        System.out.println("Major: " + this.getMajor());
    }
}
