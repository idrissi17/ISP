package ex2;

public class Lion implements IAnimal{

    @Override
    public void marcher() {
        System.out.println("je marche");

    }

    @Override
    public void manger() {
        System.out.println("je mange");

    }

    @Override
    public void boire() {
        System.out.println("je boire");

    }
}
