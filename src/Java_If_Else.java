import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Java_If_Else {
        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String myString="";
            if(N>=1 && N<=100){
                if(N%2==1){
                    myString = "Weird";
                }
                else{
                    if(N>=2 && N<=5 ){
                        myString= "Not Weird";
                    }
                    else if (N>=6 && N<=20){
                        myString = "Weird";
                    }
                    else if(N>20) {
                        myString = "Not Weird";
                    }
                }
            }
            else{
                myString="Enter a number between 1 and 100.";
            }
            System.out.println(myString);
            scanner.close();
        }
    }

