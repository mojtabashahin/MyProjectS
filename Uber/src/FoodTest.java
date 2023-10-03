import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FoodTest {

	@Test
	void testAddFood() {
		Food food = new Food ("abcde");
		assertEquals(true, food.addFood());
	}

}
