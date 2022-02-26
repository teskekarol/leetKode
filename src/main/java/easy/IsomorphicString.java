package easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    Map<Character, Character> mapping = new HashMap<>();

    public boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            var leftChar = s.charAt(i);
            var rightChar = t.charAt(i);

            if (wasMappedFromSomethingElse(leftChar, rightChar)) {
                return false;
            } else {
                if (wasMappedToSomethingElse(leftChar, rightChar)) {
                    return false;
                } else {
                    mapping.put(leftChar, rightChar);
                }
            }
        }
        return true;
    }

    private boolean wasMappedFromSomethingElse(char leftChar, char rightChar) {
        return mapping.containsKey(leftChar) && mapping.get(leftChar) != rightChar;
    }

    private boolean wasMappedToSomethingElse(char leftChar, char rightChar) {
        return !mapping.containsKey(leftChar) && mapping.containsValue(rightChar);
    }

}
