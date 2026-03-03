// UC5 - OOPS Banner App
// Using Array Initialization with String.join() and Enhanced For Loop

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize array in a single statement
        String[] bannerLines = {

                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*",
                                   "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),

                String.join("", "*", "                                      ", "*"),

                String.join("", "*", "        WELCOME TO OOPS APP            ", "*"),

                String.join("", "*", "        OBJECT ORIENTED PROGRAM        ", "*"),

                String.join("", "*", "                                      ", "*"),

                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*",
                                   "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        // Enhanced for loop to print banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}