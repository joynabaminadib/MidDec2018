package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {


    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *
     */
    static int fact = 1;

    public static void main(String[] args) {
        int num = 5;

        Factorial f = new Factorial();
        f.calcFact(num);
        System.out.println(fact);
    }

    static int calcFact(int num) {
        if (num >= 1) {
            fact = fact * num;
            calcFact(num - 1);
        }
        return fact;

    }

    }



