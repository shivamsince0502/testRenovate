package com.example.testRenovate.testJunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.testRenovate.controller.sampleController;

public class testNew {

    @Test
    public void testGetString() {
        // Create an instance of the sampleController
        sampleController sampleController = new sampleController();

        // Call the getString() method and store the result
        String result = sampleController.getString();

        // Assert that the result is equal to "Shivam"
        assertEquals("Shivam", result);
    }
}
