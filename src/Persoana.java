public class Persoana {
    private String nume;
    public int varsta;

    public Persoana (String n,int v) {
        nume= n;
        varsta= v;

    }
    void afiseazaDate(){
        System.out.println("Nume:"+ nume);
        System.out.println("varsta: "+ varsta);

    }
    public static void  main (String[] args ){
        Persoana p= new Persoana("ana",30);

    }
}
