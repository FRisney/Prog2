module CalculadoraIMC {
	requires javafx.controls;
	requires javafx.fxml;
	
	exports frisney.com.github.calculadoraimc.controllers;
	
	opens frisney.com.github.calculadoraimc.application to javafx.graphics, javafx.fxml;
}
