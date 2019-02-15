package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    @Test
    public void constructorTest() {
        // Given
        String givenName = "Pooch";
        Date givenBirthDate = new Date();
        Integer givenId = 890;

        // When
        Dog testDog = new Dog(givenName, givenBirthDate, givenId);

        String retrievedName = testDog.getName();
        Date retrievedBirthDate = testDog.getBirthDate();
        Integer retrievedId = testDog.getId();

        // Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setNameTest1() {
        // Given
        Dog testDog = new Dog("", new Date(), 0);
        String expectedNextName = "Sally";

        // When
        testDog.setName(expectedNextName);
        String actualNextName = testDog.getName();

        // Then
        Assert.assertEquals(expectedNextName, actualNextName);
    }

    @Test
    public void setNameTest2() {
        // Given
        Dog testDog = new Dog("asdf", new Date(), 38);
        String expectedNextName = "Sally";

        // When
        testDog.setName(expectedNextName);
        String actualNextName = testDog.getName();

        // Then
        Assert.assertEquals(expectedNextName, actualNextName);
    }

    @Test
    public void setNameTest3() {
        // Given
        Dog testDog = new Dog("", new Date(), 0);
        String expectedNextName = "knaifvub";

        // When
        testDog.setName(expectedNextName);
        String actualNextName = testDog.getName();

        // Then
        Assert.assertEquals(expectedNextName, actualNextName);
    }

    @Test
    public void setNameTest4() {
        // Given
        Dog testDog = new Dog("joijasodifj", new Date(), 0);
        String expectedNextName = ";lkasjd;lfk";

        // When
        testDog.setName(expectedNextName);
        String actualNextName = testDog.getName();

        // Then
        Assert.assertEquals(expectedNextName, actualNextName);
    }

    @Test
    public void setBirthDateTest1() {
        // Given
        Dog testDog = new Dog("", new Date(), 0);
        Date expectedNextBirthDate = new Date();

        // When
        testDog.setBirthDate(expectedNextBirthDate);
        Date actualNextBirthDate = testDog.getBirthDate();

        // Then
        Assert.assertEquals(expectedNextBirthDate, actualNextBirthDate);
    }

    @Test
    public void setBirthDateTest2() {
        // Given
        Dog testDog = new Dog("uahjg", new Date(), 52);
        Date expectedNextBirthDate = new Date();

        // When
        testDog.setBirthDate(expectedNextBirthDate);
        Date actualNextBirthDate = testDog.getBirthDate();

        // Then
        Assert.assertEquals(expectedNextBirthDate, actualNextBirthDate);
    }

    @Test
    public void speakTest1() {
        // Given
        Dog testDog = new Dog("", new Date(), 0);
        String expectedSpeak = "bark!";

        // When
        String actualSpeak = testDog.speak();

        // Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void speakTest2() {
        // Given
        Dog testDog = new Dog("liuakdsjf", new Date(), 986);
        String expectedSpeak = "bark!";

        // When
        String actualSpeak = testDog.speak();

        // Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void eatTest1() {
        // Given
        Dog testDog = new Dog("", new Date(), 0);
        int expectedNumberOfMealsEaten = 1;
        Food testFood = new Food();

        // When
        testDog.eat(testFood);
        int actualNumberOfMealsEaten = testDog.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expectedNumberOfMealsEaten, actualNumberOfMealsEaten);
    }

    @Test
    public void eatTest2() {
        // Given
        Dog testDog = new Dog("", new Date(), 0);
        int expectedNumberOfMealsEaten = 9;
        Food testFood = new Food();

        // When
        for(int i = 0; i < 9; i++){
            testDog.eat(testFood);
        }
        int actualNumberOfMealsEaten = testDog.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expectedNumberOfMealsEaten, actualNumberOfMealsEaten);
    }

    @Test
    public void eatTest3() {
        // Given
        Dog testDog = new Dog("iuashdof", new Date(), 876);
        int expectedNumberOfMealsEaten = 3;
        Food testFood = new Food();

        // When
        for(int i = 0; i < 3; i++){
            testDog.eat(testFood);
        }
        int actualNumberOfMealsEaten = testDog.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expectedNumberOfMealsEaten, actualNumberOfMealsEaten);
    }

    @Test
    public void eatTest4() {
        // Given
        Dog testDog = new Dog("iasdfg", new Date(), 987);
        int expectedNumberOfMealsEaten = 299;
        Food testFood = new Food();

        // When
        for(int i = 0; i < 299; i++){
            testDog.eat(testFood);
        }
        int actualNumberOfMealsEaten = testDog.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expectedNumberOfMealsEaten, actualNumberOfMealsEaten);
    }

    @Test
    public void getIdTest1() {
        // Given
        int expectedId = 0;

        // When
        Dog testDog = new Dog("", new Date(), 0);
        int actualId = testDog.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void getIdTest2() {
        // Given
        int expectedId = 898;

        // When
        Dog testDog = new Dog("", new Date(), 898);
        int actualId = testDog.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void getIdTest3() {
        // Given
        int expectedId = 98174;

        // When
        Dog testDog = new Dog("", new Date(), 98174);
        int actualId = testDog.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void getIdTest4() {
        // Given
        int expectedId = -9898;

        // When
        Dog testDog = new Dog("", new Date(), -9898);
        int actualId = testDog.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void instanceOfAnimalTest() {
        // Given
        Dog testDog = new Dog("", new Date(), 0);
        boolean expectedIsAnimal = true;

        // When
        boolean actualIsAnimal = testDog instanceof Animal;

        // Then
        Assert.assertEquals(expectedIsAnimal, actualIsAnimal);
    }

    @Test
    public void instanceOfMammalTest() {
        // Given
        Dog testDog = new Dog("", new Date(), 0);
        boolean expectedIsMammal = true;

        // When
        boolean actualIsMammal = testDog instanceof Mammal;

        // Then
        Assert.assertEquals(expectedIsMammal, actualIsMammal);
    }
}
