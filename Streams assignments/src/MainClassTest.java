import java.util.Arrays;
import java.util.List;


import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MainClassTest {

	public static void main(String[] args) {
		
		List<Trader> traderlist = Arrays.asList(
		new Trader("rahul","delhi"),
	    new Trader("raghu","pune"),
		new Trader("sanvi","indore"),
	    new Trader("meena","delhi"),
	    new Trader("harshi","bangalore"),
	    new Trader("shubha","pune"));
		
		List<Transaction> transactionlist = Arrays.asList(
		new Transaction(traderlist.get(0) ,2021, 3000),
		new Transaction(traderlist.get(1) ,2000, 9000),
		new Transaction(traderlist.get(2),2019, 3000),
		new Transaction(traderlist.get(3) ,2016, 9000),
		new Transaction(traderlist.get(4) ,2018, 5000),
		new Transaction(traderlist.get(5) ,2021, 3000));
	
		
		System.out.println("transaction of traders from delhi");
		transactionlist.stream().filter(l-> l.trader.city.equalsIgnoreCase("delhi")).forEach(System.out::println);
		
}}
