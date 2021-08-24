package frisney.com.github.calculadoraimc.models;

public class Categoria {
	public String descicao;
	public Double min;
	public Double max;
	public String imgPath;
	
	Categoria(String descricao, Double min, Double max, String imgPath) {
		this.descicao = descricao;
		this.min = min;
		this.max = max;
		this.imgPath = imgPath;
	}

	public boolean check(Double imc) {
		return imc <= max && imc >= min;
	}
}
