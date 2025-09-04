//Creează o clasă ContBancar cu atribut private double sold. Creează metode depunere(), retragere() și verificaSold(). Afișează un mesaj dacă retragerea e mai mare decât soldul.
//

public class ContBancar {
    private double sold;


    public ContBancar(double soldInitial) {
        sold = soldInitial;
    }


    public void depunere(double suma) {
        sold += suma;
    }


    public void retragere(double suma) {
        if (suma > sold) {
            System.out.println("suma e mai mare decat soldul");
        } else {
            sold -= suma;
        }
    }


    public void verificaSold() {
        System.out.println("Soldul curent este: " + sold);
    }


    public static void main(String[] args) {
        ContBancar cont = new ContBancar(300);

        cont.retragere(301);
        cont.verificaSold();
    }
}
