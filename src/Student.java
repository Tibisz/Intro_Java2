public class Student { //clasa
    String nume;
    int varsta;
    public Student (String n, int v){ //constructor
        nume = n ;
        varsta = v;

    }
    public void afiseaza(){
        System.out.println(nume + " are " + varsta + " de ani.");

    }
    public static void main (String[] args) {
        Student s = new Student(" Ana ",23);
        s.afiseaza();
    }
    }
