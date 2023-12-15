package pairmatching;

public enum ErrorMessage {
    COURSE_IS_NOT_VALID("유효하지 않은 과정입니다."),
    LEVEL_IS_NOT_VALID("유효하지 않은 레벨입니다."),
    MISSION_IS_NOT_VALID("유효하지 않은 미션입니다."),
    LEVEL_AND_MISSION_DOES_NOT_MATCH("레벨과 미션이 맞지 않습니다.");

    private static final String ERROR_PREFIX = "[ERROR] ";
    private static final String READ_AGAIN_MESSAGE = " 다시 입력해주세요.\n";
    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return ERROR_PREFIX + errorMessage + READ_AGAIN_MESSAGE;
    }
}