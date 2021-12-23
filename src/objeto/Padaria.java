package objeto;

import java.util.Scanner;

public class Padaria {
	private String produto;
	private double pre�o;
	private int qtd;
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public void cadastrar() {
		
		int opcao;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Bem-vida(o), cadastre seu produto aqui.");
			System.out.println("Nome do produto: ");
			this.produto = entrada.nextLine();
			entrada.nextLine();
			System.out.println("Pre�o: ");
			this.pre�o = entrada.nextDouble();
			System.out.println("Quantidade: ");
			this.qtd = entrada.nextInt();
			System.out.println("Cadastro do produto realizado com sucesso!");
			System.out.println("===========================================");
			System.out.println("Voc� deseja cadastrar mais um produto?");
			System.out.println("Pressione '1' para sim e '0' para n�o.");
			opcao = entrada.nextInt();
		} while(opcao == 1);
		
		System.out.println("Muito obrigado!");
		
		entrada.close();
		
	}
	
	public void comprar() {
		
		double valorTotal;
		String opcao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Produto: ");
		this.produto = entrada.nextLine();
		System.out.println("Quantidade: ");
		this.qtd = entrada.nextInt();
		System.out.println("Pre�o: ");
		this.pre�o = entrada.nextDouble();
		
		valorTotal = this.qtd * this.pre�o;
		
		System.out.println("A compra � de R$" + valorTotal + ". Voc� confirma a compra?[S/N]");
		entrada.nextLine();
		opcao = entrada.nextLine();
		
		if (opcao.equals("N")) {
			System.out.println("Compra cancelada.");
		} else {
			System.out.println("Compra realizada com sucesso.");
		}
		
		entrada.close();
	}

}
