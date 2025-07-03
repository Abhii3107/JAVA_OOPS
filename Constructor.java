class Student{
    int age;
    String name;
    static String School_Name;

    Student(){
        System.out.println("constructor is called...");
    }
    Student(String name){
        this.name=name;
    }
    Student(Student s1){
        this.name=s1.name;
    }

    
}


public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Abhay"); // constructor 2 called , due to parameter
         // here, constructor is automatically called 
System.out.println(s1.name);

Student s2 =new Student(); // here is a concept of overloading so , constructor 2 is called
         
Student s3=new Student(s1);
System.out.println(s3.name);
s1.name="shivam";
System.out.println(s3.name);


//System.out.println(s3.name);
//s1.name= "shivam";

//System.out.println(s1.name);
//System.out.println(s3.name);

    }
}
