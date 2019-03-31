import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;
    private Passenger passenger;

    @Before
    public void before(){
        plane = new Plane(Capacity.BOEING767, "Icelandair");
        passenger = new Passenger();
    }

    @Test
    public void getPassengersCount(){
        plane.addPassenger(passenger);
        assertEquals(1, plane.getPassengerCount());
    }

    @Test
    public void getCapacity(){
        assertEquals(100, plane.getcapacity());
    }


}
