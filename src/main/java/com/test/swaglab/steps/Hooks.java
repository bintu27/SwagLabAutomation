package com.test.swaglab.steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.util.Date;

import static com.test.swaglab.utils.DriverUtils.getDriver;
import static com.test.swaglab.utils.DriverUtils.tearDown;

public class Hooks {

    @Before
    public void setUp() {
        getDriver();
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        Date currentDate = new Date();
        File screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
            scenario.attach(fileContent, "image/png", "image");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @After
    public void teardown() {
        tearDown();
    }

    @BeforeSuite
    public void beforeSuite() {
        deleteOldReport();
    }

    public void deleteOldReport() {
        String directory = "./test-output";
        File file = new File(directory);
        String[] currentFiles;
        if (file.isDirectory()) {
            currentFiles = file.list();
            for (int i = 0; i < currentFiles.length; i++) {
                File myFile = new File(file, currentFiles[i]);
                myFile.delete();
            }
        }
    }
}
