package src.main.java.homework1;

public class Main {
    public static void main(String[] args) {

        HotDrink hotTeaSmall = new HotTea("Earl Grey", 99, 180, 80);
        HotDrink hotCoffeeMedium = new HotCoffee("Lavazza", 149, 250, 75);
        HotDrink hotChocolateLarge = new HotChocolate("DeMarco", 199, 380, 70);

        VendingMachine hotDrinksVending = new HotDrinksVendingMachine();

        hotDrinksVending.addProduct(hotTeaSmall);
        hotDrinksVending.addProduct(hotCoffeeMedium);
        hotDrinksVending.addProduct(hotChocolateLarge);

        System.out.println(hotDrinksVending.getProduct("Lavazza"));
        System.out.println(hotDrinksVending.getProduct("DeMarco", 380, 70));
    }
}
