public class TestFlowerBasket {
    static void main() {
        Flower flower = new Flower("pink","rose",1.5);
        Bouquet bouquet = new Bouquet("Valentine's Day",flower,13);

        System.out.println("Cost of the bouquet: " + bouquet.getCost());
    }
}
