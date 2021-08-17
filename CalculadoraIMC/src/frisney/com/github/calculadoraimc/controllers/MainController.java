package frisney.com.github.calculadoraimc.controllers;

import frisney.com.github.calculadoraimc.models.Genero;
import frisney.com.github.calculadoraimc.models.Masculino;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	public TextField txtAltura;
	public TextField txtPeso;
	public Button btnCalc;
	public Button btnClear;
	public Label lblResult;
	
	@SuppressWarnings("unused")
	public void calcular() {

		Double imc = Double.parseDouble(txtPeso.getText());
		imc /= Math.pow(Double.parseDouble(txtAltura.getText()), 2f);

		Genero genero = new Masculino();

		lblResult.setText(String.format("%,.2f", imc));
		System.out.println(String.format("%,.2f", imc));
		System.out.println(genero.testCategoria(imc));

		Alert alerta = new Alert(AlertType.CONFIRMATION);
		alerta.setTitle("Resultado");
		alerta.setContentText(genero.testCategoria(imc));
		alerta.show();
	}
	
	public void limpar() {
		lblResult.setText("...");
		txtPeso.setText("");
		txtAltura.setText("");
		Alert alerta = new Alert(AlertType.CONFIRMATION);
		alerta.setTitle("Limpei os campos");
		alerta.setContentText("Limpei os campos");
		alerta.show();
	}
}
