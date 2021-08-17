/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import static com.tsg.unittesting.arrays.ArrayExerciseA.maxOfArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author powel
 */
public class ArrayExerciseATest {
    
    /*
     * Example Results:
     * maxOfArray( {1}  ) ->  1
     * maxOfArray( {3,4,5}  ) ->  5
     * maxOfArray( {-9000, -700, -50, -3}  ) ->  -3
    */
    
    public ArrayExerciseATest() {
    }

    @Test
    public void testmin1() {
        int[] test = {1};
        assertEquals(1,maxOfArray(test),"Max of Array {1} should be 1!");
    }
    
    @Test
    public void testmin5(){
        int[] test = {3,4,5};
        assertEquals(5,maxOfArray(test),"Max of Array {3,4,5} should be 5!");
    }
    
    @Test
    public void testminNeg(){
        int[] test = {-9000,-700,-50,-3};
        assertEquals(-3,maxOfArray(test),"Max of Array {-9000,-700,-50,-3} should be -3!");
    }
    
}
