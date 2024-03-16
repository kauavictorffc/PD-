public class Main {
    public static void main(String[] args) {
        Factory clothingFactory = new ClothingFactory();
        Clothing clothing = clothingFactory.createClothing();
        clothing.produce();

        Factory electronicFactory = new EletroFactory();
        Eletro electronic = electronicFactory.createEletro();
        electronic.manufacture();
    }
}
