public class Vehicle {
    String make;
    String model;
    int year;

    String[] maintenanceDates = new String[100];
    int count = 0;
    public Vehicle(String mk, String md, int yr){
        make = mk;
        model = md;
        year = yr;
    }

    public String getVehicleInfo(){
        return "make: " + make + " model: " + model + " year: " + year;
    }

    public void addMaintenanceDate(String input){
        maintenanceDates[count] = input;
        count++;
    }

    public boolean searchMaintenanceDate(String input){
        for (int i = 0; i < count; i ++){
            if(maintenanceDates[i] != null){
                if(maintenanceDates[i].equals(input)){
                    return true;
                }
            }
        }
        return false;
    }

    public void removeMaintenanceDate(String input){
        for (int i = 0; i < count; i ++){
            if(maintenanceDates[i].equals(input)){
                maintenanceDates[i] = null;
            }
        }

    }

    public String getMaintenanceDates(){
        String toReturn = "";
        for (int i = 0; i < count; i++){
            toReturn = toReturn + " " + maintenanceDates[i];
        }

        return toReturn;
    }


}
