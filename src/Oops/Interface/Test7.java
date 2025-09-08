package Oops.Interface;

abstract class Transport {
    double fare;
    String bookingId;
    Transport(double fare, String bookingId) {
        this.fare = fare;
        this.bookingId = bookingId;
    }
    void generateTicket() {
        System.out.println("🎫 Ticket generated: Booking ID " + bookingId + ", Fare: ₹" + fare);
    }
    abstract void bookRide();
}

interface Cancellable {
    void cancelBooking(double refundAmount);
}

interface Schedulable {
    void scheduleRide(String time);
}
class Cab extends Transport implements Cancellable, Schedulable {
    Cab(double fare, String bookingId) {
        super(fare, bookingId);
    }

    @Override
    void bookRide() {
        System.out.println("🚖 Cab booked successfully for ₹" + fare);
    }

    @Override
    public void cancelBooking(double refundAmount) {
        System.out.println(" Cab booking cancelled. Refund ₹" + refundAmount + " processed.");
    }

    @Override
    public void scheduleRide(String time) {
        System.out.println(" Cab ride scheduled at " + time);
    }
}

// Subclass: Train
class Train extends Transport implements Cancellable {
    Train(double fare, String bookingId) {
        super(fare, bookingId);
    }

    @Override
    void bookRide() {
        System.out.println("🚆 Train ticket booked successfully for ₹" + fare);
    }

    @Override
    public void cancelBooking(double refundAmount) {
        System.out.println("Train booking cancelled. Refund ₹" + refundAmount + " processed.");
    }
}

// Subclass: Bus
class Bus extends Transport {
    Bus(double fare, String bookingId) {
        super(fare, bookingId);
    }

    @Override
    void bookRide() {
        System.out.println("🚌 Bus ticket booked successfully for ₹" + fare);
    }
}
public class Test7 {
    public static void main(String[] args) {
        // Scenario 1: Cab booking
        Cab cab = new Cab(500, "CAB101");
        cab.bookRide();
        cab.generateTicket();
        cab.scheduleRide("10:00 AM");
        cab.cancelBooking(300);

        System.out.println("-----------------------------");

        // Scenario 2: Train booking
        Train train = new Train(1200, "TRN202");
        train.bookRide();
        train.generateTicket();
        train.cancelBooking(1000);

        System.out.println("-----------------------------");

        // Scenario 3: Bus booking
        Bus bus = new Bus(200, "BUS303");
        bus.bookRide();
        bus.generateTicket();
    }
}

