import java.util.ArrayList;
import java.util.List;

public class StringSuffixes {

    public List<String> getSuffixes(String text) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            list.add(text.substring(i, text.length()));
        }
        return list;
    }
}
