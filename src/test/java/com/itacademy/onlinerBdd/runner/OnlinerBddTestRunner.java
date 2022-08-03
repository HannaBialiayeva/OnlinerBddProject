package com.itacademy.onlinerBdd.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
            plugin = {"pretty", "html:target/onliner-htmlreport/OnlinerBddTestRunner",
                    "json:target/json-files/OnlinerBddTestRunner.json",
                    "testng:target/testng_onlinerBdd.xml"},
            monochrome = true,
            tags = "@smoke",
            glue = "com.itacademy.onlinerBdd.definitions",
            features = "classpath:src/test/resources/com.itacademy.onlinerBdd/features"
    )

    public class OnlinerBddTestRunner extends AbstractTestNGCucumberTests {
    }

