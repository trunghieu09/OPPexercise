/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvutrunghieu_2738.Lec10_Abtrastion.Midterm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Trung Hieu
 */
public abstract class Person implements Iperson {

    private String id;
    private String fullName;
    private boolean isActive;
    private Date dateOfBirth;

    public Person() {
    }

    public Person(String id, String fullName, boolean isActive, Date dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.isActive = isActive;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void addPersonInfo() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id: ");
            setId(sc.nextLine());
            System.out.println("Fullname: ");
            setFullName(sc.nextLine());
            System.out.println("Is this person still alive? ");
            setIsActive(sc.nextBoolean());
            SimpleDateFormat pdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("date of birth? ");
            String date = sc.nextLine();
            setDateOfBirth(pdf.parse(date));
        } catch (ParseException e) {
            System.out.println("Wrong format!");
        }
    }

    @Override
    public void updatePersonInfo() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id: ");
            setId(sc.nextLine());
            System.out.println("Fullname: ");
            setFullName(sc.nextLine());
            System.out.println("Is this person still alive? ");
            setIsActive(sc.nextBoolean());
            SimpleDateFormat pdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("date of birth? ");
            String date = sc.nextLine();
            setDateOfBirth(pdf.parse(date));
        } catch (ParseException e) {
            System.out.println("Wrong format!");
        }
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat pdf=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: " + this.getId());
        System.out.println("fullname: " + this.getFullName());
        System.out.println("is alive: " + this.isIsActive());
        System.out.println("date of birth: " + pdf.format(dateOfBirth));
    }
}
