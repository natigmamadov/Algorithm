public class ReverseString {

    public static String reverse1(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        String reversed = stringBuilder.reverse().toString();
        return reversed;
    }

    public static String reverse2(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
           stringBuilder.append(text.charAt(i));
        }
        return stringBuilder.toString();
    }

}
