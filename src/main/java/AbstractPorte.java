public abstract class AbstractPorte implements IPorte {
    @Override
    public void open() {
        System.out.println("Porte est ouverte");
    }

    @Override
    public void close() {
        System.out.println("Porte est ferme");
    }
}
