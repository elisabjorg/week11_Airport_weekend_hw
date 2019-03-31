import java.util.ArrayList;

public class Airport {
    private String airportCode;
    private ArrayList<Plane> hangar;
    private ArrayList<Flight> flights;
    private ArrayList<Ticket> tickets;

    public Airport(String airportCode) {
        this.airportCode = airportCode;
        this.hangar = new ArrayList<>();
        this.flights = new ArrayList<>();
        this.tickets = new ArrayList<>();
    }

    public void createFlight(Plane plane, int flightNumber, String destination){
        Flight flight = new Flight(plane, flightNumber, destination);
        this.flights.add(flight);
    }

    public int getFlightCount(){
        return this.flights.size();
    }
}