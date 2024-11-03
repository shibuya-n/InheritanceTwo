public class Main {
    public static void main(String[] args){
        // Test Car
        Car myCar = new Car("Toyota", "Corolla", 2020, 30); // 30 miles per gallon
        System.out.println(myCar.getVehicleInfo());
        System.out.println("Fuel needed for 150 miles: " + myCar.calculateFuelNeeded(150) + " gallons\n");

        // Test Truck
        Truck myTruck = new Truck("Ford", "F-150", 2019, 1000); // Max load in pounds
        System.out.println(myTruck.getVehicleInfo());
        System.out.println("Is the truck overloaded with 1200 lbs? " + myTruck.isOverloaded(1200) + "\n");

        // Test Bicycle
        Bicycle myBicycle = new Bicycle("Giant", "Escape 3", 2021, "Aluminum"); // Frame type
        System.out.println(myBicycle.getVehicleInfo());
        System.out.println("Frame type: " + myBicycle.getFrameType() + "\n");

        // Test Electric Scooter
        ElectricScooter myScooter = new ElectricScooter("Segway", "Ninebot", 2022, 25, 15); // 25 miles range, 15 mph max speed
        System.out.println(myScooter.getVehicleInfo());
        System.out.println("Max range on full charge: " + myScooter.getMaxRange() + " miles");
        System.out.println("Max speed: " + myScooter.getMaxSpeed() + " mph");


        // Test adding maintenance dates
        myCar.addMaintenanceDate("01/15/24");
        myCar.addMaintenanceDate("06/10/24");

        // Test searching for maintenance dates
        System.out.println("Date 01/15/24 exists: " + myCar.searchMaintenanceDate("01/15/24"));

        // Test removing a maintenance date
        myCar.removeMaintenanceDate("01/15/24");
        System.out.println("Date 01/15/24 exists: " + myCar.searchMaintenanceDate("01/15/24"));

        // Test adding maintenance dates for Truck
        myTruck.addMaintenanceDate("02/01/24");
        myTruck.addMaintenanceDate("07/12/24");
        System.out.println("Truck maintenance dates: " + myTruck.getMaintenanceDates());

        // Test searching for maintenance dates for Truck
        System.out.println("Date 02/01/24 exists: " + myTruck.searchMaintenanceDate("02/01/24"));

        // Test removing a maintenance date for Truck
        myTruck.removeMaintenanceDate("02/01/24");
        System.out.println("Date 02/01/24 exists: " + myTruck.searchMaintenanceDate("02/01/24") + "\n");

        // Test adding maintenance dates for Bicycle
        myBicycle.addMaintenanceDate("03/05/24");
        myBicycle.addMaintenanceDate("09/20/24");
        System.out.println("Bicycle maintenance dates: " + myBicycle.getMaintenanceDates());

        // Test searching for maintenance dates for Bicycle
        System.out.println("Date 03/05/24 exists: " + myBicycle.searchMaintenanceDate("03/05/24"));

        // Test removing a maintenance date for Bicycle
        myBicycle.removeMaintenanceDate("03/05/24");
        System.out.println("Date 03/05/24 exists: " + myBicycle.searchMaintenanceDate("03/05/24") + "\n");

        // Test adding maintenance dates for Electric Scooter
        myScooter.addMaintenanceDate("04/15/24");
        myScooter.addMaintenanceDate("10/11/24");
        System.out.println("Electric Scooter maintenance dates: " + myScooter.getMaintenanceDates());

        // Test searching for maintenance dates for Electric Scooter
        System.out.println("Date 04/15/24 exists: " + myScooter.searchMaintenanceDate("04/15/24"));

        // Test removing a maintenance date for Electric Scooter
        myScooter.removeMaintenanceDate("04/15/24");
        System.out.println("Date 04/15/24 exists: " + myScooter.searchMaintenanceDate("04/15/24"));
    }
}
