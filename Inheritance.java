class Animal{
    String name;
    void eat(){
        System.out.println("eats");

    }
}

    class Fish extends Animal{
        int fins;
        void swim(){
            System.out.println("fish is swimming in water");
        }
    }

    class Seahorse extends Fish
    {
    void species() {
      System.out.println("king of sea");
    }  
    }



public class Inheritance {
    public static void main(String[] args) {
     Fish neemo = new Fish();

    neemo.eat(); // inherit parent methods
    neemo.name= "Blueone"; // inherit parent variable
    System.out.println(neemo.name);

    Seahorse s1= new Seahorse();
    s1.eat();

        
    }
}
