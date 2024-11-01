public class ParkingSpot {
    private Vehicle vehicle;

    public VehicleSize getSpotSize() {
        return spotSize;
    }

    public int getRow() {
        return row;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    private VehicleSize spotSize;
    private int row;
    private int spotNumber;

    private Level level;

    public ParkingSpot(Level level, int r, int n, VehicleSize sz){
        this.level = level;
        row = r;
        spotNumber = n;
        spotSize = sz;
    }
    public boolean isAvailable() {
        return vehicle == null;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return isAvailable() && vehicle.canFitInSpot(this);
    }
    public boolean park(Vehicle vehicle) {
        if (!canFitVehicle(vehicle)) {
            return false;
        }
        this.vehicle = vehicle;
        vehicle.parkInSpot(this);
        return true;
    }

    public void removeVehicle() {
        level.spotFreed();
        vehicle = null;
    }
    public void print(){
        if (vehicle == null) {
            if (spotSize == VehicleSize.Compact) {
                System.out.println("c");
            } else if (spotSize == VehicleSize.Large) {
                System.out.println("l");
            } else if (spotSize == VehicleSize.Motorcycle) {
                System.out.println("m");
            }
        } else {
            vehicle.print();
        }
    }
}
