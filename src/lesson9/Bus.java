package lesson9;

public class Bus extends Vehicle{
    private int peopleCount;
    private int maxPeople;

    public Bus(){

    }

    public Bus(double tankVolume, double petrolAmount, int peopleCount, int maxPeople) {
        this.peopleCount = peopleCount;
        this.maxPeople = maxPeople;
        this.setPetrolAmount(petrolAmount);
        this.setTankVolume(tankVolume);
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    @Override
    public void arrive() {
        Base.people_on_base++;
        Base.vehicles_on_base++;
        Base.people_on_base = Base.people_on_base + peopleCount;
    }

    @Override
    public boolean leave() {
        if (!canLeaveVehicle()) {
            return false;
        }
        Base.people_on_base --;
        Base.vehicles_on_base --;
        Base.petrol_on_base = Base.petrol_on_base - (getTankVolume() - getPetrolAmount());

        if (Base.people_on_base >= maxPeople - peopleCount){
            Base.people_on_base -= maxPeople - peopleCount;
            peopleCount = maxPeople;
        }else {
            peopleCount += Base.people_on_base;
            Base.people_on_base= 0;
        }
        return true;
    }

}
