package code401Challenges.FifoAnimalShelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    @Test
    public void testConstructor(){
        Animal animal = new Animal("Dog");
        assertEquals("should return Dog", "Dog", animal.toString());
    }

}