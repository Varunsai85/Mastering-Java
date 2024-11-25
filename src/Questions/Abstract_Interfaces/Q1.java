package Questions.Abstract_Interfaces;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    @Override
    void write(){
        System.out.println("Writing");
    }
    @Override
    void refill(){
        System.out.println("Refilling");
    }

    void changeNib(){
        System.out.println("Changing the Nib");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Pen p=new FountainPen();
        p.refill();
        p.write();
    }
}
