package term.project;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class JpaMain {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("UNG");

	public static void main(String[] args) {
		
		
	EntityManager em = emf.createEntityManager();
	EntityTransaction tx =em.getTransaction();
	 
	 try {
		 tx.begin();
		 
			//감독
		 	Director Dir1 = new Director();
			Dir1.setAppeared("너는");
			Dir1.setHomeTown("울산");
			Director Dir2 = new Director();
			Dir2.setAppeared("그리고");
			Dir2.setHomeTown("부산");
			Director Dir3 = new Director();
			Dir3.setAppeared("나는");
			Dir3.setHomeTown("대구");
			Director Dir4= new Director();
			Dir4.setAppeared("쉬고 싶다");
			Dir4.setHomeTown("구미");

			Actor MainAct1= new Actor();
			MainAct1.setIsMain("Main");
			Actor MainAct2= new Actor();
			MainAct2.setIsMain("Main");
			Actor MainAct3= new Actor();
			MainAct3.setIsMain("Main");
			Actor MainAct4= new Actor();
			MainAct4.setIsMain("Main");
			Actor MainAct5= new Actor();
			MainAct5.setIsMain("Main");
			Actor MainAct6= new Actor();
			MainAct6.setIsMain("Main");
			Actor MainAct7= new Actor();
			MainAct7.setIsMain("Main");
			Actor MainAct8= new Actor();
			MainAct8.setIsMain("Main");
		
			Actor SubAct1= new Actor();
			SubAct1.setIsMain("Sub");
			Actor SubAct2= new Actor();
			SubAct2.setIsMain("Sub");
			Actor SubAct3= new Actor();
			SubAct3.setIsMain("Sub");
			Actor SubAct4= new Actor();
			SubAct4.setIsMain("Sub");
			Actor SubAct5= new Actor();
			SubAct5.setIsMain("Sub");
			Actor SubAct6= new Actor();
			SubAct6.setIsMain("Sub");

			Actor SubAct7= new Actor();
			SubAct7.setIsMain("Sub");
			Actor SubAct8= new Actor();
			SubAct8.setIsMain("Sub");
			Actor SubAct9= new Actor();
			SubAct9.setIsMain("Sub");
			Actor SubAct10= new Actor();
			SubAct10.setIsMain("Sub");
			Actor SubAct11= new Actor();
			SubAct11.setIsMain("Sub");
			Actor SubAct12= new Actor();
			SubAct12.setIsMain("Sub");


			
			
			
			List<MovieWorker> worker1 =new ArrayList<MovieWorker>();
			List<MovieWorker> worker2 =new ArrayList<MovieWorker>();
			List<MovieWorker> worker3=new ArrayList<MovieWorker>();
			List<MovieWorker> worker4 =new ArrayList<MovieWorker>();

			worker1.add(Dir1);
			worker2.add(Dir2);
			worker3.add(Dir3);
			worker4.add(Dir4);
			worker1.add(MainAct1);
			worker1.add(MainAct2);
			worker2.add(MainAct3);
			worker2.add(MainAct4);
			worker3.add(MainAct5);
			worker3.add(MainAct6);
			worker4.add(MainAct7);
			worker4.add(MainAct8);

			worker1.add(SubAct1);
			worker1.add(SubAct2);
			worker1.add(SubAct3);
			worker2.add(SubAct4);
			worker2.add(SubAct5);
			worker2.add(SubAct6);
			worker3.add(SubAct7);
			worker3.add(SubAct8);
			worker3.add(SubAct9);
			worker4.add(SubAct10);
			worker4.add(SubAct11);
			worker4.add(SubAct12);


			Iterator itr1 = worker1.iterator();
			Iterator itr2 = worker2.iterator();
			Iterator itr3 = worker3.iterator();
			Iterator itr4 = worker4.iterator();

			em.persist(worker1.get(0));
			em.persist(worker2.get(0));
			em.persist(worker3.get(0));
			em.persist(worker4.get(0));

			 while (itr1.hasNext()) {
		         	em.persist(itr1.next());
			 }
			 while (itr2.hasNext()) {
		         	em.persist(itr2.next());
			 } while (itr3.hasNext()) {
		         	em.persist(itr3.next());
			 } while (itr4.hasNext()) {
		         	em.persist(itr4.next());
			 }
		 
		 
		 
		 //영화 
		 LocalDateTime date =LocalDateTime.now();
		 LocalDateTime Release = LocalDateTime.of(2013, 12, 5, 0, 0);
		 
		 Movie M4 = new Movie();
		 M4.setGenre(Genre.Action);
		 M4.setMovieName("피곤하다");;
		 M4.setlastModifiedDate(date);
		 M4.setCreatedDate(date);
		 M4.setRunningTime(120);
		 M4.setReleaseDate(Release);
		 M4.setWoker(worker1);

		 Movie M3 = new Movie();
		 M3.setGenre(Genre.Romance);
		 M3.setMovieName("집에가고싶다 ");;
		 M3.setlastModifiedDate(date);
		 M3.setCreatedDate(date);
		 M3.setRunningTime(100);
		 M3.setReleaseDate(Release);
		 M3.setWoker(worker2);

		 Movie M2 = new Movie();
		 M2.setGenre(Genre.Action);
		 M2.setMovieName("근데 점수는 좋게 받고 싶다 ");;
		 M2.setlastModifiedDate(date);
		 M2.setCreatedDate(date);
		 M2.setRunningTime(18);
		 M2.setReleaseDate(Release);
		 M2.setWoker(worker3);

		 
		 Movie M1 = new Movie();
		 M1.setGenre(Genre.Thriller);
		 M1.setMovieName("수명이 줄어들 것 같아요. ");;
		 M1.setlastModifiedDate(date);
		 M1.setCreatedDate(date);
		 M1.setRunningTime(18);
		 M1.setReleaseDate(Release);
		 M1.setWoker(worker4);
		 
			
		 
		 
		 
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