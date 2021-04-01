/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.group31adp2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author nndon
 */
public class GroupWorkTest {
    


    @BeforeEach
    public void setUp() 
    {
        
    }
    
    @AfterEach
    public void tearDown() 
    {
        
    }

    /**
     * Test of multiply method, of class GroupWork.
     */
    @Test
    public void equalityTestMultiply() {
        System.out.println("multiply");
        String num1 = "3";
        String num2 = "7";
        String num3 = "2";
        GroupWork instance = new GroupWork();
        int expResult = 63;
        int result = instance.multiply(num1, num2, num3);
        assertEquals(expResult, result);

    }
    
    @Test
    public void identityTestMultiply2() {
        System.out.println("multiply");
        String num1 = "2";
        String num2 = "7";
        String num3 = "2";
        GroupWork instance = new GroupWork();
        int expResult = 63;
        int result = instance.multiply(num1, num2, num3);
        assertSame(num3, num1);

    }
    
    @Test
    public void failTestMultiply3() {
        System.out.println("multiply");
        String num1 = "2";
        String num2 = "7";
        String num3 = "2";
        GroupWork instance = new GroupWork();
        int expResult = 63;
        int result = instance.multiply(num1, num2, num3);
        fail("This test method will fail");
    }
    
   @Test
   @Disabled
    public void disableTestMultiply4() {
        System.out.println("multiply");
        String num1 = "2";
        String num2 = "7";
        String num3 = "2";
        GroupWork instance = new GroupWork();
        int expResult = 63;
        int result = instance.multiply(num1, num2, num3);
        assertSame(num3, num1);
    }
    
    @Test
    @Timeout(100)
    public void timeoutTest()
    {
        while(true);
    }

}
