import java.util.*;
public class Transaction {
	Trader trader;
	int year;
	int value;
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	
	
	@Override
	public String toString() {
		return "  " + trader + ", year=" + year + ", value=" + value ;
	}
	
	
}
