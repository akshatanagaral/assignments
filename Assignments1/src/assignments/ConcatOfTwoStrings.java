package assignments;

public class ConcatOfTwoStrings {
	public String mincat(String st1,String st2) {
		if(st1.length()==st2.length())
			return st1+st2;
		if(st1.length()>st2.length()) {
			int diff=st1.length()-st2.length();
			return st1.substring(diff,st1.length()) + st2;
		}
		else {
			int diff=st2.length()-st1.length();
			return st1+st2.substring(diff,st2.length());
		}
		
	}
	public static void main(String[] args) {
		String str = new String();
		String str1="hello";
		String str2="helloworld";
	}

}

