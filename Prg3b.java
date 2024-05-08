public class Prg3b {
    public static void main(String[] args) {
        System.out.println("Students Details :-");
        System.out.println("Minimum Attendance Required = "+ Student.minAttendance);
        System.out.println("");
        Student std1 = new Student("Pratik Kuril", 80);
        std1.displayDetails();
        Student std2 = new Student("Ishaan patel",33);
        std2.displayDetails();
        Student std3 = new Student("Piyush Sharma", 75);
        std3.displayDetails();
        Student std4 = new Student("Mehak Singh", 99);
        std4.displayDetails();
    }
}

class Student{
    static int minAttendance;
    static{
        minAttendance = 75;
    }
    String name = "";
    int attendance = 0;
    boolean eligible = false;
    Student(String name, int attendance){
        this.name = name;
        this.attendance = attendance;
    }
    void displayDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("Attendance = "+this.attendance);
        if(this.attendance >= minAttendance){
            eligible = true;
        }
        System.out.println("Student eligible to take exam : "+this.eligible);
        System.out.println("");
    }
}