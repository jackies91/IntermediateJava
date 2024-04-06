/*Jackie Scott Module 2 UseFans Assignment
 * 
 * 
 * 
 */

public class UseFans {

    // method to display the details of every fan object in an array
    public void showFanDetails(Fan[] fans) {
        // a loop to loop through every element in the array
        for (int i = 0; i < fans.length; i++) {

            // print every loop through each object in the fan array
            System.out.println("Fan #" + (i + 1) + " speed: " + fans[i].getSpeed());
        }
    }

    // Instance method to display details of a single Fan object
    public void showFanDetails(Fan fan) {
        System.out.println("Fan speed: " + fan.getSpeed()); // print out the single object details
    }
}
