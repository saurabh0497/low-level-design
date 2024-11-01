public abstract class Vehicle {
    protected Arraylist<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();
    protected String licensePlate;
    protected int spotsNeeded;
    protected VehicleSize size;

    public abstract boolean canFitInSpot(ParkingSpot spot);
    public abstract void print();



    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public VehicleSize getSize() {
        return size;
    }

    public void parkInSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }
    public void clearSpots() {
        for (int i = 0; i < parkingSpots.size(); i++) {
            parkingSpots.get(i).removeVehicle();

        }
        parkingSpots.clear();
    }


}