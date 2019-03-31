import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class FlightTest {

        private Flight flight;
        private Plane plane1;
        private Plane plane2;


        @Before
        public void before() {
            plane1 = new Plane(Capacity.AIRBUS310, "RyanAir");
            plane2 = new Plane(Capacity.BOEING767, "Icelandair");
            flight = new Flight(plane1, 140, "Reykjavik");
        }

        @Test
        public void canGetPlane(){
            plane1 = flight.getPlane();
            assertEquals(plane1, flight.getPlane());
        }

        @Test
        public void canGetFlightNumber() {
            assertEquals(140, flight.getFlightNumber());
        }

        @Test
        public void getDestination() {
            assertEquals("Reykjavik", flight.getDestination());
        }

    }



