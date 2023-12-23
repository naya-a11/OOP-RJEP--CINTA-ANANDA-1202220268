public class Bioskop {
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    private int rows = 5

    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    private int seatsperrows = 10

    // TO DO: Create 2 dimensional array to store seat reservation status
    int[][] seats = new int[rows][seatsperrows];

    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
        seats[0][1] = 1;
        seats[1][5] = 1;
        seats[3][7] = 1;        
       
    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        for (int b = 0; b < rows; b++) {
            for (int k = 0; k < seatsperrows; k++) {
                System.out.println(seats[b][k] +\"t");

            }
        }

    }
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        if seats[row][seat] == 0;
            if seats[row][seat] == 1;

        System.out.println("Kursi berhasil dipesan" + row + "," + seats +"\n");
        
}