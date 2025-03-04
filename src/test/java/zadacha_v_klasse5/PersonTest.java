package zadacha_v_klasse5;

import KlassLedenevRoman._2025_01_28.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;

    @BeforeEach
    void init() {
        person = new Person("SomeName");
    }

    @Test
    void grow() {
        //given
        int expectedAge = 19;

        //when
        person.grow();

        //then
        Assertions.assertEquals(expectedAge, person.getAge());
    }

    @Test
    void addCat() {
        //given
        List<Cat> expectedCats = List.of(new Cat("Boston"), new Cat("Murka"),
                new Cat("Ginger"), new Cat("Viski"), new Cat("New"));

        //when
        person.addCat(new Cat("New"));

        //then
        Assertions.assertEquals(expectedCats, person.getCats());
    }

    @Test
    void test() {
        //given
        Person expected = new Person("SomeName");

        //then
        Assertions.assertEquals(expected, person);
    }
}