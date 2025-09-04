public class masina {
    String marca;
    int an;

    public masina() {  //constructor
        marca = "Mercedes";
        an = 2000;

    }
    public void afiseazaMarca(){
        System.out.println("marca masini este : " + marca + " an "+ an);
    }
    public static void main (String[] args ) {
        masina m= new  masina();
        m.afiseazaMarca();
    }
}
