/*jackie scott Module 2 usefans assignment
 * creating this test class that includes standard public static void main(String[] args) method.
 * contains an array of fan objects
 * instance of usefans
 * callss the method usefans that accepts an array by pasing the array created 
 */

public class TestUseFans {

    public static void main(String[] args) {
        // Create an array of Fan objects
        Fan[] fans = new Fan[3];
        fans[0] = new Fan(2, false, 10.0, "black");
        fans[1] = new Fan();
        fans[2] = new Fan(1, false, 8.0, "white");

        // Create an instance of UseFans
        UseFans useFans = new UseFans();

        // Call the method in UseFans that accepts an array and display details
        useFans.showFanDetails(fans);
    }
}
