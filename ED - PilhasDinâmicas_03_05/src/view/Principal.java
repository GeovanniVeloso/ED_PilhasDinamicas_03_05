package view;

import javax.swing.JOptionPane;

import controller.HistoricoController;

public class Principal {

	public static void main(String[] args) {
		int op = 0;
		String endere�o = "";
		HistoricoController hc = new HistoricoController();
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para adicionar endere�os ao hist�rico \n"+"Digite 2 para retirar endere�os ao hist�rico \n"+"Digite 3 para consultar o �ltimo endere�o acessado \n"+"Digite 9 para sair"));
			switch (op) {
				case 1:
					endere�o = JOptionPane.showInputDialog("Insira o endere�o");
					hc.Adi�aoHistorico(endere�o);
					break;
				case 2:
					hc.Subtra�aoHistorico();
					break;
				case 3:
					hc.ConsultaHistorico();
					break;
				case 9: 
					System.out.println("Encerrando...");
					break;
				default:
					System.out.println("Op��o inv�lida");
					break;
			}
		}while(op!=9);

	}

}
