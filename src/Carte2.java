public class Carte2 {
    String titlu;
    String autor;
    int numarPagini;

    void descriereCarte2() {
        System.out.println("Titlul: " + titlu);
        System.out.println("Autor: " + autor);
        System.out.println("Număr pagini: " + numarPagini);

    }

    public static void main(String[] args) {
        Carte2 c2 = new Carte2();
        c2.titlu = "bazatu";
        c2.autor = "barbar de mic";
        c2.numarPagini = 2;
        c2.descriereCarte2();


    }
}

