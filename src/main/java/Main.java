public class Main {
    public static void main(String[] args) {

        //***  Porte   ***/
        AbstractPorte porteEtab = new Porte();
        porteEtab.open();
        porteEtab.close();

        //***  Porte Securise   ***/
        IPorteSecurise porteSecurise = new PorteSecurise(porteEtab);
        porteSecurise.open();
        porteSecurise.close();
        porteSecurise.genererAlerte();



        /***************************************************/

    }
}
