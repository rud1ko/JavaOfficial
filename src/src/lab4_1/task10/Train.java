package src.lab4_1.task10;

public class Train extends Transport {
    private double fuelConsumption;

    public Train(String name, int passengerCapacity, double cargoCapacity, double speed, double fuelConsumption) {
        super(name, passengerCapacity, cargoCapacity, speed);
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public double calculateTime(double distance) {
        return distance / getSpeed();
    }

    @Override
    public double calculateCost(int passengers, double cargo, double distance) {
        double fuelCost = calculateFuelCost(distance);
        return fuelCost + (passengers * 20) + (cargo * 3);
    }

    private double calculateFuelCost(double distance) {
        return distance * fuelConsumption;
    }
}