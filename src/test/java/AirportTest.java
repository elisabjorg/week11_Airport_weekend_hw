import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    private Airport airport;
    private Plane plane;
    private Flight flight;
    private Ticket ticket;
    private Passenger passenger;

    @Before
    public void before() {
        airport = new Airport("KEF");
        plane = new Plane(Capacity.BOEING767, "Icelandair");
        flight = new Flight(plane, 140, "Reykjavik");
        ticket = new Ticket();
        passenger = new Passenger();
    }

     @Test
     public void canCreateFlight(){
            airport.createFlight(plane, 44, "Edinburgh");
            assertEquals(1, airport.getFlightCount());
        }

      @Test
     public void assignPlaneToFlight() {

      }


    }

