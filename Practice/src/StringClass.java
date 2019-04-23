
public class StringClass {

	public static void main(String args[]){  
		   String s="Sachin";  
		   s.concat(" Tendulkar");//concat() method appends the string at the end  
		   System.out.println(s);//will print Sachin because strings are immutable objects  
		   
		   String a = "kalyan";
		   a.concat(" Chakravarthy");
		   System.out.println(a);
		   
		   
		   String a1 = "Kalyan";
		   String a2 = "Kalyan";
		   String a3 = "KAlyan";
		   String a5 = new String("Kalyan");
		   String a4 = new String("kalyan");
		   System.out.println(a1.equals(a2));
		   System.out.println(a1.equalsIgnoreCase(a3));
		   System.out.println(a1.equals(a3));
		   System.out.println(a1==a2);
		   System.out.println(a1==a5);
		   System.out.println(a1.equals(a5));
		   String b1= "kalyan";
		   String b2 = "cha";
		   String b3 = "Majeti";
		   String b4 = "Majeti";
		   
		   System.out.println(b1.compareTo(b4));
		   System.out.println(b1.compareTo(b2));
		   
		   
		   
		 } 
}
