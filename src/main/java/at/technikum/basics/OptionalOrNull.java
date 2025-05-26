package at.technikum.basics;

import java.util.Optional;

public class OptionalOrNull {

    public static void main(String[] args) throws Exception {
        String test = getStringById(404);
        enroll("not valid");

        Optional<String> testFinding = findStringById(404);

        if (testFinding.isEmpty()) {
            // give user warning
        }
    }


    public static String getStringById(int id) throws Exception {
        // search db but did not find it ...
        throw new Exception("String not found");
    }

    public static Optional<String> findStringById(int id) {
        // search db but did not find it ...
        return Optional.empty();
    }

    public static void enroll(String type) throws IllegalArgumentException {
        throw new IllegalArgumentException();
    }
}
