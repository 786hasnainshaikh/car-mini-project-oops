import java.util.Scanner;

public abstract class vehicale {
    String name;
    int speed;
    int direction;
    public void getname(String name){
        this.name=name;
        System.out.println("vehivale name is "+ name);
    }
    public abstract void move(int speed , int direction);
    public abstract void steer(int direction);
}




