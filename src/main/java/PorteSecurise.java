public class PorteSecurise implements IPorteSecurise {

    AbstractPorte porte;

    public PorteSecurise(AbstractPorte porte) {
        this.porte = porte;
    }

    public void setPorte(AbstractPorte porte) {
        this.porte = porte;
    }

    @Override
    public void genererAlerte() {
        System.out.println("Alerte");
    }


    @Override
    public void open() {
        porte.open();
    }

    @Override
    public void close() {
        porte.close();
    }
}
