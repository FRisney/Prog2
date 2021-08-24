module CalculadoraIMC {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	exports frisney.com.github.calculadoraimc.controllers;
	
	opens frisney.com.github.calculadoraimc.application to javafx.graphics, javafx.fxml;
}
