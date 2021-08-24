package frisney.com.github.calculadoraimc.models;

import java.util.List;

public abstract class Genero {
	protected List<Categoria> categorias;
	
	public Categoria testCategoria(Double imc) {
		for(Categoria cat : this.categorias) {
			if(cat.check(imc)) return cat;
		}
		return null;
	}
}
