import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class FlightManagement {
    List<Flight> flights = new ArrayList<>();

    // Add a flight
    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    // Remove a flight by flight number
    public void removeFlight(String flightNumber) {
        flights.removeIf(flight -> flight.getFlightNumber().equals(flightNumber));
    }

    // Search by flight number using linear search
    public Flight searchFlightByNumber(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                return flight;
            }
        }
        return null;
    }

    // Search by airline name using linear search
    public Flight searchFlightByAirline(String airlineName) {
        for (Flight flight : flights) {
            if (flight.getAirlineName().equals(airlineName)) {
                return flight;
            }
        }
        return null;
    }

    // Sort flights by airline name using Merge Sort
    public void sortFlightsByAirline() {
        Collections.sort(flights, Comparator.comparing(Flight::getAirlineName));
    }

    // Sort flights by flight number using Merge Sort
    public void sortFlightsByNumber() {
        Collections.sort(flights, Comparator.comparing(Flight::getFlightNumber));
    }

    // Print all flights
    public void printFlights() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}
