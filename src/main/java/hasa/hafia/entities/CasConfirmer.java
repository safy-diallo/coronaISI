package hasa.hafia.entities;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@DiscriminatorValue("casConfirme")
@Entity
public class CasConfirmer extends Cas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column	
	private Date dateConfirmation;
	private String symptome;
	
	public CasConfirmer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CasConfirmer(Long id, Date dateConfirmation) {
		super();
		this.id = id;
		this.dateConfirmation = dateConfirmation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateConfirmation() {
		return dateConfirmation;
	}

	public void setDateConfirmation(Date dateConfirmation) {
		this.dateConfirmation = dateConfirmation;
	}

	public String getSymptome() {
		return symptome;
	}

	public void setSymptome(String symptome) {
		this.symptome = symptome;
	}

	public CasConfirmer(String symptome) {
		super();
		this.symptome = symptome;
	}

	

}