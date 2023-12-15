package pairmatching;

import java.util.Arrays;

public enum Level {
    NONE("없음", 0, 0),
    LEVEL_1("레벨1", 1, 3),
    LEVEL_2("레벨2", 2, 3),
    LEVEL_3("레벨3", 3, 0),
    LEVEL_4("레벨4", 4, 2),
    LEVEL_5("레벨5", 5, 0);

    private final String levelName;
    private final int index;
    private final int missionNum;

    Level(String levelName, int index, int missionNum) {
        this.levelName = levelName;
        this.index = index;
        this.missionNum = missionNum;
    }

    public String getLevelName() {
        return levelName;
    }

    public int getIndex() {
        return index;
    }

    public int getMissionNum() {
        return missionNum;
    }

    public static Level getLevel(String levelName) {
        return Arrays.stream(values())
                .filter(level -> level.levelName.equals(levelName))
                .findFirst()
                .orElse(NONE);
    }
}