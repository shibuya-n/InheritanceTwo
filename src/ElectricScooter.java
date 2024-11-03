public class ElectricScooter extends Vehicle{

    int maxRange;
    int maxSpeed;

    public ElectricScooter(String mk, String md, int yr, int range, int max){
        super(mk, md, yr);

        maxRange = range;
        maxSpeed = max;
    }


    public int getMaxRange(){
        return maxRange;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }

    public String getVehicleInfo(){
        return "make: " + make + " model: " + model + " year: " + year + " range: " + maxRange  + " max speed: " + maxSpeed;
    }
}
