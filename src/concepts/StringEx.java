package concepts;

public class StringEx 
{
	
	public void stringExMethod()
	{
		String name = "Tanish";
		String name2 = " Di lin ";
		String name3 = "Tanish";
		StringBuffer name4 = new StringBuffer("Praveen Kumar");
		
		String subject1 = new String("Maths");
		String subject2 = new String("English");
		String subject3 = new String("Maths");
		
		String subjects = new String("English, Maths, Tamil, Chinese");
		
		System.out.println(name.charAt(3)); // i
		//System.out.println(name4.compareTo("Praveen")); //6
		//System.out.println(name4.concat("Hello"));
		//System.out.println(name4.contains("ee"));
		System.out.println(name4.hashCode());
		System.out.println(name4.indexOf("a"));
		System.out.println(name4.lastIndexOf("a"));
		System.out.println(name4.length());
		//System.out.println(name4.replace("kumar", "kumaar"));
		System.out.println(name4.substring(6));
		System.out.println(name4.substring(3, 8));
		//System.out.println(name4.toLowerCase());
		//System.out.println(name4.toCharArray());
		//System.out.println(name4.toUpperCase());
		System.out.println(name2.trim());
		System.out.println(subjects.split(","));
		System.out.println(10 + 20);
		System.out.println(String.valueOf(10) + 20);
		
		System.out.println(name4.append("Hello"));
		System.out.println(name4.reverse());
		
		System.out.println(name4);
		System.out.println(subjects);
		System.out.println(name2);
	}
	

}
