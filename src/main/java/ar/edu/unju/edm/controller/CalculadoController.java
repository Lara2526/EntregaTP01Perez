package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Calculadora;

@Controller
public class CalculadoController {

	@Autowired
	Calculadora unaCalculadora;
	
	
	@GetMapping({"/calculadora"})
	public String cargarCalculadora(Model model) {
		
		return "calculadora";
	}

	@GetMapping("/calculoSuma") 
	public ModelAndView getCalculoSuma(@RequestParam(name = "num1") String num1 , @RequestParam(name = "num2") int num2) {

		unaCalculadora.setNum1(Integer.valueOf(num1));
		unaCalculadora.setNum2(num2);

		float resultadoSuma = unaCalculadora.sumar();

		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoSuma", resultadoSuma);

		return modelView;
	}
	
	@GetMapping("/calculoResta")
	
	public ModelAndView getRestaPage(@RequestParam(name = "num1") String num1 , @RequestParam(name = "num2") int num2) {

		unaCalculadora.setNum1(Integer.valueOf(num1));
		unaCalculadora.setNum2(num2);

		float resultado = unaCalculadora.resta();

		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultado", resultado);

		return modelView;
	}
	
	@GetMapping("/calculoProducto")
	
	public ModelAndView getProductoPage(@RequestParam(name = "num1") int num1 , @RequestParam(name = "num2") int num2) {

		unaCalculadora.setNum1(num1);
		unaCalculadora.setNum2(num2);

	float resultadoProducto = unaCalculadora.multiplicar();

	ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoProducto", resultadoProducto );

		return modelView;
	}
	
	@GetMapping("/calculoDivision")
	
	public ModelAndView getDivisionPage(@RequestParam(name = "num1") String num1 , @RequestParam(name = "num2") int num2) {

		unaCalculadora.setNum1(Integer.valueOf(num1));
		unaCalculadora.setNum2(Integer.valueOf(num2));

		float resultadoDivision = unaCalculadora.division();

		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoDivision", resultadoDivision);

	return modelView;
	}

}
