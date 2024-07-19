package Mastering_java.OOPs;
interface Bycycle{
    int applybrake(int decrement);
    int speedup(int increment);
}
interface Honking{
    void blowhorn();
}

class HeroCycle implements Bycycle,Honking{
    int speed=10;
    HeroCycle(){
        System.out.println("Im the constructor of this Hero cycle class");
    }
    public int applybrake(int decrement){
        return speed-=decrement;
    }
    public int speedup(int increment){
        return speed+=increment;
    }
    public void blowhorn(){
        System.out.println("Peeee peeeeee");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        HeroCycle Varun=new HeroCycle();
        System.out.println(Varun.speedup(7));
        System.out.println(Varun.applybrake(2));
        Varun.blowhorn();
    }
}
