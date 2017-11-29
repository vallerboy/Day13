public class Starter {
    public static void main(String[] args) {
        Shop shop = new Shop("C:\\asd\\zakupy.txt");

        System.out.println("Babciu, tyle zaplacisz: " + shop.countFullPrice());
        System.out.println("To maksymalna cena: " + shop.getMaximumPrice());
        System.out.println("Popularny produkt: " + shop.getMostAmountProduct().getName());
    }
}
