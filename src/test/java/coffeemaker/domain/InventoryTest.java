package coffeemaker.domain;

import coffeemaker.exceptions.InventoryException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryTest {
    private Inventory CuT;

    @BeforeEach
    public void setUp() {
        this.CuT = new Inventory();
    }

    @AfterEach
    public void tearDown() {
        this.CuT = null;
    }

    @Test
    @DisplayName("Get Coffee Test")
    public void initialCoffeeValueValidation() {
        int value = this.CuT.getCoffee();
        assertEquals(value, 15);
    }

    @Test
    @DisplayName("Get Milk Test")
    public void getMilkValueValidation() {
        int value = this.CuT.getMilk();
        assertEquals(value, 15);
    }

    @Test
    @DisplayName("Get Sugar Test")
    public void getSugarValueValidation() {
        int value = this.CuT.getSugar();
        assertEquals(value, 15);
    }

    @Test
    @DisplayName("Get Chocolate Test")
    public void getChocolateValueValidation() {
        int value = this.CuT.getChocolate();
        assertEquals(value, 15);
    }



    @Test
    @DisplayName("Inventory Constructor Test")
    public void constructorValidation(){
        boolean expected = true;
        boolean actual = true;

        if (this.CuT.getCoffee() != 15){
            actual = false;
        }

        if (this.CuT.getMilk() != 15){
            actual = false;
        }

        if (this.CuT.getSugar() != 15){
            actual = false;
        }

        if (this.CuT.getChocolate() != 15){
            actual = false;
        }
        assertEquals(expected, actual);

    }


    @Test
    @DisplayName("Set Coffee Test")
    public void setCoffeeValueValidation() {
        this.CuT.setCoffee(35);
        int value = this.CuT.getCoffee();
        assertEquals(value, 35);
    }

    @Test
    @DisplayName("Set Coffee Negative Test")
    public void setCoffeeNegativeValueValidation() {
        int initialValue = this.CuT.getCoffee();
        this.CuT.setCoffee(-35);
        int value = this.CuT.getCoffee();
        assertEquals(value, initialValue);
    }

    @Test
    @DisplayName("Base Add Coffee Test")
    public void addCoffeeValueValidation() {
        int initialValue = this.CuT.getCoffee();
        this.CuT.addCoffee("15");
        int finalValue = this.CuT.getCoffee();
        assertEquals((initialValue + 15), finalValue);
    }

    @Test
    @DisplayName("Negative Add Coffee Test")
    public void addNegativeCoffeeValueValidation() {
        InventoryException thrown = assertThrows
                (
                InventoryException.class,
                () -> this.CuT.addCoffee("-6"),
                "Expected addCoffee() to throw, but it didn't"
        );

        assertTrue(thrown.getMessage().contains("Units of coffee must be a positive integer"));
    }

    @Test
    @DisplayName("Non-Integer Add Coffee Test")
    public void addNonIntegerCoffeeValueValidation() {
        InventoryException thrown = assertThrows
                (
                        InventoryException.class,
                        () -> this.CuT.addCoffee("Coffee"),
                        "Expected addCoffee() to throw, but it didn't"
                );

        assertTrue(thrown.getMessage().contains("Units of coffee must be a positive integer"));
    }


    @Test
    @DisplayName("Set Milk Test")
    public void setMilkValueValidation() {
        this.CuT.setMilk(35);
        int finalValue = this.CuT.getMilk();
        assertEquals(35, finalValue);
    }

    @Test
    @DisplayName("Set Milk Negative Test")
    public void setMilkNegativeValueValidation() {
        int initialValue = this.CuT.getMilk();
        this.CuT.setMilk(-6);
        int finalValue = this.CuT.getMilk();
        assertEquals(finalValue, initialValue);
    }

    @Test
    @DisplayName("Base Add Milk Test")
    public void addMilkValueValidation() {
        int initialValue = this.CuT.getMilk();
        this.CuT.addMilk("30");
        int finalValue = this.CuT.getMilk();
        assertEquals((initialValue + 30), finalValue);
    }

    @Test
    @DisplayName("Negative Integer Add Milk Test")
    public void addNegativeMilkValueValidation() {
        InventoryException thrown = assertThrows
                (
                        InventoryException.class,
                        () -> this.CuT.addMilk("-15"),
                        "Expected addMilk() to throw, but it didn't"
                );

        assertTrue(thrown.getMessage().contains("Units of milk must be a positive integer"));
    }

    @Test
    @DisplayName("Non-integer Add Milk Test")
    public void addNonIntegerMilkValueValidation() {
        InventoryException thrown = assertThrows
                (
                        InventoryException.class,
                        () -> this.CuT.addMilk("Milk"),
                        "Expected addMilk() to throw, but it didn't"
                );

        assertTrue(thrown.getMessage().contains("Units of milk must be a positive integer"));
    }


    @Test
    @DisplayName("Set Sugar Test")
    public void setSugarValueValidation() {
        this.CuT.setSugar(35);
        int finalValue = this.CuT.getSugar();
        assertEquals(35, finalValue);
    }

    @Test
    @DisplayName("Set Sugar Negative Test")
    public void setSugarNegativeValueValidation() {
       int initialValue = this.CuT.getSugar();
       this.CuT.setSugar(-35);
       int finalValue = this.CuT.getSugar();

       assertEquals(finalValue, initialValue);
    }

    @Test
    @DisplayName("Base Add Sugar Test")
    public void addSugarValueValidation() {
        int initialValue = this.CuT.getSugar();
        this.CuT.addSugar("30");
        int finalValue = this.CuT.getSugar();
        assertEquals((initialValue + 30), finalValue);
    }

    @Test
    @DisplayName("Negative Integer Add Sugar Test")
    public void addNegativeSugarValueValidation() {
        InventoryException thrown = assertThrows
                (
                        InventoryException.class,
                        () -> this.CuT.addSugar("-15"),
                        "Expected addSugar() to throw, but it didn't"
                );

        assertTrue(thrown.getMessage().contains("Units of sugar must be a positive integer"));
    }

    @Test
    @DisplayName("Non-Integer Add Sugar Test")
    public void addNonIntegerSugarValueValidation() {
        InventoryException thrown = assertThrows
                (
                        InventoryException.class,
                        () -> this.CuT.addSugar("Sugar"),
                        "Expected addSugar() to throw, but it didn't"
                );

        assertTrue(thrown.getMessage().contains("Units of sugar must be a positive integer"));
    }

    @Test
    @DisplayName("Base Set Chocolate Test")
    public void setChocolateValueValidation() {
        this.CuT.setChocolate(35);
        int finalValue = this.CuT.getChocolate();
        assertEquals(finalValue, 35);
    }

    @Test
    @DisplayName("Set Chocolate Negative Test")
    public void setChocolateNegativeValueValidation() {
        int initialValue = this.CuT.getChocolate();
        this.CuT.setChocolate(-35);
        int finalValue = this.CuT.getChocolate();
        assertEquals(finalValue, initialValue);
    }

    @Test
    @DisplayName("Base Add Chocolate Test")
    public void addChocolateValueValidation() {
        int initialValue = this.CuT.getChocolate();
        this.CuT.addChocolate("30");
        int finalValue = this.CuT.getChocolate();
        assertEquals((initialValue + 30), finalValue);
    }

    @Test
    @DisplayName("Negative Integer Add Chocolate Test")
    public void addNegativeChocolateValueValidation() {
        InventoryException thrown = assertThrows
                (
                        InventoryException.class,
                        () -> this.CuT.addChocolate("-15"),
                        "Expected addChocolate() to throw, but it didn't"
                );

        assertTrue(thrown.getMessage().contains("Units of chocolate must be a positive integer"));
    }

    @Test
    @DisplayName("Non-Integer Add Chocolate Test")
    public void addNonIntegerChocolateValueValidation() {
        InventoryException thrown = assertThrows
                (
                        InventoryException.class,
                        () -> this.CuT.addChocolate("Chocolate"),
                        "Expected addChocolate() to throw, but it didn't"
                );

        assertTrue(thrown.getMessage().contains("Units of chocolate must be a positive integer"));
    }

    @Test
    @DisplayName("Base Enough Ingredients Test")
    public void enoughIngredientsValueValidation() {

        //Recipe that works with default inventory
        Recipe testRecipe = new Recipe();
        testRecipe.setName("Test Recipe");
        testRecipe.setAmtCoffee("10");
        testRecipe.setAmtSugar("10");
        testRecipe.setAmtMilk("10");
        testRecipe.setAmtChocolate("10");

        boolean worked = this.CuT.enoughIngredients(testRecipe);
        assertTrue(worked);
    }

    @Test
    @DisplayName("Not Enough Coffee Test")
    public void notEnoughCoffeeValueValidation() {
        Recipe testRecipe = new Recipe();
        testRecipe.setName("Test Recipe");
        testRecipe.setAmtCoffee("20");
        testRecipe.setAmtSugar("10");
        testRecipe.setAmtMilk("10");
        testRecipe.setAmtChocolate("10");

        boolean worked = this.CuT.enoughIngredients(testRecipe);
        assertFalse(worked);
    }

    @Test
    @DisplayName("Not Enough Sugar Test")
    public void notEnoughSugarValueValidation() {
        //Recipe that works with default inventory
        Recipe testRecipe = new Recipe();
        testRecipe.setName("Test Recipe");
        testRecipe.setAmtCoffee("10");
        testRecipe.setAmtSugar("20");
        testRecipe.setAmtMilk("10");
        testRecipe.setAmtChocolate("10");

        boolean worked = this.CuT.enoughIngredients(testRecipe);
        assertFalse(worked);
    }

    @Test
    @DisplayName("Not Enough Milk Test")
    public void notEnoughMilkValueValidation() {
        //Recipe that works with default inventory
        Recipe testRecipe = new Recipe();
        testRecipe.setName("Test Recipe");
        testRecipe.setAmtCoffee("10");
        testRecipe.setAmtSugar("10");
        testRecipe.setAmtMilk("20");
        testRecipe.setAmtChocolate("10");

        boolean worked = this.CuT.enoughIngredients(testRecipe);
        assertFalse(worked);
    }

    @Test
    @DisplayName("Not Enough Chocolate Test")
    public void notEnoughChocolateValueValidation() {
        //Recipe that works with default inventory
        Recipe testRecipe = new Recipe();
        testRecipe.setName("Test Recipe");
        testRecipe.setAmtCoffee("10");
        testRecipe.setAmtSugar("10");
        testRecipe.setAmtMilk("10");
        testRecipe.setAmtChocolate("20");

        boolean worked = this.CuT.enoughIngredients(testRecipe);
        assertFalse(worked);
    }

    @Test
    @DisplayName("Base Use Ingredients Test")
    public void baseUseIngredientsValueValidation() {
        //Recipe that works with default inventory
        Recipe testRecipe = new Recipe();
        testRecipe.setName("Test Recipe");
        testRecipe.setAmtCoffee("10");
        testRecipe.setAmtSugar("10");
        testRecipe.setAmtMilk("10");
        testRecipe.setAmtChocolate("10");

        boolean worked = this.CuT.useIngredients(testRecipe);

        assertTrue(worked);
    }

    @Test
    @DisplayName("Basic Fail Use Ingredients Test")
    public void basicFailUseIngredientsValueValidation() {
        //Recipe that works with default inventory
        Recipe testRecipe = new Recipe();
        testRecipe.setName("Test Recipe");
        testRecipe.setAmtCoffee("10");
        testRecipe.setAmtSugar("100");
        testRecipe.setAmtMilk("100");
        testRecipe.setAmtChocolate("10");

        boolean worked = this.CuT.useIngredients(testRecipe);
        assertFalse(worked);
    }

    @Test
    @DisplayName("Validate Coffee After Use Ingredients")
    public void validateCoffeeAfterUseIngredients() {
        //Recipe that works with default inventory
        Recipe testRecipe = new Recipe();
        testRecipe.setName("Test Recipe");
        testRecipe.setAmtCoffee("10");
        testRecipe.setAmtSugar("10");
        testRecipe.setAmtMilk("10");
        testRecipe.setAmtChocolate("10");

        int initialValue = this.CuT.getCoffee();

        this.CuT.useIngredients(testRecipe);

        int afterValue = this.CuT.getCoffee();

        assertEquals((initialValue - testRecipe.getAmtCoffee()), afterValue);
    }

    @Test
    @DisplayName("Validate Milk After Use Ingredients")
    public void validateMilkAfterUseIngredients() {
        //Recipe that works with default inventory
        Recipe testRecipe = new Recipe();
        testRecipe.setName("Test Recipe");
        testRecipe.setName("Test Recipe");
        testRecipe.setAmtCoffee("10");
        testRecipe.setAmtSugar("10");
        testRecipe.setAmtMilk("10");
        testRecipe.setAmtChocolate("10");

        int initialValue = this.CuT.getMilk();

        this.CuT.useIngredients(testRecipe);

        int afterValue = this.CuT.getMilk();

        assertEquals((initialValue - testRecipe.getAmtMilk()), afterValue);
    }

    @Test
    @DisplayName("Validate Sugar After Use Ingredients")
    public void validateSugarAfterUseIngredients() {
        //Recipe that works with default inventory
        Recipe testRecipe = new Recipe();
        testRecipe.setName("Test Recipe");
        testRecipe.setAmtCoffee("10");
        testRecipe.setAmtSugar("10");
        testRecipe.setAmtMilk("10");
        testRecipe.setAmtChocolate("10");

        int initialValue = this.CuT.getSugar();

        this.CuT.useIngredients(testRecipe);

        int afterValue = this.CuT.getSugar();

        assertEquals((initialValue - testRecipe.getAmtSugar()), afterValue);
    }

    @Test
    @DisplayName("Validate Chocolate After Use Ingredients")
    public void validateChocolateAfterUseIngredients() {
        //Recipe that works with default inventory
        Recipe testRecipe = new Recipe();
        testRecipe.setName("Test Recipe");
        testRecipe.setAmtCoffee("10");
        testRecipe.setAmtSugar("10");
        testRecipe.setAmtMilk("10");
        testRecipe.setAmtChocolate("10");

        int initialValue = this.CuT.getChocolate();

        this.CuT.useIngredients(testRecipe);

        int afterValue = this.CuT.getChocolate();

        assertEquals((initialValue - testRecipe.getAmtChocolate()), afterValue);
    }

}
