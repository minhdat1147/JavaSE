package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test_Main_Success(){
        System.out.println("Test main success");
        assertEquals(3,Main.tatal(1,2));
    }

    @Test
    void test_Main_failure(){
        System.out.println("Test main failure");
        assertNotEquals(4,Main.tatal(1,2));
    }
    @Test
    void test_assertTrue(){
        assertTrue(4 == Main.tatal(1,2));
    }
}