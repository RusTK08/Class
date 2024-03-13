public class Aircraft extends Vehicle implements Flyable{
    int maxAltitude;
    boolean isFlying;
    public void startEngine(){super.startEngine();}
    public void stopEngine(){super.stopEngine();}
    @Override
    public void takeOff(){System.out.println("Взлет совершен" + " " + isFlying  + " " + maxAltitude);}
    @Override
    public void land(){System.out.println("Посадка совершена" + " " + isFlying);}
    @Override
    public void displayinfo(){
        super.id = id;
        super.brand = brand;
        super.model = model;
        super.year = year;
        System.out.println("id: " + id + " brand: " + brand + " model: " + model + " year: " + year);}
    
}
