package General;

public class PrintUpperAndLowerCases 
{
	public static void main(String[] args) 
	{
		String s= "MounIKA";
		
		char[] ch = s.toCharArray();
		int U_count=0;
		int L_count=0;
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			
			if(c>='A' && c<='Z')
			{
				System.out.println(c);
				U_count++;
			
				
			}
			else
			{
				System.out.println(c);
				L_count++;
				
			}
		}
		System.out.println("UPPER LETTER:"+U_count);
		System.out.println("lOWER LETTER"+L_count);
	}

}
