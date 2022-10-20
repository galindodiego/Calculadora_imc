package com.calculadora_imc.model;

import java.text.DecimalFormat;

public class ImcBeam {
	private float peso;
	private float altura;
	
	
	
	public ImcBeam(String peso, String altura) {
		setPeso(peso);
		setAltura(altura);
	}
	public ImcBeam() {
		
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public void setPeso(String peso) {
		this.peso = (peso.matches("[0-9.]+")==false? 0f:Float.parseFloat(peso));
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public void setAltura(String altura) {
		this.altura = (altura.matches("[0-9.]+")==false? 0f:Float.parseFloat(altura));
	}
	
	
	public String getResult() {
		Float imc = peso / (altura*2);
		if(imc.isNaN()) 
			return "Falhou";
			
		StringBuilder result = new StringBuilder("Seu imc = "+ new DecimalFormat("#.#").format(imc));
		
		if(imc >= 18.5 & imc <=24.9 )
			result.append(" Categoria de peso Normal");
		if(imc >= 25 & imc <=29.9 )
			result.append(" Categoria de peso SobrePeso");
		if(imc >= 30 & imc <=34.9 )
			result.append(" Categoria de peso Obeso Classe 1");
		if(imc >= 35 & imc <=39.9 )
			result.append(" Categoria de peso Obeso Classe 2");
		if(imc >= 40)
			result.append(" Categoria de peso Obeso Classe 3");
		
		return result.toString();

				
	}
	@Override
	public String toString() {
		return "ImcBeam [peso=" + peso + ", altura=" + altura + ", getResult()=" + getResult() + "]";
	}
	
	

}
