import java.util.InputMismatchException;

import java.util.Scanner;


public class VerifyOperator
{

  public void verifyOperator (char operator)
  {

    if (!(operator == '+' || operator == '-' || operator == '*'|| operator == '/' || operator == '='))

      throw new InputMismatchException ();

  }


}
