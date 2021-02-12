import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arnie", "Lucy", "Beth", "Amir");

        String joinedWithComma = StringUtils.join(names, ",");
        String joinedNoSeparator = StringUtils.join(names, null);
    }

}