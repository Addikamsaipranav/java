import java.util.Scanner;
class TestDetails {

       protected float marks[][]; // array to store marks of students

      

       // constructor

       public TestDetails()

       {

             marks=null;

       }

      

       // method to store the marks of the students

       public void storeMarks(float inMarks[][])

       {

             marks = new float[inMarks.length][];

             for(int i=0;i<inMarks.length;i++)

             {

                    marks[i] = new float[inMarks[i].length];

                    for(int j=0;j<inMarks[i].length;j++)

                           marks[i][j] = inMarks[i][j];

             }

       }

      

       // method to display the marks of the students

       public void displayMarks()

       {

             for(int i=0;i<marks.length;i++)

             {

                    System.out.print("\nStudent "+i+" : ");

                    for(int j=0;j<marks[i].length-1;j++)

                           System.out.print(marks[i][j]+", ");

                    System.out.print(marks[i][marks[i].length-1]);

                   

             }

             System.out.println();

       }

}

//end of TestDetails.java

// NoticePeriod.java

class NoticePeriod extends TestDetails{

      

             // method to print the ids of the students on the bench and print the number of students on bench

             public void printBench()

             {

                    System.out.print("Students ID who are on bench : ");

                    int benchStudents = 0;

                    int countAbove50;

                    // loop to calculate the number of students on bench

                    for(int i=0;i<marks.length;i++)

                    {

                           if(marks[i].length < 3)

                           {

                                 benchStudents++;

                                 System.out.print(i+" ");

                           }

                           else

                           {

                                 countAbove50 = 0;

                                 for(int j=0;j<marks[i].length;j++)

                                 {

                                        if(marks[i][j] >= 50)

                                               countAbove50++;

                                        if(countAbove50 >= 3)

                                               break;

                                 }

                                

                                 if(countAbove50 < 3)

                                 {

                                        System.out.print(i+" ");

                                        benchStudents++;

                                 }

                           }

                    }

                   

                    System.out.println("\nTotal Students on bench : "+benchStudents);

             }

            

}

//end of NoticePeriod.java

// Main.java : Driver class to input the number of marks for each student and marks for each student and display the details of each student and number of students on bench and ids of students on bench



public class Main {

                   

             public static void main(String[] args)

             {

                    NoticePeriod notice = new NoticePeriod();

                    float marks[][] = new float[25][];

                    Scanner scan = new Scanner(System.in);

                    // loop to get the number of marks for each student and marks for each student

for(int i=0;i<marks.length;i++)

                    {

                           System.out.print("Enter the number of marks for Student-"+i+" (max 7 marks): ");

                           int numMarks = scan.nextInt();

                           marks[i] = new float[numMarks];

                           for(int j=0;j<marks[i].length;j++)

                           {

                                 System.out.print("Enter marks-"+(i+1)+" : ");

                                 marks[i][j] = scan.nextFloat();

                           }

                    }

      

                    notice.storeMarks(marks);

                    notice.displayMarks();

                    System.out.println();

                    notice.printBench();

                    scan.close();

             }

}