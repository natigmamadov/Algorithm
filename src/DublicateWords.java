import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DublicateWords {
    private static void findDublicateWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        Set<String> set = new LinkedHashSet<>();
        List<String> list = new ArrayList<>();
        String[] split = s.split(" ");

        for (String t : split) {
            String temp = t.toLowerCase();
            if (!list.contains(temp)) {
                list.add(t.toLowerCase());
                set.add(t);
            }
        }
        String output = "";

        for (String o : set) {
            output +=  o + " ";
        }
        System.out.println(output);
    }
}
