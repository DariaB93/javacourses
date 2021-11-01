package lesson9;

public class Truck extends Vehicle {

    private int maxLoad;
    private int currentLoad;

    public Truck(double tankVolume, double petrolAmount, int maxLoad, int currentLoad) {
        super(tankVolume, petrolAmount);
        this.maxLoad = maxLoad;
        this.currentLoad = currentLoad;
    }


    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(int currentLoad) {
        this.currentLoad = currentLoad;
    }

    @Override
    public void arrive() {
        super.arrive();
        Base.goods_on_base += currentLoad;
    }

    @Override
    public boolean leave() {
        if (!canLeaveVehicle()) {
            return false;
        }
        Base.people_on_base--;
        Base.vehicles_on_base--;
        Base.petrol_on_base = Base.petrol_on_base - (getTankVolume() - getPetrolAmount());

        if (Base.goods_on_base >= (maxLoad - currentLoad)) {
            Base.people_on_base -= maxLoad - currentLoad;
            currentLoad = maxLoad;
        } else {
            currentLoad += Base.people_on_base;
            Base.goods_on_base = 0;
        }
        return true;
    }

}