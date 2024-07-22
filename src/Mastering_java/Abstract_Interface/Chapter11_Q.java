package Mastering_java.Abstract_Interface;
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}
public class Chapter11_Q {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.eat();
        obj.sleep();
        obj.bite();
        obj.jump();
    }
}
