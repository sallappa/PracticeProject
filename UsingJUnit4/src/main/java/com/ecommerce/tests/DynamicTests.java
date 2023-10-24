package com.ecommerce.tests;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertTrue; // Add this import

@DisplayName("JUnit 5 Dynamic Tests Example")
public class DynamicTests {

    @TestFactory
    Collection<DynamicTest> dynamicTests() {
        return Arrays.asList(
                dynamicTest("simple dynamic test", () -> assertTrue(true)),
                dynamicTest("My Executable Class", new MyExecutable()),
                dynamicTest("Exception Executable", () -> {
                    try {
                        throw new Exception("Exception Example");
                    } catch (Exception e) {
                        // Handle the exception if needed
                    }
                }),
                dynamicTest("simple dynamic test-2", () -> assertTrue(true))
        );
    }

    private DynamicTest dynamicTest(String name, Executable executable) {
        return DynamicTest.dynamicTest(name, executable);
    }
}

class MyExecutable implements Executable {

    @Override
    public void execute() throws Throwable {
        System.out.println("Hello World!");
    }
}
