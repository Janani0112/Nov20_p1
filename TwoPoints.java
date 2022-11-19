package Assess_Nov20;
import java.util.*;
public class TwoPoints{
	public static int computePointOfInterception(int x, int y,int[] c) {
		for(int i=x-1,j=y-1;i<c.length+x && j<c.length+y;i=i+2,j++) {
			if(c[i%c.length] == c[j%c.length]) {
				return c[i%c.length];
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int c_array[]=new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
		int n=12;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Location of Node X");
		int x_loc=sc.nextInt();
		System.out.println("Enter the Location of Node Y");
		int y_loc=sc.nextInt();
		int res = computePointOfInterception(x_loc,y_loc,c_array);
		System.out.println("The point of Interception between x and y is = " + res);
	}
}
