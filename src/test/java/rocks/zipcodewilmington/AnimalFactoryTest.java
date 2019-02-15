package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    @Test
    public void createDogTest() {
        // Given
        String expectedName = "Jack";
        Date expectedBirthDate = new Date();

        // When
        Dog testDog = AnimalFactory.createDog(expectedName, expectedBirthDate);

        String actualName = testDog.getName();
        Date actualBirthDate = testDog.getBirthDate();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

    @Test
    public void createCatTest() {
        // Given
        String expectedName = "Marcy";
        Date expectedBirthDate = new Date();

        // When
        Cat testCat = AnimalFactory.createCat(expectedName, expectedBirthDate);

        String actualName = testCat.getName();
        Date actualBirthDate = testCat.getBirthDate();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }
}
