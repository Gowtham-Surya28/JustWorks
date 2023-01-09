package JustworkBanking.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface FileProcessorI {
    public List<String[]> readFileInput(String pathIn) throws FileNotFoundException, IOException;
}