

class Pen{
    int tip;
    String color;

    public void setTip(int tip) {
        this.tip = tip;
    }

    public void setColor(String color) {// this color is local variable so it is differenet fromm upper one
        this.color = color;
    }

    public int getTip() {
        return this.tip;
    }

    public String getColor() {
        return this.color;
    }



}


public class Getset {
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.setTip(9);
        System.out.println(p1.getTip());

        p1.tip=10;
        System.out.println(p1.getTip());
    }
   
    
}
