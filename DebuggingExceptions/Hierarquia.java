package DebuggingExceptions;
import java.io.*;
public class Hierarquia{
public static void main(String[] args) {
    test();
    System.out.println("Terminou");    

    }

public static void test() {
                    new Throwable(); //pai de exceptions e errors
                ///                   \
         new Exception();         new OutOfMemoryError(); // errors
            ///            \
    new RuntimeException(); new FileNotFoundException(); //exceptions
//          /\ unchecked                //checked
}

}
