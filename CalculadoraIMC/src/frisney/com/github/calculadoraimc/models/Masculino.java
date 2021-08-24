package frisney.com.github.calculadoraimc.models;

import java.util.ArrayList;

public class Masculino extends Genero {
	public Masculino() {
		this.categorias = new ArrayList<Categoria>();
		this.categorias.add(new Categoria("Obesidade Grau 3",40.0,100.0,"file:src/imgs/grau3.png"));
		this.categorias.add(new Categoria("Obesidade Grau 2",35.0,39.9,"file:src/imgs/grau2.png"));
		this.categorias.add(new Categoria("Obesidade Grau 1",30.0,34.9,"file:src/imgs/grau1.png"));
		this.categorias.add(new Categoria("Pre-Obesidade",25.0,29.9,"file:src/imgs/sobrepeso.png"));
		this.categorias.add(new Categoria("Peso Normal",18.5,24.9,"file:src/imgs/normal.png"));
		this.categorias.add(new Categoria("Abaixo do Peso",0.0,18.4,"file:src/imgs/magreza.png"));
	}
}
