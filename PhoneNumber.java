import java.util.Scanner;

public class PhoneNumber
{
public static void main(String[] args)
{
String names;		// To hold a name string

String[] people = { "James, Jean", "Harrison, Rose", "Smith, William", "Smith, Brad" };

Scanner keyboard= new Scanner(System.in); //Create Scanner object

System.out.println("Enter The first few characters of " + " the last name to look up: ");
names = keyboard.nextLine();

	System.out.println("Here are the names that match");
for (String person : people)
{
	if (person.startsWith(names))
	System.out.println(person);
	else 
	System.out.println("There are no names that match your search");
}
}
}