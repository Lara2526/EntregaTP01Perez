package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Provincia;
@Controller
public class ProvinciaController {

	//atributo              =instancia new crea un espacio espacio para guardar una variable
	//Provincia unaProvincia = new Provincia();
	//provincia() es un metodo constructor de los objetos tipo Provincia
	//una forma de crear un objeto 
	//luego de poner @component en provincia
	//el de abajo es un esrototipo inyeccion de independencia instanciando es igual a nla linea new 
	@Autowired
	Provincia unaProvincia;
	//15 recive y devuelveel string 
	@GetMapping({"/provincia"})
	public String cargarProvincia(Model model) {
		//Provincia unaProvincia = new Provincia();
		unaProvincia.setNombre("Salta Argentina");
		model.addAttribute("prov", unaProvincia);
		return "provincia";
	}
}
