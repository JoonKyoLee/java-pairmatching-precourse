package pairmatching;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Crew {
    private static final String backEndFilePath = "src/main/resources/backend-crew.md";
    private static final String frontEndFilePath = "src/main/resources/frontend-crew.md";
    private final List<String> backEndCrew;
    private final List<String> frontEndCrew;
    BufferedReader backBr;
    BufferedReader frontBr;

    public Crew() throws IOException {
        backEndCrew = new ArrayList<>();
        frontEndCrew = new ArrayList<>();
        backBr = new BufferedReader(new FileReader(backEndFilePath));
        frontBr = new BufferedReader(new FileReader(frontEndFilePath));
    }

    public List<String> readBackEndCrew() throws IOException {
        while (true) {
            String name = backBr.readLine();
            if (name == null) {
                break;
            }
            backEndCrew.add(name);
        }
        return backEndCrew;
    }

    public List<String> readFrontEndCrew() throws IOException {
        while (true) {
            String name = frontBr.readLine();
            if (name == null) {
                break;
            }
            frontEndCrew.add(name);
        }
        return frontEndCrew;
    }
}