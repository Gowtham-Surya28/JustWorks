package JustworkBanking.Transactions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import JustworkBanking.util.Results;
import JustworkBanking.util.StdoutDisplayInterface;

/**
 * <h1>MinMaxTotal Class</h1>
 * This class implements all the methods of MinMaxTotalInterface.
 * Here we calculate the minimum, maximum and total balance of the customer in the given month.
 */
public class MinMaxTotal implements MinMaxTotalInterface{
    StdoutDisplayInterface rObj = new Results();

    public void calcMinMaxTotal(HashMap<String, ArrayList<Double>> hmIn){
        HashMap<String, String> hmFinal = new LinkedHashMap<String, String>();
        Iterator hmIterator = hmIn.entrySet().iterator();
        
        while(hmIterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            BalanceWrapper bw = new BalanceWrapper(0, 0, 0);
            double total=0;
            for(double dIn : hmIn.get(mapElement.getKey())){
                total += dIn;
                bw.setTotal(total);
                if(bw.getMin() == 0 && bw.getMax() == 0){
                    bw.setMin(bw.getTotal());
                    bw.setMax(bw.getTotal());
                }
                if(bw.getTotal() < bw.getMin()){
                    bw.setMin(bw.getTotal());
                }
                else if(bw.getTotal() > bw.getMax()){
                    if(bw.getMin() == 0){
                        bw.setMin(bw.getMax());
                    }
                    bw.setMax(bw.getTotal());
                }     
            }
            hmFinal.put(mapElement.getKey().toString(), bw.getMin()+"_"+bw.getMax()+"_"+bw.getTotal());
            hmIterator.remove();
        }
        rObj.publishResult(hmFinal);
    }
}