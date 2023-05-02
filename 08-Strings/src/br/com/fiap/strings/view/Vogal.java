package br.com.fiap.strings.view;

import javax.swing.JOptionPane;

public class Vogal {
	public static void main(String[] args) {
	
		String palavra= JOptionPane.showInputDialog("Insira a palavra: ");
		
		String palavraVogal  = (palavra.replaceAll("[a,e,i,o,u]","*"));
		//String palavraVogale = palavra.replace("e","*");
		//String palavraVogali = palavra.replace("i","*");
		//String palavraVogalo = palavra.replace("o","*");
		//String palavraVogalu = palavra.replace("u","*");
		
		
		System.out.println(palavraVogal);
	}
}