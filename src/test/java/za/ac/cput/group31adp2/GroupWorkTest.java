/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.group31adp2;

import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author mxo
 */
public class GroupWorkTest {
    
    public GroupWorkTest() {
    }

    /**
     * Test of main method, of class GroupWork.
     */
    @Test
    public void testEquality()
    {
        GroupWork test = new GroupWork();
        int output = test.square(5);
        assertEquals(25, output);
    }
    
    @Test
    public void testIdentity()
    {
     GroupWork test = new GroupWork();
        int output = test.square(5);
        assertSame(25, output);   
    }
    @Test
    @Timeout(7)
    public void timeoutTest()
    {
        Assertions.assertTimeout(Duration.ofSeconds(8), ()->dealySeconds(6));
    }
     private Object dealySeconds(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
    
   
    @Test
    public void test1(){
        System.out.print("@befor method");
    }
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GroupWork.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

   
