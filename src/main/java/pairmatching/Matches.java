package pairmatching;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Matches {
    private Map<String, List<List<String>>> matches;

    public Matches() {
        matches = new HashMap<>();
    }

    public List<List<String>> findExistedMatchingResult(String course, String level, String mission) {
        String keyIndex = new Match(course, level, mission).getKeyIndex();

        if (matches.containsKey(keyIndex)) {
            return matches.get(keyIndex);
        }
        return null;
    }
}