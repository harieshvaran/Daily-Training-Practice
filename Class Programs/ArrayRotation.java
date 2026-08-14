import java.util.*;
public class ArrayRotation
{
	public static void main(String[] args) {  
		List<Integer> num = new ArrayList<>();

         Scanner sc = new Scanner(System.in);
       for(int i=0;i<5;i++)
       {
       		num.add(sc.nextInt());
       }

		int k= sc.nextInt();
		for(int i=0;i<k;i++)
		{
		    int last = num.remove(num.size()-1);
		    num.add(0,last);
		}
		System.out.println("Rotated list : "+ num);
	}
}