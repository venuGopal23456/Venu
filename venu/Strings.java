package venu;

public class Strings {

	public static void main(String[] args) {
		String var="Welcome Google CEO";
		if(var.contains("CEO"))
		{
			System.out.println(var);
		}
		String va="ceo";
		if(va.equalsIgnoreCase("Ceo"))
		{System.out.println(va);}
		
		
		String phone="123456789";
		System.out.println(phone.substring(1,2));
		System.out.println(phone.substring(5,7));
		

	}

}
