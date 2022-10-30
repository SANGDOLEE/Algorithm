
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		 Scanner kb=new Scanner(System.in);
        int a=kb.nextInt();
        int b=kb.nextInt();
        if(a==1&&b==3){
            System.out.print("A");
        }else if(a<b){
            System.out.print("B");
        }else
            System.out.print("A");
	}
}