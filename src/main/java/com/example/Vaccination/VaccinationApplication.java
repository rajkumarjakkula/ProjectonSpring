package com.example.Vaccination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class VaccinationApplication {

	public static void main(String[] args) throws IOException {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	//	ApplicationContext con=new AnnotationConfigApplicationContext(VaccinationConfig.class);

//
//		Student student=(Student)context.getBean("student");
//		System.out.println(student.details());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean checker=true;
		String str[]=new String[10];
		int index=0;
		System.out.println("Welcome to vaccination Portal for JNTU College\nSelect the options to move to different pages \n 1. Create New Student \n 2. Update vaccination or other details \n 3. Show all the users \n 4. Search studentss by id \n 5. Exit from site");
		while (checker)
		{
			int value = Integer.parseInt(br.readLine().trim());
			switch (value){
				case 1:
				{
					System.out.println("Welcome to new student Registration:");
					CreateStudent createStu=(CreateStudent) context.getBean("createStudent");
//					CreateStudent createStu=con.getBean("createBean",CreateStudent.class);
					str[index]= String.valueOf(createStu.newStudent());
					System.out.println(str[index]);
					ClearofCase cs=(ClearofCase) context.getBean("printing");
					System.out.println(cs.getStr());
					index+=1;
					break;
				}

				case 2:
				{

					ClearofCase cs=(ClearofCase) context.getBean("printing");
					System.out.println(cs.getStr());
					break;
				}
				case 3:
				{
					System.out.println("Students list:");
					PrintMsg details = (PrintMsg) context.getBean("message");
					if(index==0){

					}
					for(int i=0;i<index;i++)
					{
						details.setMsg(str[i]);
						System.out.println(details.getMsg());
					}
					ClearofCase cs=(ClearofCase) context.getBean("printing");
					System.out.println(cs.getStr());
					break;
				}
				case 4:
				{
					Search search=(Search) context.getBean("search");
					if(index==0)
					{
						System.out.println(search.getName());
						break;
					}
					System.out.println("Enter the student name:");
					search.setName(br.readLine().trim());
					String result=search.search(str, search.getName(),index);
					System.out.println(result);
					ClearofCase cs=(ClearofCase) context.getBean("printing");
					System.out.println(cs.getStr());
					break;
				}

				case 5:
				{
					System.out.println("Thank you");
					checker=false;
					ClearofCase cs=(ClearofCase) context.getBean("printing");
					System.out.println(cs.getStr());
					break;

				}
				default:
				{
					System.out.println("select 1 to 5 only");
					ClearofCase cs=(ClearofCase) context.getBean("printing");
					System.out.println(cs.getStr());
					break;
				}
			}
		}
	}

}
