import java.util.Scanner;

import java.lang.System;


public class Main
{

  public static void main (String[]args)
  {

    Scanner in = new Scanner (System.in);


    VerifyOperator vo = new VerifyOperator ();
    Addition ad = new Addition ();
    Multiplication mul = new Multiplication ();
    Subtraction sub = new Subtraction ();
    Division div = new Division ();
    double result;

    char operator;


      System.out.println ("---------------CALCULATOR---------------");

      System.out.print ("enter the first number  ");


      try
    {

      result = in.nextDouble ();

      System.out.print ("enter the operator(+,*,/,-,=)  ");

      operator = in.next ().charAt (0);

        vo.verifyOperator (operator);

        System.out.print ("enter the next digit  ");

      double number2 = in.nextDouble ();


      switch (operator)
	{


	case '+':
	  result = ad.Addition (result, number2);

	  break;


	  case '-':result = sub.subtraction (result, number2);

	  break;


	  case '*':result = mul.multiplication (result, number2);

	  break;


	  case '/':result = div.division (result, number2);

	  break;


	  case '=':System.out.println (result);

	  System.exit (0);


	}

      System.out.print ("the result is   ");

      System.out.println (result);

    }

    catch (Exception e)
    {

      System.out.println (e + ". Invalid Input");

    }


    in.close ();


  }

}
