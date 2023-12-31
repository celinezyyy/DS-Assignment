package flightassignment;

public interface BookingListener {
    void onBookingMade(PassengerInfo passenger);
    void onBookingCanceled(String passengerName, String passportNumber, String flightNo);
    void onStatusUpdated(String passengerName, String passportNumber, String newStatus, int newSeatNumber);
}