package testrunner;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.CalculatorScreen;
import setup.Setup;

import java.io.IOException;

public class CalculatorTestRunner extends Setup {

    CalculatorScreen calculatorScreen;
    @Test(priority = 0, description = "Add in two Numbers")
    public void doAddition() throws IOException, InterruptedException {

        calculatorScreen = new CalculatorScreen(driver);

        String result = calculatorScreen.doAddition();
        System.out.println(result);
        Assert.assertEquals(result,"13");

    }
@Test(priority = 1, description = "Subtract in two Numbers")
    public void doSubtraction() throws IOException, InterruptedException {

        calculatorScreen = new CalculatorScreen(driver);

        String result = calculatorScreen.doSubtraction();
        System.out.println(result);
        Assert.assertEquals(result,"3");

    }
    @Test(priority = 2, description = "Multiplication in two Numbers")
    public void doMultiplicatiom() throws IOException, InterruptedException {

        calculatorScreen = new CalculatorScreen(driver);

        String result = calculatorScreen.doMultiplication();
        System.out.println(result);
        Assert.assertEquals(result,"40");

    }
    @Test(priority = 2, description = "Division in two Numbers")
    public void doDivision() throws IOException, InterruptedException {

        calculatorScreen = new CalculatorScreen(driver);

        String result = calculatorScreen.doDivision();
        System.out.println(result);

    }
}
