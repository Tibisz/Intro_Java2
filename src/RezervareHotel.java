public class RezervareHotel {
    String numeClient;
    String tipCamera;

    //Constructor 1

    public RezervareHotel(String numeClient){
        this.numeClient = numeClient;
        this.tipCamera = "standard";
        System.out.println("Rezervare: " + numeClient + ", cameră: " + tipCamera);
    }
    //Constructor 2

    public RezervareHotel(String numeClient, String tipCamera){
        this.numeClient = numeClient;
        this.tipCamera = tipCamera;
        System.out.println("Rezervare: " + numeClient + ", cameră: " + tipCamera);

    }
    public static void main (String[] args) {
        RezervareHotel r1 = new RezervareHotel ("Ruben");
        RezervareHotel r2 = new RezervareHotel ("Raul", "Delux");
    }
}
