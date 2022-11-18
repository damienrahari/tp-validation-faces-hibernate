package dao;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import entity.Livre;
import utils.HibernateUtil;

@ManagedBean(name = "livreDAO")
public class LivreDAO {
	// SAUVEGARDE----------------------------------------------------------------------------
		public static void persist(Livre livre) {

			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction t = session.beginTransaction();
			try {

				session.persist(livre);
				t.commit();
			} catch (Exception e) {
				System.out.print(e.getMessage());
				t.rollback();
			}
			session.close();
		}
		// La méthode qui suit est appelée dans la classe Livre
		public void create(Livre livre) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			try {
				session.persist(livre);
				transaction.commit();
			} catch (Exception e) {
				transaction.rollback();
			}
		}

		public Livre read(Integer id) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			try {
				Livre personne = session.get(Livre.class, id);
				transaction.commit();
				return personne;
			} catch (Exception e) {
				transaction.rollback();
				return null;
			}
		}

		public static void update(Livre livre) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			try {
				session.update(livre);
				transaction.commit();
			} catch (Exception e) {
				transaction.rollback();
			}
		}

		public void delete(Livre livre) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			try {
				session.delete(livre);
				transaction.commit();
			} catch (Exception e) {
				transaction.rollback();
			}
		}
		
		public static List<Livre> getAll(){
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			
			Query<Livre> query = session.createQuery("SELECT * FROM livre",Livre.class);
			List<Livre> listLivre = query.list();
			transaction.commit();
			session.close();
			return listLivre;
		}

}





//LIST System.out.println("Nos livres" + listLivre);