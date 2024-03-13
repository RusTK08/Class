public class Main{
    public static void main(String[] args) {
        Car car = new Car();
        car.fuelCapacity = 50;
        car.currentFuelLevel = 10;
        car.id = 1;
        car.brand = "Porshe";
        car.model = "Cayen S";
        car.year = 2015;
        int liters = car.fuelCapacity - car.currentFuelLevel;
        int speed = 40;
        car.startEngine();
        car.accelerate(speed);
        car.brake();
        car.stopEngine();
        car.refuel(liters);
        car.displayinfo();
        Aircraft aircraft = new Aircraft();
        aircraft.id = 2;
        aircraft.brand = "Ту";
        aircraft.model = "134";
        aircraft.year = 2012;
        aircraft.startEngine();
        aircraft.isFlying = true;
        aircraft.maxAltitude = 1000;
        aircraft.takeOff();
        aircraft.isFlying = false;
        aircraft.land();
        aircraft.stopEngine();
        aircraft.displayinfo();
        Boat boat = new Boat();
        boat.id = 3;
        boat.brand = "Метеор";
        boat.model = "Вариант 1";
        boat.year = 2000;
        boat.startEngine();
        boat.startSwimming();
        boat.stopSwimming();
        boat.stopEngine();
        boat.displayinfo();
    }
    
}
