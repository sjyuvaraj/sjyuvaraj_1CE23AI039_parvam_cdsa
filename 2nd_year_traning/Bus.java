public class Bus extends Vehicle {
    String name, state;
   
    public Bus(){
        name = "-";
        state = "-";
    }


    public Bus(String name, String state){
        this.name = name;
        this.state = state;
    }


    public void showDetails(){
        System.out.println("Bus Details are as Follows:");
        System.out.println("Name of the Bus: " + name);
        System.out.println("State: " + state);
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
        System.out.println("Wheels: " + no_of_wheels);
    }
}
