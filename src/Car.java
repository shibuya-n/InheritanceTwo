public class Car extends Vehicle{

    int milesPerGallon;
    public Car(String mk, String md, int yr, int mpg) {
        super(mk, md, yr);

        milesPerGallon = mpg;
    }

    public double calculateFuelNeeded(int miles){
        return (double) milesPerGallon/miles;
    }

    public String getVehicleInfo(){
        return "make: " + make + " model: " + model + " year: " + year + " mpg: " + milesPerGallon;
    }

}
