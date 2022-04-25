package br.com.fiap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Setup {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name = "Meu Setup";
	private String email = "teste@exemplo.com";
	private String password = "descriÃ§Ã£o do setup";
	private String birthDate = "10/10/10";

	public Setup() {
		super();
	}
	
	public Setup(String name, String email, String password, String birthDate) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.birthDate = birthDate;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	@Override
	public String toString() {
		return "Setup [name=" + name + ", email=" + email + ", password=" + password + ", birthDate=" + birthDate + "]";
	}
}
