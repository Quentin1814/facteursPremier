import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FacteursPremiersTest {
    List<Integer> actualResult;
    List<Integer> expectedResult;

    @BeforeEach
    void start() {
        expectedResult = new ArrayList<>();
    }

    @Test
    void testGenerateForOne() {
        // Cas de base : nombre égal à 1

        int number = 1;

        actualResult = FacteursPremiers.generate(number);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void testGenerateForPrimeNumber() {
        // Cas simple : nombre premier
        int number = 2;

        actualResult = FacteursPremiers.generate(number);

        expectedResult.add(2);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void testGenerateForProductOfTwoPrimes() {
        // Cas de nombre composé avec deux facteurs premiers distincts
        int number = 6;

        actualResult = FacteursPremiers.generate(number);

        expectedResult.add(2);
        expectedResult.add(3);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void testGenerateForPowerOfPrime() {
        // Cas de nombre composé avec un facteur premier répété
        int number = 8;

        actualResult = FacteursPremiers.generate(number);

        expectedResult.add(2);
        expectedResult.add(2);
        expectedResult.add(2);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void testGenerateForCompositeWithMultiplePrimes() {
        // Cas de nombre composé avec des facteurs premiers multiples
        int number = 12;

        actualResult = FacteursPremiers.generate(number);

        expectedResult.add(2);
        expectedResult.add(2);
        expectedResult.add(3);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void testGenerateForCompositeWithMultiplePrimesAndRepeats() {
        // Cas de nombre composé avec des facteurs premiers multiples et répétés
        int number = 18;

        actualResult = FacteursPremiers.generate(number);

        expectedResult.add(2);
        expectedResult.add(3);
        expectedResult.add(3);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    /*
    @Test
    void testGenerateForLargeNumber() {
        // Cas de nombre très grand
        assertThat(FacteursPremiers.generate(1001)).containsExactlyInAnyOrderElementsOf(List.of(7, 11, 13));
    }*/
}
