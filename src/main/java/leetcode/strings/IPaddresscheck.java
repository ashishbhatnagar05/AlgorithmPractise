package leetcode.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class IPaddresscheck {

    private static Pattern VALID_IPV4_PATTERN = null;
    private static Pattern VALID_IPV6_PATTERN = null;
    private static final String ipv4Pattern = "^(10|172|192)\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$";
    private static final String ipv6Pattern = "([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}";

    static {

        VALID_IPV4_PATTERN = Pattern.compile(ipv4Pattern, Pattern.CASE_INSENSITIVE);
        VALID_IPV6_PATTERN = Pattern.compile(ipv6Pattern, Pattern.CASE_INSENSITIVE);

    }


    public static String isIpAddress(String ipAddress) {

        Matcher m1 = IPaddresscheck.VALID_IPV4_PATTERN.matcher(ipAddress);
        if (m1.matches()) {
            return "IPv4";
        }
        Matcher m2 = IPaddresscheck.VALID_IPV6_PATTERN.matcher(ipAddress);
        if (m2.matches()) {
            return "IPv6";
        }
        return "Neither";
    }

    public static void main(String[] args) {
        System.out.println(isIpAddress("01.01.01.01"));
    }
}
