package Adapter;
/*
 * @author Farra Jessica
 */
public class MainClass {
    public static void main(String[] args) {
        IDuck mallardDuck = new MallardDuck();
        System.out.println("Are the mallard duck can fly?");
        mallardDuck.fly();
        System.out.println("Are the mallard duck can let out a quack?");
        mallardDuck.quack();

        ITurkey turkey = new RoyalPalmTurkey();
        System.out.println("Are turkeys can make a gobble noise?");
        turkey.gobble();
        System.out.println("Are turkeys can fly?");
        turkey.fly();

        IDuck duck = new TurkeyAdapter(turkey);
        System.out.println("So, what happen if there is an adapter between the duck and the turkey?\n");
        duck.quack();
        duck.fly();
    }
}