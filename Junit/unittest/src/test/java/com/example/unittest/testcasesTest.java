package com.example.unittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testcasesTest {

    @Test
    @DisplayName("truncateAInFirst2Positions")
    public void truncateAInFirst2Positions() {
        TestCases testcases = new TestCases();
//        AACD -> CD ACD -> CD, CDEF -> CDEF, CDAA -> CDAA
        String str = testcases.truncateAInFirst2Positions("AACD");
        assertEquals(str,"CD");
    }

    @Test
    @DisplayName("test2")
    public void test2() {
        TestCases testcases = new TestCases();
//        AACD -> CD ACD -> CD, CDEF -> CDEF, CDAA -> CDAA
        String str = testcases.truncateAInFirst2Positions("ACD");
        assertEquals(str,"CD");
    }

    @Test
    @DisplayName("areFirstAndLastTwoCharactersTheSame")
    public void areFirstAndLastTwoCharactersTheSame() {
        TestCases testcases = new TestCases();
//        AACD -> CD ACD -> CD, CDEF -> CDEF, CDAA -> CDAA
        Boolean str = testcases.areFirstAndLastTwoCharactersTheSame("ABABABAB");
        assertTrue(str);
    }


}