package frisney.com.github.calculadoraimc.controllers;

import frisney.com.github.calculadoraimc.models.Genero;
import frisney.com.github.calculadoraimc.models.Masculino;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	public TextField txtAltura;
	public TextField txtPeso;
	public Button btnCalc;
	public Label lblResult;
	
	@SuppressWarnings("unused")
	public void calcular() {

		Double imc = Double.parseDouble(txtPeso.getText());
		imc /= Math.pow(Double.parseDouble(txtAltura.getText()), 2f);

		Genero genero = new Masculino();

		lblResult.setText(genero.testCategoria(imc));
		System.out.println(genero.testCategoria(imc));
	}
}
