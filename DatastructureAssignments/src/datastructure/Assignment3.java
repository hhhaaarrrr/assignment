package datastructure;

public class Assignment3 {
	public static void main(String[] args) {
		 int principle=4000;
		 int rate = 6;
		 int years = 2;
		 float interest =0;
		 
		 int simpleInterest = (principle*rate*years)/100;
		 System.out.println(simpleInterest);
		  
		 float CI = principle;
        
		 for (int i = 0; i < years; i++) {
       	 float SI=(CI*rate)/100;
       	 interest = interest +SI;
       	 CI= CI+SI;
		}
        
		 System.out.println(interest);
		 
	}

}
