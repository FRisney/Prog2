package frisney.com.github.calculadoraimc.controllers;

import frisney.com.github.calculadoraimc.models.Categoria;
import frisney.com.github.calculadoraimc.models.Genero;
import frisney.com.github.calculadoraimc.models.Masculino;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController {
	public TextField txtAltura;
	public TextField txtPeso;
	public Button btnCalc;
	public Button btnClear;
	public Label lblResult;
	public ImageView imgView;
	
	@SuppressWarnings("unused")
	public void calcular() {

		Double imc = Double.parseDouble(txtPeso.getText());
		imc /= Math.pow(Double.parseDouble(txtAltura.getText()), 2f);

		Genero genero = new Masculino();
		
		Categoria cat = genero.testCategoria(imc);

		lblResult.setText(String.format("%,.2f", imc));
		
		imgView.setImage(new Image(cat.imgPath));

		showAlert("Resultado",cat.descicao);
	}
	
	public void limpar() {
		showAlert("Reset","Os campos foram limpos!");
		lblResult.setText("...");
		txtPeso.setText("");
		txtAltura.setText("");
		imgView.setImage(null);
	}
	
	public static void showAlert(String titulo, String conteudo) {
		Alert alerta = new Alert(AlertType.CONFIRMATION);
		alerta.setTitle(titulo);
		alerta.setContentText(conteudo);
		alerta.show();
	}
}
