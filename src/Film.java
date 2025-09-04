public class Film {
    String titlu;
    int rating;

    public Film (String t, int r){
        titlu = t;
        rating = r;

}
public void afiseaza (){
        System.out.println(titlu +  rating);
}
public static void main (String[] args){
      Film f = new Film("Betmen", 3);
              f.afiseaza();
}

}
