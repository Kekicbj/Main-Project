package IfElseIfElse;

public class IfElseIfElse {
    public static void main(String[] args) {
        int speed = 50;
        if (speed<10) {
            System.out.println("Too Slow..");
        }else if (speed <= 80){
            System.out.println("Regular Speed");
        }else if (speed < 100) {
            System.out.println("Too Fast");
        }else {
            System.out.println("Inncorect Value");
        }
    }
}
