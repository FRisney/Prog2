package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	public Label titulo;
	public Button certeza;
	public TextField escritura;
	
	public void confirmou() {
		var lol = escritura.getText();
		System.out.println(lol);
		titulo.setText(lol);
	}
}
