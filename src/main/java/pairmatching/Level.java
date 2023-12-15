package pairmatching;

import java.util.Arrays;

public enum Level {
    LEVEL_1("레벨1", "1", 3),
    LEVEL_2("레벨2", "2", 3),
    LEVEL_3("레벨3", "3", 0),
    LEVEL_4("레벨4", "4", 2),
    LEVEL_5("레벨5", "5", 0);

    private final String levelName;
    private final String index;
    private final int missionNum;

    Level(String levelName, String index, int missionNum) {
        this.levelName = levelName;
        this.index = index;
        this.missionNum = missionNum;
    }

    public String getLevelName() {
        return levelName;
    }

    public String getIndex() {
        return index;
    }

    public int getMissionNum() {
        return missionNum;
    }

    public static Level getLevel(String levelName) {
        return Arrays.stream(values())
                .filter(level -> level.levelName.equals(levelName))
                .findFirst()
                .orElseThrow(() -> new InputException(ErrorMessage.LEVEL_IS_NOT_VALID));
    }
}