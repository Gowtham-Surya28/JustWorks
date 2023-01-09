package JustworkBanking.Transactions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import JustworkBanking.util.FileProcessor;
import JustworkBanking.util.FileProcessorI;

/**
 * <h1>BalanceCalculation Class</h1>
 * This class implements all the methods of BalanceCalculationI.
 * Here we modify the input data from FileProcessor class and store it in a hashmap.
 */
public class BalanceCalculation implements BalanceCalculationI{

    MinMaxTotalInterface mmtObj = new MinMaxTotal();

    public void transactionAnalysis(String pathIn) throws NullPointerException, FileNotFoundException, IOException{
        int i;
        String[] data = {""};
        String cId = "";
        FileProcessorI fObj = new FileProcessor();
        List<String[]> lIn = fObj.readFileInput(pathIn);
        List<List<String>> newList = new ArrayList<>();
        for(i=0; i<lIn.size(); i++){
            data = lIn.get(i)[1].split("/");
            cId = lIn.get(i)[0]+ "_"+ data[0]+ "/"+ data[2];
            List<String>transList= Arrays.asList(cId, lIn.get(i)[2]);
            newList.add(transList);
        }

        HashMap<String, ArrayList<Double>> hm = new LinkedHashMap<String, ArrayList<Double>>();
        for(i=0; i<newList.size(); i++){
            if(hm.containsKey(newList.get(i).get(0))){
                hm.get(newList.get(i).get(0)).add(Double.parseDouble(newList.get(i).get(1)));
            }
            else{
                hm.put(newList.get(i).get(0), new ArrayList<Double>());
                hm.get(newList.get(i).get(0)).add(Double.parseDouble(newList.get(i).get(1)));
            }
        }
        mmtObj.calcMinMaxTotal(hm);
    }
}