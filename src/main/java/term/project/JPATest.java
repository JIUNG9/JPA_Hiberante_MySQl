package term.project;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class JPATest {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("UNG");

	public static void main(String[] args) {
		
		
	EntityManager em = emf.createEntityManager();
	EntityTransaction tx =em.getTransaction();
	 
	 try {
		 tx.begin();
		 
		 LocalDateTime date =LocalDateTime.now();
		 LocalDateTime Release = LocalDateTime.of(2013, 12, 5, 0, 0);
		 
		 Movie M4 = new Movie();
		 M4.setGenre(Genre.Action);
		 M4.setMovieName("Nemo");;
		 M4.setlastModifiedDate(date);
		 M4.setCreatedDate(date);
		 M4.setRunningTime(120);
		 M4.setReleaseDate(Release);
		 
		 Movie M3 = new Movie();
		 M3.setGenre(Genre.Romance);
		 M3.setMovieName("나는 언제 쉴 수 있나요 ");;
		 M3.setlastModifiedDate(date);
		 M3.setCreatedDate(date);
		 M3.setRunningTime(100);
		 M3.setReleaseDate(Release);
		 
		 Movie M2 = new Movie();
		 M2.setGenre(Genre.Action);
		 M2.setMovieName("집에 가고 싶어요 ");;
		 M2.setlastModifiedDate(date);
		 M2.setCreatedDate(date);
		 M2.setRunningTime(18);
		 M2.setReleaseDate(Release);
		 
			
//			감독 배우
//			MovieWorker act1 = new Actor();
//			act1.setAppeared("집에 가고싶어");
//			MovieWorker act2 = new Actor();
//			act2.setAppeared("집에 가고싶어");
//
//			MovieWorker Dir1 = new Director();
//			Dir1.setAppeared("집에 가고싶어");
//
//			MovieWorker Dir2 = new Director();
//			Dir2.setAppeared("집에 가고싶어");
//			
//			List<MovieWorker> worker =new ArrayList<MovieWorker>();
//			worker.add(act1);
//			worker.add(act2);
//			worker.add(Dir1);
//			worker.add(Dir2);
//			
//		//	em.persist(worker);
//			
//			em.persist(act1);
//			em.persist(act2);
//			em.persist(Dir1);
//			em.persist(Dir2);
//		 
		 Movie M1 = new Movie();
		 M1.setGenre(Genre.Thriller);
		 M1.setMovieName("수명이 줄어들 것 같아요. ");;
		 M1.setlastModifiedDate(date);
		 M1.setCreatedDate(date);
		 M1.setRunningTime(18);
		 M1.setReleaseDate(Release);
//		 M1.setWoker(worker);
		 
		 
		em.persist(M4);
		em.persist(M3);
		em.persist(M2);
		em.persist(M1);
		tx.commit();
		


	
		
		

				 
	 }catch (Exception e) {
		 
		tx.rollback();
	}
		finally {
			em.close();
			
		}
	 emf.close();
	}
	
	
}