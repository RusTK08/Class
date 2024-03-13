public class Car extends Vehicle {
    int fuelCapacity;
    int currentFuelLevel;

    public void startEngine(){
        super.startEngine();
    }
    public void stopEngine(){
        super.stopEngine();
    }
    public void accelerate(int speed){System.out.println(String.format("speed:%d", speed));}
    public void brake(){super.brake();}
    public void refuel(int liters){
        System.out.println(String.format("liters:%d", liters));}
    
    
    @Override
    public void displayinfo(){
        super.id = id;
        super.brand = brand;
        super.model = model;
        super.year = year;
        System.out.println("id: " + id + " brand: " + brand + " model: " + model + " year: " + year);}
    
    
}
