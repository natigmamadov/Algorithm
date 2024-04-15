import java.util.Arrays;

public class Anagram {

    public static boolean checkIfAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if (Arrays.equals(char1, char2)) {
            return true;
        }
        return false;
    }
}
