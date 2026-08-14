import java.util.*;
public class ArrayRotation
{
	public static void main(String[] args) {
	    
		List<Integer> num = new ArrayList<>();
		num.add(59);
		num.add(70);
		num.add(40);
		num.add(23);
		num.add(67);
		int k=3;
		for(int i=0;i<k;i++)
		{
		    int last = num.remove(num.size()-1);
		    num.add(0,last);
		}
		System.out.println("Rotated list : "+ num);
		
	}
}