public class Angajat {
    String nume;
    String functie;
    double salariu;

    //constructor

    public Angajat (String nume, String functie, double salariu){
        this.nume = nume;
        this.functie = functie;
        this.salariu = salariu;
    }
    //metoda pt calcul bonus

    public void calculeazaBonus() {
        double bonus;

        if (functie.equals("Manager")) {
            bonus = salariu * 0.10;
        } else {
            bonus = salariu * 0.05;
        }

        double salariuTotal = salariu + bonus;

        System.out.println("Salariul  " + nume + " " + functie + " " +" este: " + salariuTotal);
    }
    public static void main(String[] args) {
        Angajat a1 = new Angajat("Ana", "Manager", 5000);
        Angajat a2 = new Angajat("Ion", "programator", 5000);
        a1.calculeazaBonus();
        a2.calculeazaBonus();
    }

}
