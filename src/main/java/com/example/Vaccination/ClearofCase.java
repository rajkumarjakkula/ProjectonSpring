package com.example.Vaccination;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("printing")
public class ClearofCase {
    @Value("completed")
    private String str;
    public void setStr(String str) {
        this.str = "done";
    }
    public String getStr() {
        return str;
    }


}
