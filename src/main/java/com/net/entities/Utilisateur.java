package com.net.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;

/**
 * @author KALLO MOHAMED
 *
 */
@Entity
@Table(name="USER")
public class Utilisateur extends GenericBean{
	
	@Id
	@GeneratedValue
	private Integer code;
	
	/** login */
	private String login;
	
	/** mot de passe */
	private String password;
	
	/** nom */
    private String nom;
    
    /** prenom */
    private String prenom;
    
    private Boolean superAdmin;

    private Boolean actif;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserRole> roles;

	public Integer getCode() {
		return code;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login == null ? null : login.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null? null : password.trim();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom == null ? null : nom.trim();
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Boolean getSuperAdmin() {
		return superAdmin;
	}

	public void setSuperAdmin(Boolean superAdmin) {
		this.superAdmin = superAdmin;
	}

	public Boolean getActif() {
		return actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	public List<UserRole> getRoles() {
		return roles;
	}

	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}

	@Override
	public Integer getId() {
		return getCode();
	}

	
	/**
	 * getFullUsername
	 * @return
	 */
	public String getFullUsername() {
		String nom = getNom();
		String prenom = getPrenom();
		prenom = StringUtils.isEmpty(prenom) ? "" : " " + prenom;
		return StringUtils.trim(nom + prenom);
	}
	
}
