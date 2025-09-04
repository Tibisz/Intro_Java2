public class Contor {
    static int totalObiecte = 0 ;

    //Constructor
    public Contor(){
        totalObiecte ++;
    }
    public static void afiseazaTotal(){
        System.out.println("total obiecte create: " + totalObiecte);

    }
    //Main
    public static void main (String[] args){
        Contor c1 = new Contor();
        Contor c2 = new Contor();
        Contor c3 = new Contor();
        Contor c4 = new Contor();

        Contor.afiseazaTotal();

    }
}
