package frisney.com.github.calculadoraimc.models;

import java.util.ArrayList;

public class Masculino extends Genero {
	public Masculino() {
		this.categorias = new ArrayList<Categoria>();
		this.categorias.add(new Categoria(40.0,"Obesidade Grau 3"));
		this.categorias.add(new Categoria(35.0,"Obesidade Grau 2"));
		this.categorias.add(new Categoria(30.0,"Obesidade Grau 1"));
		this.categorias.add(new Categoria(25.0,"Pre-Obesidade"));
		this.categorias.add(new Categoria(18.5,"Peso Normal"));
	}
}

// Menor que 18.5 - Abaixo do peso ;
// Entre 18.5 e 24.9 - Peso normal ;
// Entre 25.0 e 29.9 - Pré-obesidade ;
// Entre 30.0 e 34.9 - Obesidade Grau 1 ;
// Entre 35.0 e 39.9 - Obesidade Grau 2 ;
// Acima de 40 - Obesidade Grau 3
