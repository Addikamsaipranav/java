import java.io.DataInputStream;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import java.io.InputStream;

import java.io.BufferedInputStream;

import java.lang.reflect.Method;

import java.util.Scanner;

public class CodeEvaluator1 {

public static void main(String[] args) throws IOException, ClassNotFoundException {

count ();

}

public static void count() throws IOException {

String input;

Scanner in = new Scanner(System.in);

System.out.println(“Enter file path”);

input = in.nextLine();

FileInputStream fis = null;

BufferedInputStream bis = null;

DataInputStream dis = null;

int totalCount=0;

int blankCount=0;

int commentCount=0;

String currentLine;

Boolean commentStatus=false;

try {

File file = new File(input);

fis = new FileInputStream(file);

bis = new BufferedInputStream(fis);

dis = new DataInputStream(bis);

while (dis.available() != 0) {

totalCount++;

currentLine=dis.readLine();

currentLine=currentLine.trim();

if (currentLine.length()==0)

blankCount++;

if ((currentLine.length()>1) && (currentLine.charAt(0)==’/’ ) && (currentLine.charAt(1)==’*’ ))

commentStatus=true;

if ((commentStatus==true) && (currentLine.length()>0))

{

commentCount++;

if ((currentLine.length()>1) && (currentLine.charAt(currentLine.length()-2)==’*’ ) && (currentLine.charAt(currentLine.length()-1)==’/’ ))

{commentStatus=false;

}

}

else if ((currentLine.length()>1) && (currentLine.charAt(0)==’/’ ) && (currentLine.charAt(1)==’/’ ))

commentCount++;

}

System.out.println(“Total Lines: ” + totalCount);

System.out.println(“Blank Lines: ” + blankCount);

System.out.println(“Comment Lines: ” + commentCount);

System.out.println(“Actual Code Lines: ” + (totalCount-blankCount – commentCount));

} catch (IOException e) {

System.out.println(“Sorry file coule not be found”);

//e.printStackTrace();

} finally {

try {

fis.close();

bis.close();

dis.close();

} catch (IOException ex) {

//            ex.printStackTrace();

}

}

}

}