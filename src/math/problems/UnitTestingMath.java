package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {

Factorial factorial = new Factorial();
        try {//unit testing for Factorial
            Assert.assertEquals(Factorial.calcFact(5), 120);
            System.out.println("Unit testing passed");
        }catch (AssertionError ar){
            System.out.println("Unit testing failed");
        }



    }
}



