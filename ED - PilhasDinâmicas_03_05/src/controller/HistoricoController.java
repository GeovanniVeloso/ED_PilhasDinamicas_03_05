package controller;

import model.PilhaString;

public class HistoricoController {
	PilhaString ps = new PilhaString();
	public HistoricoController() {
		super();
	}
	
	public void AdiçaoHistorico(String endereço) {
		if(endereço.contains("https://www.")&&endereço.contains(".co")) {
			ps.push(endereço);
			System.out.println("Endereço adicionado");
		}else {
			System.err.println("Endereço Inválido");
		}
	}
	
	public void SubtraçaoHistorico() {
		String endret = "";
		try {
			endret = ps.pop();
		} catch (Exception e) {
			System.err.println("Não existem valores no histórico");
		}
		if(endret.equals("")) {
		}else {
			System.out.println("O endereço "+endret+" foi retirado");
		}
	}
	
	public void ConsultaHistorico() {
		try {
			System.out.println("O último endereço no histórico é"+ps.top());
		} catch (Exception e) {
			System.err.println("Não existem endereços no histórico");
		}
	}

}
