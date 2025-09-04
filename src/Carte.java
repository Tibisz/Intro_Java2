public class Carte {
    String titlu;

    public Carte (String titlu){//this.
        this.titlu= titlu;

    }
    void afiseazaDate(){
        System.out.println("titlu cartii: " + titlu);

    }
    public static void  main (String[] args) {
        Carte c = new Carte ("Harap Alb");
        c.afiseazaDate();
    }
}
