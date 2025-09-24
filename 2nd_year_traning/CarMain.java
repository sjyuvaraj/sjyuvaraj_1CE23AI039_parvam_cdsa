
public class CarMain{
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "Tata Punch";
        car1.fuel = "Petrol";
        // car1.price = 549999.00;
        // car1.brand= "Tata";
        car1.setBrand("Tata");
        car1.setPrice(549999.00);
        System.out.println("Car Details are as follows:");
        System.out.println("Name of the Car: " + car1.name);
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Fuel Type: " + car1.fuel);
        System.out.println("Offer Price: " + car1.getPrice());
    }
}