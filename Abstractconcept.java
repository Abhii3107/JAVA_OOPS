public class Abstractconcept {  // 1st concept Abstract class
    public static void main(String[] args) {
        Chicken loppy = new Chicken();
    loppy.walk();
    }// mtlb ye ek idea de deta hai , baki class ko yh cheez implement krin hai ( those classes who inherit this class)
    //Animal a1= new Animal();  here it show animal is abstract class , you cannot make its instances

    
}

abstract class Animal{
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}
class Horse extends Animal{ // if it inherit abstract class then it must have abstract method of abstract classes9Implementation) means walk func is must in it
void walk(){
 System.out.println("horse walks on 4legs");
}
}
class Chicken extends Animal{
    void run(){
        System.out.println("run fastly");
    }
   
void walk(){
System.out.println("walk on 2 legs");
    }
    }


