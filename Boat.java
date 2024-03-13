public class Boat extends Vehicle implements Swimmable{
    int maxSpeed;
    boolean isSailing;
    public void startEngine(){super.startEngine();}
    public void stopEngine(){super.stopEngine();};
    @Override
    public void startSwimming(){System.out.println("Поплыли");}
    @Override
    public void stopSwimming(){System.out.println("Доплыли");}
    @Override
    public void displayinfo(){
        super.id = id;
        super.brand = brand;
        super.model = model;
        super.year = year;
        System.out.println("id: " + id + " brand: " + brand + " model: " + model + " year: " + year);}
    
}
