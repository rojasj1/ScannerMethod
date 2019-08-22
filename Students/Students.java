import java.util.Scanner;
/* Justin Rojas */
/* Format definition: Method */
/* A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, and they are also known as functions.
Why use methods? To reuse code: define the code once, and use it many times. In the following we will be creating different methods
to verify our Output.
********************************************************************************************************************************************
1. Declare a method within a class
2. Call the method
3. Formulate
4. Execute
*/
/*
Using an if and else statement we can determine which method is valid. 
In this example we are determining how many students are in the classroom using a scanner method, 
we demonstrate how many students are in the classroom. While using a while loop, the program will end when the user enters a letter.
*/

public class Students {

  public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);
  
    while(sc.hasNextInt())  
  {
    int capacity = sc.nextInt(); 

    //Marks if any students are absent.
    if (capacity < 28 ) { 
    System.out.println("\nSome students are absent\n"); 
    }
    // If the class is more than 28 students the output will result over the top
    else if (capacity > 28) {
    System.out.println("\nToo many kids!\n"); 
    
    }

    else {
    System.out.println("\nClass is all here!\n"); 
    } 

  } 
  sc.close();
 }  //exit by entering a letter
 
} 



