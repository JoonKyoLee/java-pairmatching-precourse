package pairmatching;

public class Match {
    private static final int MISSION_NUM_BOUND = 0;
    private final Course course;
    private final Level level;
    private final Mission mission;
    private final String keyIndex;

    public Match(String course, String level, String mission) {
        this.course = Course.getCourse(course);
        this.level = Level.getLevel(level);
        this.mission = allocateMission(mission);

        validate();

        keyIndex = makeKeyIndex();
    }

    private Mission allocateMission(String mission) {
        if (levelHasMission()) {
            return Mission.getMission(mission);
        }
        return null;
    }

    private boolean levelHasMission() {
        return this.level.getMissionNum() > MISSION_NUM_BOUND;
    }

    private void validate() {
        if (missionIsNotInLevel()) {
            throw new InputException(ErrorMessage.LEVEL_AND_MISSION_DOES_NOT_MATCH);
        }
    }

    private boolean missionIsNotInLevel() {
        return level != mission.getLevel();
    }

    private String makeKeyIndex() {
        String key = course.getIndex() + level.getIndex();

        if (levelHasMission()) {
            return key + mission.getIndex();
        }
        return key;
    }

    public String getKeyIndex() {
        return keyIndex;
    }
}