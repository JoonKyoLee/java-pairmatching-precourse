package pairmatching;

import java.util.Arrays;

public enum Mission {
    CAR_RACING(Level.LEVEL_1, "자동차경주", "1"),
    LOTTO(Level.LEVEL_1, "로또", "2"),
    NUMBER_BASEBALL(Level.LEVEL_1, "숫자야구게임", "3"),

    CART(Level.LEVEL_2, "장바구니", "4"),
    PURCHASE(Level.LEVEL_2, "결제", "5"),
    SUBWAY_MAP(Level.LEVEL_2, "지하철노선도", "6"),

    IMPROVEMENT(Level.LEVEL_4, "성능개선", "7"),
    LAUNCH(Level.LEVEL_4, "배포", "8");

    private final Level level;
    private final String missionName;
    private final String index;

    Mission(Level level, String missionName, String index) {
        this.level = level;
        this.missionName = missionName;
        this.index = index;
    }

    public Level getLevel() {
        return level;
    }

    public String getIndex() {
        return index;
    }

    public static Mission getMission(String missionName) {
        return Arrays.stream(values())
                .filter(mission -> mission.missionName.equals(missionName))
                .findFirst()
                .orElseThrow(() -> new InputException(ErrorMessage.MISSION_IS_NOT_VALID));
    }
}