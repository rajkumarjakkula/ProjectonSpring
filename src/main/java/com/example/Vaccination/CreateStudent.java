package com.example.Vaccination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CreateStudent implements VaccinationManagement{
    private String name ;
    private String id ;
    private String status ;
    @Autowired
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void details()
    {
        System.out.println(student);
    }

    Scanner sc=new Scanner(System.in);
    @Override
    public String newStudent() {

        System.out.println("Enter Student Name");
        name=sc.nextLine();
        System.out.println("enter college id");
        id=sc.nextLine();
        System.out.println("Enter vaccination status(yes/no)");
        status = sc.nextLine();
        return "name:"+name+":id:"+id+":status:"+status;
    }

    @Override
    public String update(String name) {
        return null;
    }

    @Override
    public String delete(String name) {
        return null;
    }
}
