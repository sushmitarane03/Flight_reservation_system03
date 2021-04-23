package com.upgrade.ims;
public class Touristticket extends Ticket {
        public class TouristTicket {
                public TouristTicket(String pnr, String from, String to, Flight flight String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNo, float Price, boolean cancelled);
        super(addressStreet,addressCity,addressState,contactName,contactphone,contactEmail);
                private String hotelAddress;
                private String selectedTouristLocation;

                public String gethotelAddress() {
                        return this.hotelAddress;
                }

                public void sethotelAddress(String hotelAddress) {
                        this.hotelAddress = hotelAddress;
                }

                public String getTouristLocation() {
                        return this.selectedTouristLocation;
                }

                public void removeTouristLocation(String loction);

                public void addTouristLocation(String loction);
        }
}



