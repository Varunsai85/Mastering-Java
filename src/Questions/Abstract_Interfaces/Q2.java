package Questions.Abstract_Interfaces;

class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Eating");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Human h=new Human();
        h.sleep();
        h.jump();
        h.eat();
    }
}
