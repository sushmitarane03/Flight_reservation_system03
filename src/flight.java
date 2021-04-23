package com.upgrade.ims;
public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;

    public Product() {
        this(flightNumber:4574, airline:airbus, capacits:300, bookedSeats:45);
    }

    public Flight(String name, String airline, int capacity, int bookedSeats) {
        this.name = name;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public Flight(Flight flight) {
        this.name = flight.name;
        this.airline = flight.airline;
        this.capacity = flight.capacity;
        this.bookedSeats = flight.bookedSeats;
    }

    public void getFlightDetails() {
        return flightDetails;
    }

    public void

    boolean checkAvailability() {
        return true;
    }

    public void increamentBookingCounter() {
        id counter = ++idcounter;
        return id counter;
    }
}