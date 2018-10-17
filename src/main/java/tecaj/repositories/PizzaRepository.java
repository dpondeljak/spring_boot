package tecaj.repositories;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import tecaj.entity.Pizza;
import tecaj.entity.Size;
import tecaj.entity.Topping;

@Component
public class PizzaRepository {

	private Map<Long, Pizza> pizzas = new HashMap<>();

	{
		Pizza pizza = new Pizza();
		pizza.setName("Margharita");
		pizza.setToppings(Set.of(Topping.TOMATO, Topping.CHEESE));
		pizza.setPrice(new BigDecimal("35.00"));
		pizza.setSize(Size.JUMBO);
		
		pizzas.put(1L, pizza);
	}
	{
		Pizza pizza = new Pizza();
		pizza.setName("Vesuvio");
		pizza.setToppings(Set.of(Topping.TOMATO, Topping.CHEESE, Topping.HAM));
		pizza.setPrice(new BigDecimal("45.00"));
		pizza.setSize(Size.SMALL);
		
		pizzas.put(2L, pizza);
	}	
	
	public Collection<Pizza> menu() {
		return pizzas.values();
	}

}
