package br.com.fiap.strings.view;

import javax.swing.JOptionPane;

public class ExemploSubstring {
	
	public static void main(String[] args) {
		//Ler um nome completo (nome e sobrenome), com JOPtionPane
		String nome = JOptionPane.showInputDialog("Digite o nome e sobrenome");
		
		//Exibir o nome "Pedro Archilha"
		String primeiroNome = nome.substring(0, nome.indexOf(" "));
		System.out.println(primeiroNome);		
		
		//Exibir o sobrenome
		String sobrenome = nome.substring(nome.indexOf(" ")+1);
		System.out.println(sobrenome);
		
		//Ler uma data (dd/mm/aaaa)
		String data = JOptionPane.showInputDialog("Digite a data em formato dd/mm/aaaa");
		
		//Exibir o dia
		String dia  = data.substring(0,data.indexOf("/"));
		System.out.println(dia);
		
		
		//Exibir o mês 
		String mes  = data.substring(data.indexOf("/")+1,+data.lastIndexOf("/"));
		System.out.println(mes);
		//16/06/1998
		//0123456789
		
		//Exibir o ano
		String ano  = data.substring(data.lastIndexOf("/")+1);
		System.out.println(ano);
		//Ler um e-mail
		String email = JOptionPane.showInputDialog("Insira o e-mail");
		
		
		//Exibir o dominio do email
		String dominio = email.substring(email.indexOf("@")+1,(email.indexOf(".")));
	//mail.substring(0,email.indexOf("."));
		System.out.println(dominio);
		
	}//main
}//class