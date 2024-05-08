/*
To write inputs program that show implementation of
1. static variables and static member functions
2. static block concept
*/

class StudentsInAClass{
    static int count = 0;
    //Try running the program without the static keyword above
    String name = "";
    int rollno = 0;
    StudentsInAClass(String name){
        this.name = name;
        this.rollno = count+1;
        count++;
    }
    void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Roll Number. : "+this.rollno);
    }

    static void displayTotalStudents(){
        System.out.println("Total Students : "+ count);
    }
}

public class Prg3a {
    public static void main(String args[]){
        System.out.println("Students Details :-");
        System.out.println("");
        StudentsInAClass std1 = new StudentsInAClass("Pratik Kuril");
        std1.display();
        StudentsInAClass std2 = new StudentsInAClass("Ishaan patel");
        std2.display();
        StudentsInAClass std3 = new StudentsInAClass("Piyush Sharma");
        std3.display();
        StudentsInAClass std4 = new StudentsInAClass("Mehak Singh");
        std4.display();
        System.out.println("");
        StudentsInAClass.displayTotalStudents();
        //Since the method is static we can call it directly without needing to create an object and referencing it.
    }
}


