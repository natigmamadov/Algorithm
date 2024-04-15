public class Palindrome {

    public static boolean isPalindrome(String s) {
        int firstIndex = 0;
        int lastIndex = s.length() - 1;

        while (firstIndex < lastIndex) {
            if (s.charAt(firstIndex) != s.charAt(lastIndex)) {
                return false;
            }
            firstIndex++;
            lastIndex--;
        }
        return true;
    }
}
