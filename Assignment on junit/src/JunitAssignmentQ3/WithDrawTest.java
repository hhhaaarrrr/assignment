package JunitAssignmentQ3;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WithDrawTest {

		@Test
		void test() {
			 
			BankAccount obj = new BankAccount();
			
			
			try {
				obj.withDraw(50000);
				
			}catch(InsufficientBalanceException e) {
				System.out.println("With-Draw Amount *is more "+e);
			}
				 
		}

	
	}


