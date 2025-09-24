public class BusMain {
    public static void main(String[] args){
        Bus bus1 = new Bus("VRL Travels", "Karnataka");
        bus1.setVehicleDetails("Private", "Diesel", 6);
        bus1.showDetails();
        bus1.start();


        Bus bus2 = new Bus("BMTC", "Karnataka");
        bus2.setVehicleDetails("Government", "EV", 6);
        bus2.showDetails();
        bus2.start();
    }
}
