package JustworkBanking.util;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * <h1>Results Class</h1>
 * This class implements all the methods of StdoutDisplayInterface.
 * Here we write the obtained results to results.csv file as output and print the same in terminal as per the given output format.
 * Exceptions are being handled by try-catch block.
 */
public class Results implements StdoutDisplayInterface{
    public void publishResult(HashMap<String, String> hmIn){
        try{
            FileWriter fw = new FileWriter("results.csv",true);
            PrintWriter pw = new PrintWriter(fw);
            Iterator hmIterator = hmIn.entrySet().iterator();
        
            while(hmIterator.hasNext()){
                Map.Entry mapElement = (Map.Entry)hmIterator.next();
                String[] sIn = mapElement.getKey().toString().split("_");
                String[] mIn = mapElement.getValue().toString().split("_");
                System.out.println(sIn[0]+", "+sIn[1]+", "+mIn[0]+", "+mIn[1]+", "+mIn[2]+System.lineSeparator());
                pw.write(sIn[0]+", "+sIn[1]+", "+mIn[0]+", "+mIn[1]+", "+mIn[2]+System.lineSeparator());
            }
            pw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}