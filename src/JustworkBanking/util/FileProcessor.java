package JustworkBanking.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>FileProcessor Class</h1>
 * This class implements all the methods of FileDisplayI.
 * Here we read from input file.
 */
public class FileProcessor implements FileProcessorI{
    /**
     * <h2>readFileInput</h2>
     * This method is used to read input file, store the input data into an ArrayList and return it.
     * @param pathIn This string parameter contains the path of bstInput.txt file.
     * @return ArrayList of type String[]
     * We read all the data from bankJustWorks.csv file and store into an ArrayList.
     * Then we return the ArrayList
     * Exceptions are being handled with try-catch block
     */
    public List<String[]> readFileInput(String pathIn) throws FileNotFoundException, IOException{
        List<String[]> lIn = new ArrayList<>();
        File fileIn = new File(pathIn);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileIn));
            String line = br.readLine();
            while((line = br.readLine()) != null && !line.isEmpty()){
                String[] dataIn = line.split(",");
                if(dataIn.length != 0){
                    lIn.add(dataIn);
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return lIn;
    }
}