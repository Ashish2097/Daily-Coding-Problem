import java.util.HashSet;

import java.util.Set;


public class Main
{

	public static void main(String[] args) {

	    Integer[] arr = new Integer[]{10, 15, 3, 7};

	    int k = 17;

	    HashSet<Integer> map = new HashSet<>();
	    int i;
	    for(i = 0; i < arr.length; i++) {
	        Integer remaining = k - arr[i];
	        if(map.contains(arr[i])) {
	            break;
	        }
	        else {
	            map.add(remaining);
	        }
	    }
	    if(i == arr.length)
	        System.out.println("false");
	    else
	        System.out.println("true");
	}
}
