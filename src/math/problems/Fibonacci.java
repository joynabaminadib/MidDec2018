package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
            //0 1 1 2 3 5 8 13 (fibonacci sum of last 2 numbers such as 0+1= 1; 1+1 = 2)
            int a = 0;
            int b= 1;
            System.out.print(a+" "+b);
            int c;
            for(int i=1; i<40; i++)
            {
                c= a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
            }

        }

    }


