package JunitAssignmentQ2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class MinMaxtest {


		int arr[]= {56,34,7,3,54,34,34,53};

			@Test
			void testFindMax() {
				MinMax expectedObj=new MinMax(3,56);
				MinMax actualObj;
				MInMaxObject obj = new MInMaxObject();
				actualObj=obj.findMinMax(arr);
				assertEquals(actualObj.max,expectedObj.max);
				assertEquals(actualObj.min,expectedObj.min);
			}

	
	}


