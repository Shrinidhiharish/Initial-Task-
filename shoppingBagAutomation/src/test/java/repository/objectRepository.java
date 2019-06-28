package repository;

public class objectRepository {

	
	final static String SIGNIN ="gb_70"	;
	final static String USERNAME_TEXTBOX ="//input[@jsname='YPqjbf']";
	final static String NEXTBUTTON ="//span[@class='CwaK9']";
	final static String PASSWORD_TEXTBOX ="//input[@type='password']";
	public static String Sign_In()
	{
		return SIGNIN;
	}
	
	public static String UserName_TextBox()
	{
		return USERNAME_TEXTBOX;
	}
	public static String Next_Button()
	{
		return NEXTBUTTON;
	}
	public static String Password_TextBox()
	{
		return PASSWORD_TEXTBOX;
	}
}
