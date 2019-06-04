package br.com.facisa.bd2.projeto.agendadecompromissos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AgendaDeCompromissos {

	public static void main(String[] args) {
		CompromissoProfissional compromisso1 =  new CompromissoProfissional();
		//CompromissoAcademico compromisso2 = new CompromissoAcademico();
		//CompromissoOutro compromisso3 = new CompromissoOutro();
		 
		compromisso1.setDescriçao("Entrevista de emprego");
		compromisso1.setDataCompromisso("12/06/2019");
		compromisso1.setHoraCompromisso("13:00");
		compromisso1.setLocal("Conductor");
		compromisso1.setQtdTempo("1 hora");
		
		//compromisso2.setDescriçao("prova de banco de dados");
		//compromisso2.setDataCompromisso("03/06/2019");
		//compromisso2.setHoraCompromisso("08:00");
		//compromisso2.setLocal("Unifacisa");
		//compromisso2.setSala("223");
		//compromisso2.setQtdTempo("2 horas");
		
		//compromisso3.setDescriçao("culto");
		//compromisso3.setDataCompromisso("02/06/2019");
		//compromisso3.setHoraCompromisso("09:30");
		//compromisso3.setLocal("igreja");
		//compromisso3.setQtdTempo("2 horas");
		//compromisso3.setPeriodicidade("semanalmente");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistencia");
	        EntityManager manager = factory.createEntityManager();
	        
	        manager.getTransaction().begin();        
	        manager.persist(compromisso1);
	        //manager.persist(compromisso2);
	       // manager.persist(compromisso3);
	        manager.getTransaction().commit();
	        
	        
	        manager.close();
	        factory.close();
}
}