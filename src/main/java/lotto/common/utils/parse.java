package lotto.common.utils;


import java.util.List;


public class parse {
    private final static String SEPARATOR = ",";
    public static List<Integer> splitTextToNumber(String message) {
        List<String> splitedMessage = List.of(message.split(SEPARATOR));
        return splitedMessage.stream()
                .map(String::trim)
                .map(Integer::parseInt)
                .toList();
    }

}
