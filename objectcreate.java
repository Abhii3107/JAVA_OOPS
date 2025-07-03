public class objectcreate
{
    public static void main(String args[]){
    // creating a Object of class Pen , ex- P1
    Pen p2= new Pen();

    Pen p1 = new Pen();
   
    //set a color of p1
    p1.setcolor("blue");
    System.out.println(p1.color);

    //set a tip 
    p1.settip(5);
    System.out.println(p1.tip);

    // direct we can assign
    p1.color="red";
    System.out.println(p1.color);
}

// make these classes and its properties and their methods9function) first then go into public class{main method}
// both are in seprate paranthesis

   }   // creating a class - pen
class Pen{
  //pen attributes(properties)
    int tip;
    String color;

//pen Function(behaviors)
    void settip(int newtip){
        tip = newtip; 
    }
    void setcolor(String newcolor){
        color= newcolor;
    }

}


