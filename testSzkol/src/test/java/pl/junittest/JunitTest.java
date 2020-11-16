package pl.junittest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Junit test")

public class JunitTest {

    @BeforeEach
    public void setUpBeforeEach(){
        System.out.println("-------------Before each test ----------");
    }

    @BeforeAll
    public static void setUpBeforeAll() {
        System.out.println("-------------Before all test ----------");

    }


    @Test
    public void firstJunitTest(){
        assertTrue(5 == 2+3);

    }
    @Test
    public void secondJunitTest(){
        assertTrue(5 == 2+3);

    }
    @DisplayName("String test")
    @Test
    public void stringTest(){
        String simpleString = "simpleString";
        String simple = "simpleString";

        String simpleString_2 = new String("simpleString");
        String simpleString_3 = new String("simpleString");

        assertTrue(simpleString.equals(simpleString_2));


    }
    @Test
    public void zadanie1(){
        String resultString = "Wordpress power 100% of the internet";
        String expectedString = "Wordpress powers [number]%  of the internet";

        assertTrue(resultString.startsWith("Wordpress power "));
        assertTrue(resultString.endsWith(" of the internet"));

    }
    @DisplayName("Nested suite")

    @Test
    public void listTest (){
        List<Integer> results = Arrays.asList(1,2,3,4,5);
        List<Integer> expected = Arrays.asList(3,4,5);

        assertTrue(results.containsAll(expected));

    }
}
