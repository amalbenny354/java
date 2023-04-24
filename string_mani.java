import java.util.Scanner;

public class string_mani
{
	public static void main(String[] args) 
	{
		System.out.println("Enter The String :");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println("Length of String = "+str1.length());
		System.out.println("Character at First position = "+str1.charAt(1));
		System.out.println("String Contains 'ing' sequence :"+str1.contains("ing"));
		System.out.println("String ends with g: "+str1.endsWith("g"));
		System.out.println("Replace'ing' with 'ly' : "+str1.replaceAll("ing","ly"));
		System.out.println("LOWERCASE : "+str1.toLowerCase());
		System.out.println("UPPERCASE : "+str1.toUpperCase());
	}
}
