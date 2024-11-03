public class Truck extends Vehicle {

    int maxLoad;
    public Truck (String mk, String md, int yr, int max){
        super(mk, md, yr);

        maxLoad = max;

    }

    public boolean isOverloaded(int lbs){
        return lbs > maxLoad;

    }

    public String getVehicleInfo(){
        return "make: " + make + " model: " + model + " year: " + year + " max load:" + maxLoad;
    }
}
