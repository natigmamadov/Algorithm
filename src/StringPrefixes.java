import java.util.ArrayList;
import java.util.List;

public class StringPrefixes {

    public static List<String> getPrefixes(String text) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i < text.length()+1; i++) {
            list.add(text.substring(0, i));
        }
        return list;
    }
}
