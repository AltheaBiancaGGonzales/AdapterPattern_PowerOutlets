public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        Refrigerator fridge = new Refrigerator();
        SmartphoneCharger phoneCharger = new SmartphoneCharger();


        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet fridgeAdapter = new RefrigeratorAdapter(fridge);
        PowerOutlet phoneAdapter = new SmartphoneAdapter(phoneCharger);


        laptopAdapter.plugIn();  // Output: Laptop is charging.
        fridgeAdapter.plugIn();  // Output: Refrigerator is cooling.
        phoneAdapter.plugIn();   // Output: Smartphone is charging.
    }
}
