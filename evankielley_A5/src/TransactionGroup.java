import java.util.ArrayList;
import java.util.List;

public class TransactionGroup {
    private static List<SalesTransaction> transactions = new ArrayList<>();
    public static void addTransaction(SalesTransaction st) {
        transactions.add(st);
    }
    public double getGrandTotal() {
        double sum = 0;
        for (SalesTransaction st : transactions) {
            sum += st.getTot(st);
        }
        return sum;
    }
    public static void main(String[] args)
    {
		SalesTransaction one = new SalesTransaction("Small", 10.0, 10);
		addTransaction(one);
		one.printStats(one);
		
		SalesTransaction two = new SalesTransaction("Medium", 20.0, 30);
		addTransaction(two);
		two.printStats(two);
		
		SalesTransaction three = new SalesTransaction("Large", 30.0, 40);
		addTransaction(three);
		three.printStats(three);
    }
}