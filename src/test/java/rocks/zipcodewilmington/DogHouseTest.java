package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Before
    public void resetDogHouseBefore() {
        DogHouse.clear();
    }

    @Test
    public void addTest() {
        // Given
        int catId = 86;
        Dog expectedDog =  new Dog(null, null, catId);

        // When
        DogHouse.add(expectedDog);
        Dog actualDog = DogHouse.getDogById(catId);

        // Then
        Assert.assertEquals(expectedDog, actualDog);

    }

    @Test
    public void addTest2() {
        // Given
        int catId = 56;
        Dog expectedDog =  new Dog(null, null, catId);

        // When
        DogHouse.add(expectedDog);
        Dog actualDog = DogHouse.getDogById(catId);

        // Then
        Assert.assertEquals(expectedDog, actualDog);

    }

    @Test
    public void removeByIdTest() {
        // Given
        int catId = 86;
        Dog testDog =  new Dog(null, null, catId);
        DogHouse.add(testDog);

        Dog expectedDog = null;

        // When
        DogHouse.remove(catId);
        Dog actualDog = DogHouse.getDogById(catId);

        // Then
        Assert.assertEquals(expectedDog, actualDog);

    }

    @Test
    public void removeByIdTest2() {
        // Given
        int catId = 98;
        Dog testDog =  new Dog(null, null, catId);
        DogHouse.add(testDog);

        Dog expectedDog = null;

        // When
        DogHouse.remove(catId);
        Dog actualDog = DogHouse.getDogById(catId);

        // Then
        Assert.assertEquals(expectedDog, actualDog);

    }

    @Test
    public void removeByDogTest() {
        // Given
        int catId = 987;
        Dog testDog =  new Dog(null, null, catId);
        DogHouse.add(testDog);

        Dog expectedDog = null;

        // When
        DogHouse.remove(testDog);
        Dog actualDog = DogHouse.getDogById(catId); // this should be null if the cat has been removed

        // Then
        Assert.assertEquals(expectedDog, actualDog);

    }

    @Test
    public void removeByDogTest2() {
        // Given
        int catId = 4567;
        Dog testDog =  new Dog(null, null, catId);
        DogHouse.add(testDog);

        Dog expectedDog = null;

        // When
        DogHouse.remove(testDog);
        Dog actualDog = DogHouse.getDogById(catId); // this should be null if the cat has been removed

        // Then
        Assert.assertEquals(expectedDog, actualDog);

    }

    @Test
    public void getNumberOfDogsTest() {
        // Given
        Dog testDog =  new Dog(null, null, null);
        int expectedNumberOfDogs = 86;

        // When
        for (int i = 0; i < expectedNumberOfDogs; i++){
            DogHouse.add(testDog);
        }

        int actualNumberOfDogs = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expectedNumberOfDogs, actualNumberOfDogs);
    }

    @Test
    public void getNumberOfDogsTest2() {
        // Given
        Dog testDog =  new Dog(null, null, null);
        int expectedNumberOfDogs = 234;

        // When
        for (int i = 0; i < expectedNumberOfDogs; i++){
            DogHouse.add(testDog);
        }

        int actualNumberOfDogs = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expectedNumberOfDogs, actualNumberOfDogs);
    }
}
