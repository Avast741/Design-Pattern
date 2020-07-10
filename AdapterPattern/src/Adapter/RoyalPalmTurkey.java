package Adapter;
/*
 * @author Farra Jessica
 */
public class RoyalPalmTurkey implements ITurkey {
    @Override
    public void fly() {
        System.out.println("*Can't Fly High*\n");
    }

    @Override
    public void gobble()
    {
        System.out.println("*Can Make a Gobble Noise*\n");
    }
}
