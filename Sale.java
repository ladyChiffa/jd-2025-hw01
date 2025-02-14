public class Sale extends Deal {
    public Sale (String product, int price) {
        super("Продажа " + product + " на " + price + " руб.", price, 0);
    }
}
