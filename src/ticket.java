public com.upgrade.ims;
public class Ticket {
    public Ticket(String pnr, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean cancelled);
this.pnr =pnr;
this.from =from;
this.to =to;
this.flight =flight;
this.departureDateTime =departureDateTime;
this.arrivalDateTime =arrivalDateTime;
this.passenger =passenger;
this.seatNo =seatNo;
this.price =price;
this.cancelled =cancelled;

    public void getflight() {
        return flight;
    }

    pubic

    void setflight(Flight flight) {
        this.flight.setstatus()
        this.flight.checkDetails()
        this.flight.cancel();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(String flightDuration) {
        this.flightDuration = flightDuration;
    }

    public String getcancel() {
        return cancel;
    }

    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    public String getFlightDuration() {
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
    }
}








