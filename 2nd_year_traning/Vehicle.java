public class Vehicle {
    String type, fuel;
    int no_of_wheels;


    public Vehicle(){
        type = "-";
        fuel = "-";
        no_of_wheels = 0;
    }


    public void setVehicleDetails(String type, String fuel, int no_of_wheels){
        this.type = type;
        this.fuel = fuel;
        this.no_of_wheels = no_of_wheels;
    }


    public void start(){
        System.out.println("Vehicle Started");
    }
}
