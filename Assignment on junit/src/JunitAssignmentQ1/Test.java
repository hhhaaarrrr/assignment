package JunitAssignmentQ1;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          MinMaxFinder obj = new MinMaxFinder();
          
         int[] a =  obj.findMinMax(new int[] {11,3,46,5,7});
         
         System.out.println(a[0]);
         System.out.println(a[1]);
        
	}

}
