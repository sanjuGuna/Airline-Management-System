import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlightManagement flightManagement = new FlightManagement();  // Initializing flight management system
        Scanner scanner = new Scanner(System.in);  // For user input
        boolean running = true;  // To keep the program running

        while (running) {
            // Display menu
            System.out.println("\n--- Flight Management System ---");
            System.out.println("1. Add Flight");
            System.out.println("2. Remove Flight");
            System.out.println("3. Search Flight by Number");
            System.out.println("4. Search Flight by Airline");
            System.out.println("5. Sort Flights by Airline");
            System.out.println("6. Sort Flights by Flight Number");
            System.out.println("7. Print All Flights");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt(); 
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    // Adding a flight
                    System.out.print("Enter flight number: ");
                    String flightNumber = scanner.nextLine();  

                    System.out.print("Enter airline name: ");
                    String airlineName = scanner.nextLine();  

                    System.out.print("Enter source: ");
                    String source = scanner.nextLine();  

                    System.out.print("Enter destination: ");
                    String destination = scanner.nextLine(); 

                    Flight newFlight = new Flight(flightNumber, airlineName, source, destination);
                    flightManagement.addFlight(newFlight); 
                    System.out.println("Flight added successfully!");
                    break;

                case 2:
                    // Removing a flight
                    System.out.print("Enter flight number to remove: ");
                    String removeFlightNumber = scanner.nextLine();  
                    flightManagement.removeFlight(removeFlightNumber);  
                    System.out.println("Flight removed (if existed)!");
                    break;

                case 3:
                    // Search for a flight by flight number
                    System.out.print("Enter flight number to search: ");
                    String searchFlightNumber = scanner.nextLine();  // Read flight number to search for
                    Flight foundFlightByNumber = flightManagement.searchFlightByNumber(searchFlightNumber);  // Search flight by number

                    if (foundFlightByNumber != null) {
                        System.out.println("Flight found: " + foundFlightByNumber);  // Flight found
                    } else {
                        System.out.println("Flight not found.");  // Flight not found
                    }
                    break;

                case 4:
                    // Search for a flight by airline name
                    System.out.print("Enter airline name to search: ");
                    String searchAirlineName = scanner.nextLine();  // Read airline name to search for
                    Flight foundFlightByAirline = flightManagement.searchFlightByAirline(searchAirlineName);  // Search flight by airline

                    if (foundFlightByAirline != null) {
                        System.out.println("Flight found: " + foundFlightByAirline);  // Flight found
                    } else {
                        System.out.println("Flight not found.");  // Flight not found
                    }
                    break;

                case 5:
                    // Sort flights by airline name
                    flightManagement.sortFlightsByAirline();  // Sort flights
                    System.out.println("Flights sorted by airline name.");
                    break;

                case 6:
                //sorting by number
                    flightManagement.sortFlightsByNumber();  
                    System.out.println("Flights sorted by flight number.");
                    break;

                case 7:
                    //all flights
                    System.out.println("All Flights:");
                    flightManagement.printFlights();  
                    break;

                case 8:
                        //exit
                    running = false;
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();  
    }
}
