import java.util.ArrayList;

public class Airport {
    private String airportCode;
    private ArrayList<Plane> hanger;
    private ArrayList<Flight> flights;
    private ArrayList<Ticket> tickets;

    public Airport(String airportCode) {
        this.airportCode = airportCode;
        this.hanger = new ArrayList<>();
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

    public int getPlaneCount(){
        return this.hanger.size();
    }

    public Plane assignPlaneToFlight(Plane plane, Flight flight){
        this.hanger.remove(plane);
        flight.getPlane();
        return plane;
    }

    public int getTicketCount(){
        return this.tickets.size();
    }

    public Ticket sellTicket(Ticket ticket){
        this.tickets.remove(ticket);
        return ticket;

    }

    public boolean canSellTickets(Flight flight, Ticket ticket){
        if(flight.getPlane().getcapacity() > flight.getPlane().getPassengerCount()){
            this.sellTicket(ticket);
            return true;
        }
        return false;
    }




}