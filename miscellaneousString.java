import java.util.Scanner;







public class MiscellaneousString

{

public static void main(String[] args)

{



String string1 = "the dog jumped over the fence";

String string2 = "the";

String string3 = "that";

char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',

'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',

'q', 'r', 's', 't', 'u', 'v','w', 'x',

'y', 'z'};



// wordCount method

int numberOfWords = wordCount(string1);

System.out.println("---------------word count-------------- \n");

System.out.println("The string object is : " + string1);

System.out.println("Number of words in the above string is : " + numberOfWords);



// arrayToString method

String character = arrayToString(charArray);



System.out.println("\n\n---------------Array to string conversion-------------- \n");

System.out.print("\nThe array is :");

for(int i = 0; i < charArray.length; i++)

System.out.print(charArray[i] + " ");

System.out.print("\nString from the above character array is : "

+ character);

// mostFrequent method

char mostOccurrence = mostFrequent(string1);



System.out.println("\n\n---------------calculating most frequent char-------------- \n");

System.out.println("\nThe string is : "

+ string1);

System.out.print("The most occured character in the above string is : "

+ mostOccurrence);



System.out.println("\n\n---------------modifying string-------------- \n");

//replaceSustring method

String string = replaceSubstring(string1, string2, string3);

System.out.println("\nThe string to be modify = : " + string1);

System.out.println("Replace for: " +string2);

System.out.println("replacement string is: "+string3);

System.out.println("After replacing, the new string is : " + string);

}



int numberOfWords;

/*

method should accept a reference to a string object

as an argument and return the number of words contain

in the object

*/

private static int wordCount(String string1)

{

int number = 0;

for(int i = 0; i < string1.length(); i++)

{

char ch = string1.charAt(i);

if(Character.isWhitespace(ch))

{

number = number + 1;

}

}

return number + 1;

}

/*

method should accept a char array as an argument and convert i to a string object.

The method should return to the string object.

*/

private static String arrayToString(char[] charArray)

{

return String.valueOf(charArray);

}

/*

method accepts a reference to a string object as an argument

and returns the character that occurs the most frequently

in the object.

*/



private static char mostFrequent(String string1)

{

char mostOccurrence = ' ';

int most = 0;

int j;

for(int i = 0; i < string1.length(); i++)

{

int count = 0;

char ch = string1.charAt(i);

for(j = 0; j < string1.length(); j++)

{

if(ch == string1.charAt(j))

count = count + 1;

}

if(count >= most)

{

most = count;

mostOccurrence = ch;

}

}

return mostOccurrence;

}

/*

method accepts three references to string object as arguments.

Call them string1, string2, and string3; when it finds an occurrence

of string2, it replaces it with string 3.

*/

private static String replaceSubstring(String string1, String string2,

String string3)

{



return string1.replaceAll(string2, string3);

}

}