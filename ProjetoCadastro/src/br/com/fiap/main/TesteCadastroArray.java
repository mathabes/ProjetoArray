package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cadastro;

public class TesteCadastroArray {
	
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
		List<Cadastro> listaCad = new ArrayList<Cadastro>();
		do {
			Cadastro objC = new Cadastro();
			objC.setNome(texto("Digite seu nome"));
			objC.setRg(texto("Digite seu RG"));
			objC.setIdade(inteiro("Digite sua idade"));
			objC.setAltura(real("Digite sua altura"));
			listaCad.add(objC);
		}while(JOptionPane.showConfirmDialog(null, "Cadastrar outra conta?", "Cadastro", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		
		for (Cadastro objC: listaCad) {
			System.out.println("\nNome: " + objC.getNome() +
					"\nRG: " + objC.getRg() +
					"\nIdade: " + objC.getIdade() +
					"\nAltura: " + objC.getAltura());
		}

	}
}
