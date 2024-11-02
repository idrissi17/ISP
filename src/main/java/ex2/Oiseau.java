package ex2;

public class Oiseau  implements IAnimal,IAnimalVoler{
    @Override
    public void voler() {
        System.out.println("je vole");
    }

    @Override
    public void marcher() {
        System.out.println("je marche et meme nager");

    }

    @Override
    public void manger() {
        System.out.println("je mange des graines");

    }

    @Override
    public void boire() {
        System.out.println("je bois quelques gouttes d'eau");

    }
}
