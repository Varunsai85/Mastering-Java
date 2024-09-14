package Mastering_java;
class Clothing{
    String size;
}
public class New {
    public static void main(String[] args) {
        Clothing c1=new Clothing();
        int measurement=1;
        switch(measurement){
            case 1,2,3:
                c1.size="s";
                break;

            default:
                c1.size="X";
                break;
        }
        System.out.println(c1.size);
    }
}
