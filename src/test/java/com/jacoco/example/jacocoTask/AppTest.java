package com.jacoco.example.jacocoTask;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
       App ob=new App();
       int res =ob.add(7, 8);
       assertEquals(15,res);
    }
    @Test
    public void shouldAnswerWithTru()
    {
       App ob=new App();
       int res =ob.sub(17, 8);
       assertEquals(9,res);
    }
    @Test
    public void shouldAnswerWithTr()
    {
       App ob=new App();
       int res =ob.mul(3, 8);
       assertEquals(24,res);
    }
    @Test
    public void shouldAnswerWithT()
    {
       App ob=new App();
       int res =ob.mod(9, 8);
       assertEquals(1,res);
    }
    
}
