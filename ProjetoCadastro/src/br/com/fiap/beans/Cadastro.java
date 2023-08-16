package br.com.fiap.beans;

public class Cadastro {
	private String nome;
	private String rg;
	private int idade;
	private double altura;
	public Cadastro() {
		super();
	}
	public Cadastro(String nome, String rg, int idade, double altura) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.idade = idade;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
