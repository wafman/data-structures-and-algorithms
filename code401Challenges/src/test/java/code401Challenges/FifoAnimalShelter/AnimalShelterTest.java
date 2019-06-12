package code401Challenges.FifoAnimalShelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void testIsEmpty(){
        AnimalShelter classUnderTest = new AnimalShelter();
        assertTrue("should return true", classUnderTest.isEmpty());
    }

    @Test
    public void testEnqueue_single(){
        AnimalShelter classUnderTest = new AnimalShelter();
        classUnderTest.enqueue(new Animal("Cat"));
        assertTrue("should return 'Cat'.", classUnderTest.getFirst().value.toString() == "Cat");
    }

    @Test
    public void testEnqueue_multiple(){
        AnimalShelter classUnderTest = new AnimalShelter();
        classUnderTest.enqueue(new Animal("Dog"));
        classUnderTest.enqueue(new Animal("Cat"));
        classUnderTest.enqueue(new Animal("Bird"));
        assertEquals("Should return 3", 3, classUnderTest.getCount());
    }

    @Test
    public void testDequeue_single(){
        AnimalShelter classUnderTest = new AnimalShelter();
        classUnderTest.enqueue(new Animal("Dog"));
        classUnderTest.enqueue(new Animal("Cat"));
        classUnderTest.enqueue(new Animal("Bird"));
        assertEquals("should return 'Dog", "Cat", classUnderTest.dequeue("Cat").toString());
        assertEquals("should return 2", 2, classUnderTest.getCount());
    }

    @Test
    public void testDequeue_multiple(){
        AnimalShelter classUnderTest = new AnimalShelter();
        classUnderTest.enqueue(new Animal("Dog"));
        classUnderTest.enqueue(new Animal("Cat"));
        classUnderTest.enqueue(new Animal("Bird"));
        assertEquals("should return 'Bird'.", "Bird", classUnderTest.dequeue("Bird").toString());
        assertEquals("should return 'Dog'.", "Dog", classUnderTest.dequeue("Dog").toString());
        assertEquals("should return 'Cat'.", "Cat", classUnderTest.dequeue("Cat").toString());
        assertEquals("should return 0", 0, classUnderTest.getCount());
    }

}