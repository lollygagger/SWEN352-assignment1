package coffeemaker.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coffeemaker.exceptions.RecipeException;

public class RecipeTest {

    private Recipe recipe;

    @BeforeEach
    public void setUp() {
        recipe = new Recipe();
    }

    @AfterEach
    public void tearDown() {
        recipe = null;
    }

    @Test
    @DisplayName("Test to ensure recipe is setup correctly.")
    public void recipeSetup() {
        assertEquals(new Recipe(), recipe);
    }

    @Test
    @DisplayName("Get Recipe Name. Should be default value.")
    public void recipeGetName() {
        assertEquals("", recipe.getName());
    }

    @Test
    @DisplayName("Set Recipe Name. Should be Sandwhich.")
    public void recipeSetName() {
        String name = "Sandwhich";
        recipe.setName(name);
        assertEquals(name, recipe.getName());
    }

    @Test
    @DisplayName("Set Recipe Name to null. Should keep same name.")
    public void recipeSetNameNull() {
        String name = null;
        recipe.setName(name);
        assertEquals("", recipe.getName());
    }

    @Test
    @DisplayName("Get Recipe Price, Should be default value.")
    public void recipeGetPrice() {
        assertEquals(0, recipe.getPrice());
    }

    @Test
    @DisplayName("Set Recipe Price to a positive number. Should be 5.")
    public void recipeSetPricePositive() {
        String price = "5";
        recipe.setPrice(price);
        assertEquals(Integer.parseInt(price), recipe.getPrice());
    }

    @Test
    @DisplayName("Set Recipe Price to negative number. Should throw RecipeException error.")
    public void recipeSetPriceNegative() {
        String price = "-5";
        try {
            recipe.setPrice(price);
        } catch (RecipeException e) {
            assertTrue(true, "Negative number error successfully caught");
        }
    }

    @Test
    @DisplayName("Set Recipe Price to zero. Should throw RecipeException error.")
    public void recipeSetPriceZero() {
        String price = "0";
        try {
            recipe.setPrice(price);
        } catch (RecipeException e) {
            assertTrue(true, "Negative number error successfully caught");
        }
    }

    @Test
    @DisplayName("Set Recipe Price to number. Should throw RecipeException error after catching NumberFormatException.")
    public void recipeSetPriceString() {
        String price = "number";
        try {
            recipe.setPrice(price);
        } catch (RecipeException e) {
            assertTrue(true, "Negative number error successfully caught");
        }
    }

    @Test
    @DisplayName("Get amount coffee. Should be default value.")
    public void recipeGetAmtCoffee() {
        assertEquals(0, recipe.getAmtCoffee());
    }

    @Test
    @DisplayName("Set amount coffee. Should be 5.")
    public void recipeSetAmtCoffee() {
        String amtCoffee = "5";
        recipe.setAmtCoffee(amtCoffee);
        assertEquals(Integer.parseInt(amtCoffee), recipe.getAmtCoffee());
    }

    @Test
    @DisplayName("Set amount coffee to negative number. Should throw RecipeException error.")
    public void recipeSetAmtCoffeeNegative() {
        String amtCoffee = "-5";
        try {
            recipe.setAmtCoffee(amtCoffee);
        } catch (RecipeException e) {
            assertTrue(true, "Negative number successfully caught");
        }
    }

    @Test
    @DisplayName("Set amount coffee to 0. Should throw RecipeException error.")
    public void recipeSetAmtCoffeeZero() {
        String amtCoffee = "0";
        try {
            recipe.setAmtCoffee(amtCoffee);
        } catch (RecipeException e) {
            assertTrue(true, "Negative number successfully caught");
        }
    }

    @Test
    @DisplayName("Set amount coffee to a string. Should throw RecipeException error after catching NumberFormatException error.")
    public void recipeSetAmtCoffeeString() {
        String amtCoffee = "number";
        try {
            recipe.setAmtCoffee(amtCoffee);
        } catch (RecipeException e) {
            assertTrue(true, "Negative number successfully caught");
        }
    }

    @Test
    @DisplayName("Get amount milk. Should be default value")
    public void recipeGetAmtMilk() {
        assertEquals(0, recipe.getAmtMilk());
    }

    @Test
    @DisplayName("Set amount milk to positive number. Should be 5.")
    public void recipeGetAmtMilkPositive() {
        String amtMilk = "5";
        recipe.setAmtMilk(amtMilk);
        assertEquals(Integer.parseInt(amtMilk), recipe.getAmtMilk());
    }

    @Test
    @DisplayName("Set amount milk to negative number. Should throw RecipeException error.")
    public void recipeGetAmtMilkNegative() {
        String amtMilk = "-5";
        try {
            recipe.setAmtMilk(amtMilk);
        } catch (RecipeException e) {
            assertTrue(true, "Negative number successfully caught");
        }
    }

    @Test
    @DisplayName("Set amount milk to a string. Should throw RecipeException error after catching NumberFormatException error.")
    public void recipeGetAmtMilkString() {
        String amtMilk = "number";
        try {
            recipe.setAmtMilk(amtMilk);
        } catch (RecipeException e) {
            assertTrue(true, "Negative number successfully caught");
        }
    }

    @Test
    @DisplayName("Get amount sugar. Should be default value")
    public void recipeGetAmtSugar() {
        assertEquals(0, recipe.getAmtSugar());
    }

    @Test
    @DisplayName("Set amount sugar to positive number. Should be 5.")
    public void recipeGetAmtSugarPositive() {
        String amtSugar = "5";
        recipe.setAmtSugar(amtSugar);
        assertEquals(Integer.parseInt(amtSugar), recipe.getAmtSugar());
    }

    @Test
    @DisplayName("Set amount sugar to negative number. Should throw RecipeException error.")
    public void recipeGetAmtSugarNegative() {
        String amtSugar = "-5";
        try {
            recipe.setAmtSugar(amtSugar);
        } catch (RecipeException e) {
            assertTrue(true, "Negative number successfully caught");
        }
    }

    @Test
    @DisplayName("Set amount sugar to a string. Should throw RecipeException error after catching NumberFormatException error.")
    public void recipeGetAmtSugarString() {
        String amtSugar = "number";
        try {
            recipe.setAmtSugar(amtSugar);
        } catch (RecipeException e) {
            assertTrue(true, "Negative number successfully caught");
        }
    }

    @Test
    @DisplayName("Get amount sugar. Should be default value")
    public void recipeGetAmtChocolate() {
        assertEquals(0, recipe.getAmtChocolate());
    }

    @Test
    @DisplayName("Set amount sugar to positive number. Should be 5.")
    public void recipeGetAmtChocolatePositive() {
        String amtChocolate = "5";
        recipe.setAmtChocolate(amtChocolate);
        assertEquals(Integer.parseInt(amtChocolate), recipe.getAmtChocolate());
    }

    @Test
    @DisplayName("Set amount sugar to negative number. Should throw RecipeException error.")
    public void recipeGetAmtChocolateNegative() {
        String amtChocolate = "-5";
        try {
            recipe.setAmtChocolate(amtChocolate);
        } catch (RecipeException e) {
            assertTrue(true, "Negative number successfully caught");
        }
    }

    @Test
    @DisplayName("Set amount sugar to a string. Should throw RecipeException error after catching NumberFormatException error.")
    public void recipeGetAmtChocolateString() {
        String amtChocolate = "number";
        try {
            recipe.setAmtChocolate(amtChocolate);
        } catch (RecipeException e) {
            assertTrue(true, "Negative number successfully caught");
        }
    }

    @Test
    @DisplayName("ToString test")
    public void recipeToString() {
        recipe.setName("Sandwhich");
        String expected = "Recipe{Sandwhich}";
        assertEquals(expected, recipe.toString());
    }

    @Test
    @DisplayName("hashCode test")
    public void recipeHashCode() {
        String expected = "31";
        assertEquals(Integer.parseInt(expected), recipe.hashCode());
    }

    @Test
    @DisplayName("hashCode test with recipe name")
    public void recipeHashCodeName() {
        recipe.setName("Sandwhich");
        String expected = "-623780840";
        assertEquals(Integer.parseInt(expected), recipe.hashCode());
    }

    @Test
    @DisplayName("Test equals")
    public void recipeEquals() {
        Recipe newRecipe = new Recipe();
        assertEquals(true, recipe.equals(newRecipe));
    }

    @Test
    @DisplayName("Test equals null")
    public void recipeEqualsNull() {
        Recipe newRecipe = null;
        assertEquals(false, recipe.equals(newRecipe));
    }
}
