package view;

import javax.swing.JOptionPane;

import controller.HistoricoController;

public class Principal {

	public static void main(String[] args) {
		int op = 0;
		String endereço = "";
		HistoricoController hc = new HistoricoController();
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para adicionar endereços ao histórico \n"+"Digite 2 para retirar endereços ao histórico \n"+"Digite 3 para consultar o último endereço acessado \n"+"Digite 9 para sair"));
			switch (op) {
				case 1:
					endereço = JOptionPane.showInputDialog("Insira o endereço");
					hc.AdiçaoHistorico(endereço);
					break;
				case 2:
					hc.SubtraçaoHistorico();
					break;
				case 3:
					hc.ConsultaHistorico();
					break;
				case 9: 
					System.out.println("Encerrando...");
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}
		}while(op!=9);

	}

}
