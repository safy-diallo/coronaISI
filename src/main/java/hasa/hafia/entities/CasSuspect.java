package hasa.hafia.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("casSuspect")
public class CasSuspect extends Cas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String symptome;
	@Column	
	private Date dateConfirmation;
	public CasSuspect() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CasSuspect(Long id, String symptome) {
		super();
		this.id = id;
		this.symptome = symptome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSymptome() {
		return symptome;
	}
	public void setSymptome(String symptome) {
		this.symptome = symptome;
	}

	public Date getDateConfirmation() {
		return dateConfirmation;
	}

	public void setDateConfirmation(Date dateConfirmation) {
		this.dateConfirmation = dateConfirmation;
	}
	
}