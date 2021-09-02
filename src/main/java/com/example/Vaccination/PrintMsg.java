package com.example.Vaccination;

import org.springframework.stereotype.Component;

@Component("message")
public class PrintMsg {
    private String msg;
    private Student student;
    public void setMsg(String msg){
        this.msg = msg;
    }
    public String getMsg(){
        return msg;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void details()
    {
        System.out.println(student);
    }


}
