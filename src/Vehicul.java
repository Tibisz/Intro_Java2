public class Vehicul {
    protected int viteza;
    protected  void afiseazaViteza(){
        System.out.println("viteza:" + viteza + "km/h");
    }
    public static void main (String[] args){
        Vehicul v = new Vehicul();
        v.viteza= 50;
        v.afiseazaViteza();
    }
}
