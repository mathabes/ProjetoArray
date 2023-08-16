package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cadastro;

public class TesteCadastroVetor {
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		Cadastro[] vetorCadastro = new Cadastro[3];
		int indice = 0;
		int continuar = 0;
		do {
			vetorCadastro[indice] = new Cadastro();
			vetorCadastro[indice].setNome(texto("Digite seu nome"));
			vetorCadastro[indice].setRg(texto("Digite seu RG"));
			vetorCadastro[indice].setIdade(inteiro("Digite sua idade"));
			vetorCadastro[indice].setAltura(real("Digite sua altura"));
			indice ++;
		}while(JOptionPane.showConfirmDialog(null, "Cadastrar outra conta?", "Cadastro", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		for (continuar = 0; continuar < indice; continuar++) {
			System.out.println("Cadastro" + (continuar + 1) +
					"\nNome: " + vetorCadastro[indice].getNome() +
					"\nRG: " + vetorCadastro[indice].getRg() +
					"\nIdade: " + vetorCadastro[indice].getIdade() +
					"\nAltura: " + vetorCadastro[indice].getAltura());
		}
	}
}
