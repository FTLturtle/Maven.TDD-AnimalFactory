package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    @Before
    public void resetCatHouseBefore() {
        CatHouse.clear();
    }

    @Test
    public void addTest() {
        // Given
        int catId = 86;
        Cat expectedCat =  new Cat(null, null, catId);

        // When
        CatHouse.add(expectedCat);
        Cat actualCat = CatHouse.getCatById(catId);

        // Then
        Assert.assertEquals(expectedCat, actualCat);

    }

    @Test
    public void addTest2() {
        // Given
        int catId = 56;
        Cat expectedCat =  new Cat(null, null, catId);

        // When
        CatHouse.add(expectedCat);
        Cat actualCat = CatHouse.getCatById(catId);

        // Then
        Assert.assertEquals(expectedCat, actualCat);

    }

    @Test
    public void removeByIdTest() {
        // Given
        int catId = 86;
        Cat testCat =  new Cat(null, null, catId);
        CatHouse.add(testCat);

        Cat expectedCat = null;

        // When
        CatHouse.remove(catId);
        Cat actualCat = CatHouse.getCatById(catId);

        // Then
        Assert.assertEquals(expectedCat, actualCat);

    }

    @Test
    public void removeByIdTest2() {
        // Given
        int catId = 98;
        Cat testCat =  new Cat(null, null, catId);
        CatHouse.add(testCat);

        Cat expectedCat = null;

        // When
        CatHouse.remove(catId);
        Cat actualCat = CatHouse.getCatById(catId);

        // Then
        Assert.assertEquals(expectedCat, actualCat);

    }

    @Test
    public void removeByCatTest() {
        // Given
        int catId = 987;
        Cat testCat =  new Cat(null, null, catId);
        CatHouse.add(testCat);

        Cat expectedCat = null;

        // When
        CatHouse.remove(testCat);
        Cat actualCat = CatHouse.getCatById(catId); // this should be null if the cat has been removed

        // Then
        Assert.assertEquals(expectedCat, actualCat);

    }

    @Test
    public void removeByCatTest2() {
        // Given
        int catId = 4567;
        Cat testCat =  new Cat(null, null, catId);
        CatHouse.add(testCat);

        Cat expectedCat = null;

        // When
        CatHouse.remove(testCat);
        Cat actualCat = CatHouse.getCatById(catId); // this should be null if the cat has been removed

        // Then
        Assert.assertEquals(expectedCat, actualCat);

    }

    @Test
    public void getNumberOfCatsTest() {
        // Given
        Cat testCat =  new Cat(null, null, null);
        int expectedNumberOfCats = 86;

        // When
        for (int i = 0; i < expectedNumberOfCats; i++){
            CatHouse.add(testCat);
        }

        int actualNumberOfCats = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);
    }

    @Test
    public void getNumberOfCatsTest2() {
        // Given
        Cat testCat =  new Cat(null, null, null);
        int expectedNumberOfCats = 234;

        // When
        for (int i = 0; i < expectedNumberOfCats; i++){
            CatHouse.add(testCat);
        }

        int actualNumberOfCats = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);
    }

}
