package com.example.Vaccination;

public class Student extends Person{
    private String name;
    private String id;
    private String status;

    public Student(String name, String id, String status) {
        super();
        setName(name);
        setId(id);
        setStatus(status);
    }
    public String details()
    {
        return getId()+getName()+getStatus();
    }

}
