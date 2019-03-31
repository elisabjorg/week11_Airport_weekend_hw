

import java.util.ArrayList;

public class Plane {
    private Capacity capacity;
    private String airline;
    private ArrayList<Passenger> passengers;

    public Plane(Capacity capacity, String airline) {
        this.capacity = capacity;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }


    public int getPassengerCount(){
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public int getcapacity(){
        return this.capacity.getValue();
    }

}
