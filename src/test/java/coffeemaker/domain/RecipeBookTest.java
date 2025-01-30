package coffeemaker.domain;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecipeBookTest {

    RecipeBook testBook;

    @BeforeEach
    public void setup() {
        testBook = new RecipeBook();
    }

    @Test
    public void testDeleteRecipeOutOfBounds() {
        String ret = testBook.deleteRecipe(1000);
        assertNull(ret);
    }

    @Test
    public void testDeleteRecipeNegative() {
        String ret = testBook.deleteRecipe(-2);
        assertNull(ret);
    }

    @Test
    public void testDeleteRecipeNull() {
        String ret = testBook.deleteRecipe(0);
        assertNull(ret);
    }

    @Test
    public void testAddRecipe() {
        Recipe temp = new Recipe();
        temp.setName("Air Latte");

        boolean ret = testBook.addRecipe(temp);
        assertTrue(ret);
    }

    @Test
    public void testAddFiveRecipes() {
        // Setup
        Recipe[] recipes = {new Recipe(), new Recipe(), new Recipe(), new Recipe()};
        for (int i = 0; i < 4; i++) {
            recipes[i].setName("" + i);
            testBook.addRecipe(recipes[i]);
        }

        Recipe temp = new Recipe();

        // Test
        boolean ret = testBook.addRecipe(temp);

        // Evaluate
        assertFalse(ret);
    }


    @Test
    public void testDeleteRecipeAddEmpty() {
        // setup
        Recipe temp = new Recipe();
        testBook.addRecipe(temp);
        testBook.deleteRecipe(0);

        // Test
        boolean ret = testBook.addRecipe(temp);

        // Evaluate
        assertTrue(ret);
    }

    @Test
    public void testGetRecipes() {
        Recipe[] temp = testBook.getRecipes();
        Recipe[] null_array = {null, null, null, null};

        assertArrayEquals(temp, null_array);
    }

    @Test
    public void testReplaceNullRecipe() {
        Recipe temp = new Recipe();
        String ret = testBook.replaceRecipe(0, temp);
        assertNull(ret);
    }

    @Test
    public void testReplaceRecipe() {
        // Setup
        Recipe temp = new Recipe();
        temp.setName("Coffee");
        testBook.addRecipe(temp);
        Recipe air_latte = new Recipe();
        air_latte.setName("Air Latte");

        // Test
        String ret = testBook.replaceRecipe(0, air_latte);

        // Evaluate
        assertEquals(ret, "Coffee");
    }

    @Test
    public void testReplacePreserveName() {
        // Setup
        Recipe temp = new Recipe();
        temp.setName("Coffee");
        testBook.addRecipe(temp);
        Recipe air_latte = new Recipe();
        air_latte.setName("Air Latte");
        testBook.replaceRecipe(0, air_latte);

        // Test
        Recipe[] ret = testBook.getRecipes();
        
        // Evaluate
        assertTrue(ret[0].getName().equals("Air Latte"));
    }

}
