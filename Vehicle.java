public abstract class Vehicle {
    int id;
    String brand;
    String model;
    int year;

    public void startEngine(){
        System.out.println("Запуск двигателя");
    }
    public void stopEngine(){
        System.out.println("Стоп двигателя");
    }
    public void accelerate(int speed){
        System.out.println("Скорость увеличиться на " + speed);
    }
    public void brake(){
        System.out.println("Прекращение движения");
    }
    public abstract void displayinfo();

}
