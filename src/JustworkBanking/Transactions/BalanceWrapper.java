package JustworkBanking.Transactions;

/**
 * <h1>BalanceWrapper Class</h1>
 * This is a wrapper class, used by MinMaxTotal class for 
 * setting and getting min, max and total values of each customer.
 */
public class BalanceWrapper {
    private double min, max, total;

    public BalanceWrapper(double minIn, double maxIn, double totalIn){
        min = minIn;
        max = maxIn;
        total = totalIn;
    }

    public double getMin(){
        return min;
    }
    public void setMin(double minIn){
        min = minIn;
    }

    public double getMax(){
        return max;
    }
    public void setMax(double maxIn){
        max = maxIn;
    }

    public double getTotal(){
        return total;
    }
    public void setTotal(double totalIn){
        total = totalIn;
    }
}
