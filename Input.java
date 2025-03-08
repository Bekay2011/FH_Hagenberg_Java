/* Input:                                                                    */
/* ------                                                                    */
/* Helper functions to read from the console.                                */
/* ========================================================================= */

public class Input {
    public static int readInt() {
        try {
            String line = System.console().readLine();
            return Integer.parseInt(line);
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }

    public static long readLong() {
        try {
            String line = System.console().readLine();
            return Long.parseLong(line);
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }

    public static double readDouble() {
        try {
            String line = System.console().readLine();
            return Double.parseDouble(line);
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }

    public static char readChar() {
        String line = System.console().readLine();
        if ((line == null) || (line.length() == 0)) {
            return ' ';
        } else {
            return line.charAt(0);
        }
    }

    public static String readString() {
        String line = System.console().readLine();
        return line != null ? line : "";
    }
}
