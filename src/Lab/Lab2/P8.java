
// WAP to create a Room class, the attributes of this class are roomno, roomtype, roomarea
// and ACmachine. In this class the member functions are setData and displayData.
// Use member function to set data and display that data using displayData() method.
package Lab.Lab2;

class P8 {
    private int roomno;
    private String roomtype;
    private double roomarea;
    private boolean ACmachine;

    public void setData(int roomno, String roomtype, double roomarea, boolean ACmachine) {
        this.roomno = roomno;
        this.roomtype = roomtype;
        this.roomarea = roomarea;
        this.ACmachine = ACmachine;
    }

    public void displayData() {
        System.out.println("Room No: " + roomno);
        System.out.println("Room Type: " + roomtype);
        System.out.println("Room Area (sq.ft.): " + roomarea);
        System.out.println("AC Machine: " + (ACmachine ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        P8 r = new P8();
        r.setData(101, "Deluxe", 240.5, true);
        r.displayData();
    }
}
