public class Produs {
    final String codProdus;

    //Constructor
    public Produs (String cod){
        this.codProdus = cod;
    }
    //Method
    public void afiseazaDetalii(){
        System.out.println("Cod produs: " + codProdus);
    }
    public static void main (String[] args) {

       /* Produs p1 = new Produs ("Tigari12");
        p1.afiseazaDetalii();
        p1.codProdus = "Tigari13"; */
    }
}
