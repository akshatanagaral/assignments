package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RetrievePalindromeSet {
	 public static int sumOfPalindromeNos(int n1,int n2){
		  List<Integer> l1=new ArrayList<Integer>();
		  for(int i=n1;i<=n2;i++){
		   int r=0,n3=i;
		   while(n3!=0){
		    r=(r*10)+(n3%10);
		    n3=n3/10; }
		   if(r==i)
		    l1.add(i);  }
		  System.out.println(l1);
		  int s=0;
		  for(int i=0;i<l1.size();i++)
		   s+=l1.get(i);
		  return s;
		 }
		 public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter the range:");
		  int n1=s.nextInt();
		  int n2=s.nextInt();
		  System.out.println("sum of palindrome nos.within given range is:"+sumOfPalindromeNos(n1,n2));
		 }
		}


