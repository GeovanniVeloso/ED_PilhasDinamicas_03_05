package controller;

import model.PilhaString;

public class HistoricoController {
	PilhaString ps = new PilhaString();
	public HistoricoController() {
		super();
	}
	
	public void Adi�aoHistorico(String endere�o) {
		if(endere�o.contains("https://www.")&&endere�o.contains(".co")) {
			ps.push(endere�o);
			System.out.println("Endere�o adicionado");
		}else {
			System.err.println("Endere�o Inv�lido");
		}
	}
	
	public void Subtra�aoHistorico() {
		String endret = "";
		try {
			endret = ps.pop();
		} catch (Exception e) {
			System.err.println("N�o existem valores no hist�rico");
		}
		if(endret.equals("")) {
		}else {
			System.out.println("O endere�o "+endret+" foi retirado");
		}
	}
	
	public void ConsultaHistorico() {
		try {
			System.out.println("O �ltimo endere�o no hist�rico �"+ps.top());
		} catch (Exception e) {
			System.err.println("N�o existem endere�os no hist�rico");
		}
	}

}
