package com.example.Vaccination;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Search {
    @Value("no data")
    private String name;
    private String collegeid;
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String search(String[] str, String name, int index){

        for(int i=0;i<index;i++)
        {
            int count=0;
            String str1=str[i];
            String[] arr = str1.split(":", 3);
            for (String w : arr) {
                count+=1;
                // System.out.println(w);
                if(count==2)
                {
                    if(name.equals(w)){

                        return str[i];
                    }
                }
            }
        }
        return "No student available";
    }
}
