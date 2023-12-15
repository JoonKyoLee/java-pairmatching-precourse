package pairmatching;

import java.util.Arrays;

public enum Course {
    BACKEND("백엔드", 1),
    FRONTEND("프론트엔드", 2);

    private final String courseName;
    private final int index;

    Course(String courseName, int index) {
        this.courseName = courseName;
        this.index = index;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getIndex() {
        return index;
    }

    public static Course getCourse(String courseName) {
        return Arrays.stream(values())
                .filter(course -> course.courseName.equals(courseName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 과정, 레벨, 미션을 잘못 입력하셨습니다. 다시 입력해주세요."));
    }
}