import java.util.Scanner;
class TelephoneIndex
{
	private String name;
	private String phno;

	public TelephoneIndex(String name, String phno)
	{
		this.name = name;
		this.phno = phno;
	}
         void input()
        {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter your name");
         String s1=sc.next();
         System.out.println("enter your ph no");
         String s2=sc.next();
        }

	public String getFirstNCharactersOfName(int n)
	{
		return name.substring(0, n%name.length());
	}

	@Override 
	public String toString()
	{
		return String.format("%20s %15s", name, phno);
	}
       
       public static void main(String[] args)
	{
             Scanner sc=new Scanner(System.in);
	     TelephoneIndex t[] = new TelephoneIndex[5];
		for(int i=0;i<2;i++)
  {
   System.out.println("enter your name");
   String s1=sc.next();
   System.out.println("enter your ph num");
   String s2=sc.next();
   t[i]=new TelephoneIndex(s1,s2);
  }

	
		System.out.println("first few chars of name to search? ");
		String query = sc.nextLine();
		int queryLength = query.length();
		for(int i=0; i<t.length; i++)
		{
			if(t[i].getFirstNCharactersOfName(queryLength).equals(query))
			{
				System.out.println(t[i]);
			}
		}

	}
}