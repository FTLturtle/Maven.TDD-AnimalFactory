package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;


import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest1() {
        // Given
        Cat testCat = new Cat("", new Date(), 0);
        String expectedNextName = "Sally";

        // When
        testCat.setName(expectedNextName);
        String actualNextName = testCat.getName();

        // Then
        Assert.assertEquals(expectedNextName, actualNextName);
    }

    @Test
    public void setNameTest2() {
        // Given
        Cat testCat = new Cat("asdf", new Date(), 38);
        String expectedNextName = "Sally";

        // When
        testCat.setName(expectedNextName);
        String actualNextName = testCat.getName();

        // Then
        Assert.assertEquals(expectedNextName, actualNextName);
    }

    @Test
    public void setNameTest3() {
        // Given
        Cat testCat = new Cat("", new Date(), 0);
        String expectedNextName = "knaifvub";

        // When
        testCat.setName(expectedNextName);
        String actualNextName = testCat.getName();

        // Then
        Assert.assertEquals(expectedNextName, actualNextName);
    }

    @Test
    public void setNameTest4() {
        // Given
        Cat testCat = new Cat("joijasodifj", new Date(), 0);
        String expectedNextName = ";lkasjd;lfk";

        // When
        testCat.setName(expectedNextName);
        String actualNextName = testCat.getName();

        // Then
        Assert.assertEquals(expectedNextName, actualNextName);
    }

    @Test
    public void setBirthDateTest1() {
        // Given
        Cat testCat = new Cat("", new Date(), 0);
        Date expectedNextBirthDate = new Date();

        // When
        testCat.setBirthDate(expectedNextBirthDate);
        Date actualNextBirthDate = testCat.getBirthDate();

        // Then
        Assert.assertEquals(expectedNextBirthDate, actualNextBirthDate);
    }

    @Test
    public void setBirthDateTest2() {
        // Given
        Cat testCat = new Cat("uahjg", new Date(), 52);
        Date expectedNextBirthDate = new Date();

        // When
        testCat.setBirthDate(expectedNextBirthDate);
        Date actualNextBirthDate = testCat.getBirthDate();

        // Then
        Assert.assertEquals(expectedNextBirthDate, actualNextBirthDate);
    }

    @Test
    public void speakTest1() {
        // Given
        Cat testCat = new Cat("", new Date(), 0);
        String expectedSpeak = "meow!";

        // When
        String actualSpeak = testCat.speak();

        // Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void speakTest2() {
        // Given
        Cat testCat = new Cat("liuakdsjf", new Date(), 986);
        String expectedSpeak = "meow!";

        // When
        String actualSpeak = testCat.speak();

        // Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void eatTest1() {
        // Given
        Cat testCat = new Cat("", new Date(), 0);
        int expectedNumberOfMealsEaten = 1;
        Food testFood = new Food();

        // When
        testCat.eat(testFood);
        int actualNumberOfMealsEaten = testCat.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expectedNumberOfMealsEaten, actualNumberOfMealsEaten);
    }

    @Test
    public void eatTest2() {
        // Given
        Cat testCat = new Cat("", new Date(), 0);
        int expectedNumberOfMealsEaten = 9;
        Food testFood = new Food();

        // When
        for(int i = 0; i < 9; i++){
            testCat.eat(testFood);
        }
        int actualNumberOfMealsEaten = testCat.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expectedNumberOfMealsEaten, actualNumberOfMealsEaten);
    }

    @Test
    public void eatTest3() {
        // Given
        Cat testCat = new Cat("iuashdof", new Date(), 876);
        int expectedNumberOfMealsEaten = 3;
        Food testFood = new Food();

        // When
        for(int i = 0; i < 3; i++){
            testCat.eat(testFood);
        }
        int actualNumberOfMealsEaten = testCat.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expectedNumberOfMealsEaten, actualNumberOfMealsEaten);
    }

    @Test
    public void eatTest4() {
        // Given
        Cat testCat = new Cat("iasdfg", new Date(), 987);
        int expectedNumberOfMealsEaten = 299;
        Food testFood = new Food();

        // When
        for(int i = 0; i < 299; i++){
            testCat.eat(testFood);
        }
        int actualNumberOfMealsEaten = testCat.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expectedNumberOfMealsEaten, actualNumberOfMealsEaten);
    }

    @Test
    public void getIdTest1() {
        // Given
        int expectedId = 0;

        // When
        Cat testCat = new Cat("", new Date(), 0);
        int actualId = testCat.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void getIdTest2() {
        // Given
        int expectedId = 898;

        // When
        Cat testCat = new Cat("", new Date(), 898);
        int actualId = testCat.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void getIdTest3() {
        // Given
        int expectedId = 98174;

        // When
        Cat testCat = new Cat("", new Date(), 98174);
        int actualId = testCat.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void getIdTest4() {
        // Given
        int expectedId = -9898;

        // When
        Cat testCat = new Cat("", new Date(), -9898);
        int actualId = testCat.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void instanceOfAnimalTest() {
        // Given
        Cat testCat = new Cat("", new Date(), 0);
        boolean expectedIsAnimal = true;

        // When
        boolean actualIsAnimal = testCat instanceof Animal;

        // Then
        Assert.assertEquals(expectedIsAnimal, actualIsAnimal);
    }

    @Test
    public void instanceOfMammalTest() {
        // Given
        Cat testCat = new Cat("", new Date(), 0);
        boolean expectedIsMammal = true;

        // When
        boolean actualIsMammal = testCat instanceof Mammal;

        // Then
        Assert.assertEquals(expectedIsMammal, actualIsMammal);
    }
}
