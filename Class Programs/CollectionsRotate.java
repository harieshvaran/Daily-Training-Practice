import java.util.*;
public class CollectionsRotate
{
	public static void main(String[] args) {  
		List<Integer> num = new ArrayList<>();

         Scanner sc = new Scanner(System.in);
       for(int i=0;i<5;i++)
       {
       		num.add(sc.nextInt());
       }

		  Collections.rotate(num, 1);

		System.out.println(" Rotated list : "+ num);
	}
}