package Adapter;
/*
 * @author Farra Jessica
 */
public class MallardDuck implements IDuck {
    @Override
    public void fly() {
        System.out.println("*Can Fly High (reach a height of 6400 meters)*\n");
    }

    @Override
    public void quack() {
        System.out.println("*Can Let Out a Quack*\n");
    }
}
