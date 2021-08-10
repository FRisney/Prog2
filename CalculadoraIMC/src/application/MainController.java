package application;

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
		lblResult.setText(String.format("%.2f",imc));
		System.out.println(String.format("%.2f",imc));
	}
}