public class Animal {//Polimorfism overide
    public void sunet(){
        System.out.println("Animalul scoate un sunet");
    }

}

class Caine extends Animal {
    @Override
    public void sunet() {
        System.out.println("Cainele latra.");
    }

}

class Pisica extends Animal {
    @Override
    public void sunet() {
        System.out.println("Pisica miauna.");
    }
}

 class Polimorfism{

    public static void main (String[] args){
        Animal a1 = new Caine();
        Animal a2 = new Pisica();

        a1.sunet();
        a2.sunet();
    }
}
