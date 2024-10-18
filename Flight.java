class Flight {
    String flightNumber;
    String airlineName;
    String source;
    String destination;

    public Flight(String flightNumber, String airlineName, String source, String destination) {
        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.source = source;
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirlineName() {
        return airlineName;
    }

    @Override
    public String toString() {
        return "Flight " +
                "flightNumber='" + flightNumber + '\'' +
                ", airlineName='" + airlineName + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ' ';
    }
}
