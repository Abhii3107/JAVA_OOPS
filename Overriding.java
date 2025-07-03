class Animal{
    void eat(){
        System.out.println("eat animal");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}

public class Overriding { // both parent class and child class contain same function with different definition 
    public static void main(String[] args) {
        Deer d1= new Deer();
        d1.eat(); // if i calling whith child class object then child class method will call
    
    
}
}
