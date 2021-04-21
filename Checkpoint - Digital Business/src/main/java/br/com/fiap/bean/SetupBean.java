package br.com.fiap.bean;


import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.fiap.dao.SetupDao;
import br.com.fiap.model.Setup;

@Named
@RequestScoped 
public class SetupBean {

	private Setup setup = new Setup();
	
	//METODO CADASTRAR SETUPS
	public void cadastrarSetups() {
		new SetupDao().criarSetups(this.setup);
		System.out.println(this.setup);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Setup cadastrado."));
	}

	//LISTAR SETUPS
	public List<Setup> getSetups(){
		return new SetupDao().listarSetups();
	}
	
	//GETTERS AND SETTERS
	public Setup getSetup() {
		return setup;
	}

	public void setSetup(Setup setup) {
		this.setup = setup;
	}
	
	
}
