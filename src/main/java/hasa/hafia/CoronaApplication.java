package hasa.hafia;

import java.text.SimpleDateFormat;
import java.util.Date;

import hasa.hafia.dao.UtilisateurRepository;
import hasa.hafia.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hasa.hafia.dao.CasRepository;

import hasa.hafia.entities.Cas;
import hasa.hafia.entities.CasConfirmer;
import hasa.hafia.entities.CasSuspect;

@SpringBootApplication
public class CoronaApplication implements CommandLineRunner {
;
	@Autowired 
	private CasRepository casdao;
	@Autowired
	private UtilisateurRepository userdao;
	
	
	
	public static void main(String[] args){
		SpringApplication.run(CoronaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cas cas=new Cas() {

		};
		CasConfirmer casconfirme =new CasConfirmer();

		casconfirme.setNom("bah");
		casconfirme.setPrenom("diallo");
		casconfirme.setAdresse("Dakar");
		casconfirme.setDateConfirmation(null);
		try {
			casdao.save(casconfirme);
			System.out.println("Un cas est suspect");
		}catch (Exception e) {
			e.printStackTrace();
		}

		CasSuspect casSuspect =new CasSuspect();

		casSuspect.setNom("Safi");
		casSuspect.setPrenom("diallo");
		casSuspect.setSymptome("fiere");
		casSuspect.setAdresse("Dakar");
		try {
			casdao.save(casSuspect);
			System.out.println("Un cas est confirmé");
		}catch (Exception e) {
			e.printStackTrace();
		}
		Utilisateur user = new Utilisateur();
		user.setUsername("safi@gmail.com");
		user.setPassword("safi");

		try {
			userdao.save(user);
			System.out.println("user ajoute");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}		

}