package activities;

public class Car {
    int make, tyres, doors;
    String color, transmission;

    Car ()
    {
        tyres = 4;
        doors = 4;
    }

    public void displayCharacteristics() {

        System.out.println("Colour of the car is :" + color);
        System.out.println("Transmission of the car is "+ transmission);
        System.out.println("Year of manufacture: " + make) ;
        System.out.println("No of tyres in car is " + tyres);
        System.out.println("No of doors in car is"+ doors);}

    public void accelerate() {
        System.out.println("Car is moving forward");
            }

    public void brake() {
               System.out.println("Car has stopped");
    }




}
