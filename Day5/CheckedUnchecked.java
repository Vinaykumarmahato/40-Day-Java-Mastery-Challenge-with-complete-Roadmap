package Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedUnchecked {
	 public static void main(String[] args) {
		
		 int result=7/0; // Unchecked Exception
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 try {
			String str=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Checked Exception
		 
	}

}


/*
 


				   BaseException
                        |
        +---------------------------------------+
        |                                       |
     Exception                           SystemExit
        |                                   +----+
        |                                   |
  +-----+-----+                          KeyboardInterrupt
  |           |                             SystemExit
StandardError   |                            SystemError
  +-----------+  |               +-------------+
  |           |  |               |             |
ArithmeticError LookupError  EOFError  KeyboardInterrupt
    +------+    +---------+   |            SyntaxError
    |      |    |         |  GeneratorExit
  ZeroDivisionError   IndexError
                    +------+-------------+
                    |      |             |
                ImportError KeyError     UnicodeError
                  +------+                +
                  |      |              UnicodeEncodeError
               ModuleNotFoundError         UnicodeDecodeError
                   |                      UnicodeTranslateError
            ImportError                UnicodeEncodeError
             UnicodeError



In this representation:

BaseException is the root of the hierarchy.

Exception is a direct subclass of BaseException, which encompasses most of the common exceptions.

SystemExit, KeyboardInterrupt, and SystemError are direct subclasses of BaseException as well.

StandardError is a more general category of exceptions that includes many specific error types.

ArithmeticError is a subclass of StandardError and includes exceptions like ZeroDivisionError.

LookupError is another subclass of StandardError and includes exceptions like IndexError and KeyError.

EOFError, SyntaxError, and GeneratorExit are specific exceptions that inherit from different parent classes.

ImportError is a subclass of Exception and includes exceptions related to import errors.

UnicodeError is a subclass of Exception and encompasses exceptions related to Unicode encoding and decoding.










 
 * */
