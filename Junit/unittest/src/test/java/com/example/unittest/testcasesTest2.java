package com.example.unittest;

import org.junit.BeforeClass;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class testcasesTest2 {

    @BeforeClass
    public static void beforeclass(){
        System.out.println("Before class");
    }

    @BeforeEach
    public void beforesetup(){
        System.out.println("before");
    }

    @AfterEach
    public void Aftersetup(){
        System.out.println("After");
    }

    @Test
    @DisplayName("test1")
    public void truncateAInFirst2Positions() {
        System.out.println("test1");
    }

    @Test
    @DisplayName("test2")
    public void test2() {
        System.out.println("test2");
    }


//    Arrays.sort

    @Test
    public void test(){
        int[] num = {12,1,3,4};
        int[] exp = {1,2,3,12};
        Arrays.sort(exp);
        assertArrayEquals(exp, num);

    }




}