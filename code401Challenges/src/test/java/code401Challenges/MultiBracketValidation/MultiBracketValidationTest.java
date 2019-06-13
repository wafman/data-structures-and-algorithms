package code401Challenges.MultiBracketValidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void testMultiBracketValidation_single(){
        MultiBracketValidation classUnderTest = new MultiBracketValidation();
        assertTrue(classUnderTest.multiBracketValidation("{}"));
    }

    @Test
    public void testMultiBracketValidation_multiple(){
        MultiBracketValidation classUnderTest = new MultiBracketValidation();
        assertTrue(classUnderTest.multiBracketValidation("{}"));
        assertTrue(classUnderTest.multiBracketValidation("{}(){}"));
        assertTrue(classUnderTest.multiBracketValidation("(){}[[]]"));
    }

    @Test
    public void testMultiBracketValidation_withWords(){
        MultiBracketValidation classUnderTest = new MultiBracketValidation();
        assertTrue(classUnderTest.multiBracketValidation("()[[Extra Characters]]"));
        assertTrue(classUnderTest.multiBracketValidation("{}{Code}[Fellows](())"));
    }

    @Test
    public void testMultiBracketValidation_singleFail(){
        MultiBracketValidation classUnderTest= new MultiBracketValidation();
        assertFalse(classUnderTest.multiBracketValidation("(]("));
    }

    @Test
    public void testMultiBracketvalidation_multipleFails(){
        MultiBracketValidation classUnderTest = new MultiBracketValidation();
        assertFalse(classUnderTest.multiBracketValidation("[({}]"));
        assertFalse(classUnderTest.multiBracketValidation("{(})"));
    }

}