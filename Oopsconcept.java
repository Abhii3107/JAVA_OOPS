class Pen{
    int tip;  // tip and color is instance variable
    String color;
    static int price =10; // non -Instance variable, it is static so , it will be fix for all object , let further we change 10 to 20 , so 20 will remains for all object now
                          //Static variables belong to the class, not to individual instances.
                          // it can be access without instance of class(object) , directly by class name - Pen.price = 20;

    void settip(int newtip){
        tip = newtip;
    }
    void setcolor(String newcolor){
        color = newcolor;
    }
}


class Oopsconcept
{
public static void main(String[] args) {
    Pen p1 = new Pen();
    
    //System.out.println(p1.price);

    p1.setcolor("blue");
     System.out.println(p1.color);

     Pen p2 = new Pen();
     p2.settip(4);
     System.out.println(p2.tip);

     p1.color = "red";   // directly updates the color instance variable for p1.
     System.out.println(p1.color);





}
}