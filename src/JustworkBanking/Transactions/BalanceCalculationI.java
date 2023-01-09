package JustworkBanking.Transactions;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface BalanceCalculationI {
    public void transactionAnalysis(String pathIn) throws NullPointerException, FileNotFoundException, IOException;
}