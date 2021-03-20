package com.example.unittest;

import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;



import java.time.Duration;

import static junit.framework.TestCase.*;
import static org.junit.jupiter.api.Assertions.assertTimeout;

@SpringBootTest
class UnittestApplicationTests {

    @BeforeEach
    void beforeEach(TestInfo info){
        System.out.println("initialize before each method"+ info.getDisplayName());
    }

    @AfterEach
    void afterEach(){
        System.out.println("initialize After each method");
    }

    @Test
    void contextLoads() {
        int length = "ABCD".length();
        int expected_length=4;
        Assertions.assertEquals(expected_length, length);

    }

    @Test
    void toUppercase(){
        String str = "abc";
        String result = str.toUpperCase();
        Assertions.assertNotNull(result);
        Assertions.assertEquals("ABC", result);
    }

    @Test
    void contains(){
        String str = "abcasdbadb";
        boolean result = str.contains("db");
        Assertions.assertEquals(true, result);
    }

    @Test()
    @DisplayName("When length is null, throw an exception")
    void test_exception(){

        String str = null;
        Assert.assertThrows(NullPointerException.class, () -> {str.length();});
    }
    @ParameterizedTest
    @ValueSource(strings={"ABCD", "A", "BD", "D"})
    @DisplayName("Parameterized test")
    void length_greater_then_zero(String str){
        Assertions.assertTrue(str.length()>0);
//        assertTrue("ABCD".length()<0);

    }


    @Test
    @DisplayName("multi condition test CSV Source")
    void multicondition(){
        assertEquals("ABC".length(), 3 );
        assertEquals("aBc".toUpperCase(), "ABC" );
        assertEquals("".length(),0  );
    }


    @DisplayName("multi condition test")
    @ParameterizedTest(name = "{0}  length is  {1}" )
    @CsvSource(value = {"aBc, ABC", "'', ''"})
    void multiconditionCSVcondition(String word, String capitalizewords){
        Assertions.assertEquals(capitalizewords, word.toUpperCase());

    }

//    repeat test multiple test
    @Test
    @RepeatedTest(5)
    void repeattest()
    {
        assertFalse("abababa".contains("aab"));
    }


//    perform test check the performence of code in seconds
    @Test
    void performanceTest(){
        assertTimeout(Duration.ofMillis(2),
                () -> System.out.println("performence test")
                );
    }



    private String str="hello";

    @Nested
    @DisplayName("For an empty String")
    class emptyStringTest{

        @BeforeEach
        @DisplayName("make empty")
        void settoEmpty(){
            str="";
        }

        @Test
        @DisplayName("check length")
        void lengthIsZero(){
            Assertions.assertEquals(0, str.length());
        }

        @Test
        @DisplayName("upper case")
        void uppercaseIsEmpty(){
            Assertions.assertEquals("", str.toUpperCase());
        }
    }

}
