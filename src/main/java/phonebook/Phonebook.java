package phonebook;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException("input parameter cannot be null!");
        }
        try {
            Files.write(Path.of(output), getListFromMap(contacts));
        } catch (IOException ioe) {
            throw new IllegalArgumentException("cannot write file!", ioe);
        }
    }

    private List<String> getListFromMap(Map<String, String> contacts) {
        List<String> result = new ArrayList<>();
        for (Map.Entry actual : contacts.entrySet()) {
            result.add(actual.getKey() + ": " + actual.getValue());
        }
        return result;
    }
}
