//Wap to enter the name, age, yob and roll number of a student by using class and object concept. Verify if the age matches the yob. 

import java.util.Scanner;

class Student{
    String name;
    int age, yob;
    long rollno;
    Student(String name, int age, int yob, long rollno){
        this.name = name;
        this.age = age;
        this.yob = yob;
        this.rollno = rollno;
    }
    void display(){
        System.out.println("\nStudent Details :-");
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Year of Birth : "+ yob);
        System.out.println("Roll Number : "+ rollno);
    }
}

class Prg2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name = sc.nextLine();
        System.out.println("Enter the age of the student");
        int age = sc.nextInt();
        System.out.println("Enter the year of birth of the student");
        int yob = sc.nextInt();
        System.out.println("Enter the roll number of the student");
        long rollno = sc.nextLong();
        Student s = new Student(name, age, yob, rollno);
        s.display();
        verify(yob, age);
        sc.close();
    }
    static boolean verify(int yob, int age){
        int diff = 2024 - yob;
        if(diff == age){
            System.out.println("The age matches the year of birth.");
            return true;
        }
        System.out.println("The age does not match the year of birth.");
        return false;
    }
}