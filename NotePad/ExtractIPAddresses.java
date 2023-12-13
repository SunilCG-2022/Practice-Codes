import java.util.ArrayList;
import java.util.List;

public class ExtractIPAddresses {
    public static void main(String[] args) {
        String s1 = "192.168.1.1;invalid_ip;104.0.0.1;172.16.254.1;invalid_ip;invalid_ip;134.5.6.7";
        int num = 4; // Set the expected count of valid IP addresses

        List<String> result = extractValidIPAddresses(s1, num);

        if (result != null) {
            System.out.println("Valid IP Addresses:");
            for (String ipAddress : result) {
                System.out.println(ipAddress);
            }
        } else {
            System.out.println("Invalid Input");
        }
    }

    private static List<String> extractValidIPAddresses(String s1, int num) {
        String[] parts = s1.split(";");
        List<String> result = new ArrayList<>();

        int validCount = 0;

        for (String part : parts) {
            if (isValidIPAddress(part)) {
                result.add(part);
                validCount++;
            }
        }

        return (validCount == num) ? result : null;
    }

    private static boolean isValidIPAddress(String ipAddress) {
       
        String[] parts = ipAddress.split("\\.");

        if (parts.length == 4) {
            for (String part : parts) {
                try {
                    int value = Integer.parseInt(part);
                    if (value < 0 || value > 255) {
                        return false;
                    }
                } catch (NumberFormatException e) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}