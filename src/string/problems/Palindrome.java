package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


            String inputString = "MOM";


            int length  = inputString.length();
            int i, begin, end, middle;

            begin  = 0;
            end    = length - 1;
            middle = (begin + end)/2;

            for (i = begin; i <= middle; i++) {
                if (inputString.charAt(begin) == inputString.charAt(end)) {
                    begin++;
                    end--;
                }
                else {
                    break;
                }
            }
            if (i == middle + 1) {
                System.out.println("Palindrome");
            }
            else {
                System.out.println("Not a palindrome");
            }
        }
    }


        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */


