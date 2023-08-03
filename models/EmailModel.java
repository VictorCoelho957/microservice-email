package models;

import java.io.Serializable;
import java.time.LocalDateTime;

import enums.StatusEmail;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
//classe com os dados

@Data
@Entity
@Table(name="TB_EMAIL")
public class EmailModel implements 	Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long emailId;
	
	private String owernRef;
	
	private String emailFrom;
	
	private String emailTo;
	
	private String subject;
	
	@Column(columnDefinition="TEXT")
	private String text;
	
	private  LocalDateTime sendDateEmail;
	
	//tipo enumerado
	private StatusEmail statusEmail;
	
	
	
	
	
	
	
	
	
	
	

}
