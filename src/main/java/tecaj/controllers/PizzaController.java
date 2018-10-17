package tecaj.controllers;

import java.math.BigDecimal;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tecaj.entity.Pizza;
import tecaj.entity.Size;
import tecaj.entity.Topping;
import tecaj.repositories.PizzaRepository;

@Controller
public class PizzaController {
	
	@Autowired
	private PizzaRepository repo;
	
	@GetMapping
	public String getPizza(Model model) {
		
		model.addAttribute("menu", repo.menu());
		return "pizza";
	}
}
