import java.util.*;
import java.lang.Exception;

class UsernameException extends Exception{
	UsernameException (String msg)
	{
		System.out.println("msg");
	}
}

class PasswordException extends Exception{
	PasswordException(String msg)
	{
		System.out.println("msg");
	}
}

public class usernamepass
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		String username,password;
		System.out.println("Enter Username");
		username=reader.nextLine();
		System.out.println("Enter Password");
		password=reader.nextLine();
		int len=username.length();
		try
		{
			if( len > 8)
			{
				throw new UsernameException("username must be greater than 8");
			}

			else if(!password.equals("admin"))
			{
				throw new PasswordException("password incorrect");
			}
			else
			{
				System.out.println("login successfull");
			}
		}
		catch(UsernameException u)
		{
			System.out.println(u);
		}
		catch(PasswordException p)
		{
			System.out.println(p);
		}
	}
}
