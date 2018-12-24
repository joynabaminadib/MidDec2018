package string.problems;

import org.testng.Assert;

import java.util.Set;

import static org.testng.Assert.assertTrue;

public class UnitTestingStringProblem {


    public static void main(String[] args) {

            Set<String> output = DuplicateWord.occurance();

           assertTrue(output.contains("Java"));
           assertTrue(output.contains("is"));
           assertTrue(output.contains("a"));
           assertTrue(output.contains("programming"));
        assertTrue(output.contains("Language"));
        assertTrue(output.contains("also"));
        assertTrue(output.contains("an"));
        assertTrue(output.contains("Island"));
        assertTrue(output.contains("of"));
        assertTrue(output.contains("Indonesia"));
        assertTrue(output.contains("widely"));
        assertTrue(output.contains("used"));
        assertTrue(output.contains("language"));

        assertTrue(output.size() == 3);
        assertTrue(output.size()== 1);
        }
}

