package easy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JustFun {

    public Map<Integer, List<String>> mapToMapByLength(String[] strings) {
        Stream<String> stream = Arrays.stream(strings);

        return stream.collect(Collectors.groupingBy(String::length));
    }

    public int allStringsLength(String[] strings) {

        Stream<String> stream = Arrays.stream(strings);

        return stream.collect(Collectors.summingInt(String::length));
    }



}
