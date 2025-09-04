class MasinaElectrica {


    public void calculeazaAutonomie(int nivelBaterie) {
        int autonomie = nivelBaterie * 5;
        System.out.println("Autonomie estimată: " + autonomie + " km");

        if (nivelBaterie < 20) {
            System.out.println("Avertisment: Nivelul bateriei este sub 20%!");
        }
    }


    public static void main(String[] args) {
        MasinaElectrica masina = new MasinaElectrica();

        masina.calculeazaAutonomie(19);

    }
}