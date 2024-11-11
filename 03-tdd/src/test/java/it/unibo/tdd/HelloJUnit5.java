package it.unibo.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;

public class HelloJUnit5 {
    @BeforeEach
    public void setUp() { 
        System.out.println("@BeforeEach");
    }

    @AfterEach
    public void tearDown() { 
        System.out.println("@AfterEach");
    }

    @Test
    public void helloJunit5() {
        Assertions.assertTrue(true);
    }    
}
