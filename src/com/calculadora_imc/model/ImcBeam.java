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
		Float result = peso / (altura*2);
		if(result.isNaN()) {
			return "Falhou";
		}
		return new DecimalFormat("#.##").format(result);

		
			
	}
	@Override
	public String toString() {
		return "ImcBeam [peso=" + peso + ", altura=" + altura + ", getResult()=" + getResult() + "]";
	}
	
	

}
