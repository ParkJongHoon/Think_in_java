package org.uengine.temp;

public interface Food {
	enum Appetizer implements Food{
		SALAD, SOUP, SPRING_ROLLS;
	}
	enum MainCourse implements Food{
		LASAGNE, BURRITO, PAD_THAI,
		lENTILS, HUMMOUS, VINDALOO;
	}
	enum Dessert implements Food{
		TIRAMISU, GELATO, BLACK_FOREST_CAKE,
		FRUIT, CREME_CARAMEL;
	}
	enum Cofee implements Food{
		BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
		LATTE, CAPPUCCINO, TEA, HERB_TEA;
	}

}
