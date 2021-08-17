package frisney.com.github.calculadoraimc.models;

import java.util.List;

public abstract class Genero {
	protected List<Categoria> categorias;
	
	public String testCategoria(Double imc) {
		for(Categoria cat : this.categorias) {
			if(imc > cat.indice) return cat.descicao;
		}
		return "Abaixo do Peso";
	}
}
