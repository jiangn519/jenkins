/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usager
 */
public class CalculerTest {
    
    public CalculerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @org.junit.Test
    public void testSomeMethod() {
        int expresult=50,resultat ;
        Calculer c=new Calculer();
        resultat=c.add(5, 10);
        assertEquals(expresult,resultat);
        
        
        
        
        
    }
    
    @org.junit.Test
    public void testSomeMethod1() {
        int expresult=15,resultat ;
        Calculer c=new Calculer();
        resultat=c.mul(5, 10);
        assertEquals(expresult,resultat);
        
        
        
        
        
    }
    
}
