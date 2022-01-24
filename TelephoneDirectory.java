import java.io.*;
class TelephoneIndex
{
	private String name;
	private String phoneNumber;

	public TelephoneIndex(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
        public String getFirstNCharactersOfName(int n)
        {
             return name.substring(0,n%name.length());
        }
        @Override
         public String toString()
        {
          return String.format("%20s%15s",name,phoneNumber);
        }
                  
}	
public class TelephoneDirectory
{
	public static void main(String[] args) throws IOException
	{
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		TelephoneIndex[] ob = new TelephoneIndex[5];
		ob[0]=new TelephoneIndex("Pranav","9440044611");
                ob[1]=new TelephoneIndex("Sonu","6304305124");
                ob[2]=new TelephoneIndex("Jayanth","8331933211");
                ob[3]=new TelephoneIndex("Sashi","7345383798");
                ob[4]=new TelephoneIndex("Raj","645372928");
		System.out.println("Enter first few chars of name you want search? ");
		String query = br.readLine();
		int queryLength = query.length();
		for(int i=0; i<ob.length; i++)
		{
			if(ob[i].getFirstNCharactersOfName(queryLength).equals(query))
			{
				System.out.println(ob[i]);
			}
		}

	}
}