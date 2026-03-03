/**
 * OOPSBannerApp
 * UC4: Render OOPS as Banner using String Array and Loop
 * 
 * @author Laasya
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create String array
        String[] lines = new String[7];

        // Step 2: Populate array using String.join()
        lines[0] = String.join(" ",
                " ********  ",
                " ******** ",
                " ******  ",
                " ******** ");

        lines[1] = String.join(" ",
                "*        * ",
                "*        * ",
                "*      * ",
                "*        ");

        lines[2] = String.join(" ",
                "*        * ",
                "*        * ",
                "*      * ",
                "*        ");

        lines[3] = String.join(" ",
                "*        * ",
                "*        * ",
                "*******  ",
                "******** ");

        lines[4] = String.join(" ",
                "*        * ",
                "*        * ",
                "*        ",
                "       * ");

        lines[5] = String.join(" ",
                "*        * ",
                "*        * ",
                "*       ",
                "        * ");

        lines[6] = String.join(" ",
                " ******** ",
                "  ******** ",
                " *       ",
                " ******** ");

        // Step 3: Loop through array
        for (String line : lines) {
            System.out.println(line);
        }
    }
}