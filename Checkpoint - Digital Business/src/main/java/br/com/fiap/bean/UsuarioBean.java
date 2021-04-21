package br.com.fiap.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.model.Usuario;

@Named
@RequestScoped 
public class UsuarioBean {

	private Usuario usuario = new Usuario();
	
	//METODO CADASTRAR
	public void cadastrarUsuario() {
		new UsuarioDao().criarUsuario(this.usuario);
		System.out.println(this.usuario);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuario cadastrado."));
	}
	
	//METODO LIST
	public List<Usuario> getUsuarios(){
		return new UsuarioDao().listarUsuarios();
	}

	//GETTERS AND SETTERS
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
