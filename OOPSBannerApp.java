/**
 * OOPSBannerApp
 * UC5: Render OOPS as Banner using Inline Array Initialization
 * 
 * @author Laasya
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare AND initialize array in one step
        String[] lines = {
            String.join(" ", " ********  ", " ******** ", " ******  ", " ******** "),
            String.join(" ", "*        * ", "*        * ", "*      * ", "*        "),
            String.join(" ", "*        * ", "*        * ", "*      * ", "*        "),
            String.join(" ", "*        * ", "*        * ", "*******  ", "******** "),
            String.join(" ", "*        * ", "*        * ", "*        ", "       * "),
            String.join(" ", "*        * ", "*        * ", "*       ", "        * "),
            String.join(" ", " ******** ", "  ******** ", " *       ", " ******** ")
        };

        // Loop through array
        for (String line : lines) {
            System.out.println(line);
        }
    }
}