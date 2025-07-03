class Student{
    int marks[];

  Student(Student s1){
   
    this.marks=s1.marks;
    }
Student(){
  System.out.println("defaultconstructor is called...");
  marks= new int[3]; // intialize marks , When you create an object s1 using the default constructor, marks remains uninitialized, leading to a NullPointerException when you try to assign values to s1.marks[0], s1.marks[1], etc.
}
    


}

public class Shallowcopy{
    public static void main(String[] args) {
        Student s1= new Student(); // if i dont create default constructor then during creation s1 it throws error(Non paramitized)
        
        s1.marks[0]=97;
        s1.marks[1]=98;
        s1.marks[2]=99;

        Student s2= new Student(s1);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        
            s1.marks[2]=3;
            for(int j=0;j<3;i++){
           System.out.println(s2.marks[j]);}
       
        }
    
    }
}
