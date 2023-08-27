package first_package;
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String time12Hour = bufferedReader.readLine();
        bufferedReader.close();

        String militaryTime = convertToMilitaryTime(time12Hour);
        System.out.println(militaryTime);
    }

    public static String convertToMilitaryTime(String time12Hour) {
        int hour = Integer.parseInt(time12Hour.substring(0, 2));
        int minute = Integer.parseInt(time12Hour.substring(3, 5));
        int second = Integer.parseInt(time12Hour.substring(6, 8));
        String amPm = time12Hour.substring(8);

        if (amPm.equals("PM") && hour != 12) {
            hour += 12;
        } else if (amPm.equals("AM") && hour == 12) {
            hour = 0;
        }

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
