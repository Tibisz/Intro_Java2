public class Factura {
    String nrFactura;
    double valoare;
    String data;
    public Factura (String f,double v, String d){
        nrFactura=f;
        valoare=v;
        data=d;
    }
    public void afiseazaFactura(){
        System.out.println("Nr. este " + nrFactura );
        System.out.println("Valoare " + valoare + " " +"RON");
        System.out.println("Data "+data);
    }
public static void main (String[] args){
        Factura  factura1= new Factura ("L002", 150.000,"12.05.2025");
        factura1.afiseazaFactura();

}
}
