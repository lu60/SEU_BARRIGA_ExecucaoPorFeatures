package Suporte;

import Runner.RunSeuBarriga;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

public class Utils extends RunSeuBarriga {

    public static void waitElementBePresent(By element, Integer tempo){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(tempo));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
