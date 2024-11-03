public class Bicycle extends Vehicle{

    String frameType;
    public Bicycle(String mk, String md, int yr, String type){
        super(mk, md, yr);

        frameType = type;
    }

    public String getVehicleInfo() {
        return "make: " + make + " model: " + model + " year: " + year + " frame type: " + frameType;
    }

    public String getFrameType(){
        return frameType;
    }
}
