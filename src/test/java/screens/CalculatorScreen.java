package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setup.Setup;

import java.io.IOException;

import static setup.Setup.PACKAGE_ID;

public class CalculatorScreen {

    AndroidDriver driver;
    @FindBy(id= PACKAGE_ID +":id/digit_5")
    AndroidElement btn5;
    @FindBy(id= PACKAGE_ID +":id/digit_8")
    AndroidElement btn8;
    @FindBy(id= PACKAGE_ID +":id/op_add")
    AndroidElement btnPlus;
    @FindBy(id= PACKAGE_ID +":id/op_sub")
    AndroidElement btnSubtraction;
    @FindBy(id= PACKAGE_ID +":id/op_mul")
    AndroidElement btnMultiplication;
    @FindBy(id= PACKAGE_ID +":id/op_div")
    AndroidElement btnDivision;
    @FindBy(id= PACKAGE_ID +":id/result_preview")
    AndroidElement resultPreview ;

    @FindBy(id = Setup.PACKAGE_ID+ ":id/clr")
    AndroidElement btnClear;


    public CalculatorScreen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public String doAddition() throws InterruptedException {

        Thread.sleep(2000);
        btn5.click();
        btnPlus.click();
        btn8.click();
        return resultPreview.getText();
    }

    public String doSubtraction() throws InterruptedException {

        Thread.sleep(2000);
        btnClear.click();
        btn8.click();
        btnSubtraction.click();
        btn5.click();
        return resultPreview.getText();
    }

    public String doMultiplication() throws InterruptedException {

        Thread.sleep(2000);
        btnClear.click();
        btn5.click();
        btnMultiplication.click();
        btn8.click();
        return resultPreview.getText();
    }

    public String doDivision() throws InterruptedException {

        Thread.sleep(2000);
        btnClear.click();
        btn8.click();
        btnDivision.click();
        btn5.click();
        return resultPreview.getText();
    }


}
