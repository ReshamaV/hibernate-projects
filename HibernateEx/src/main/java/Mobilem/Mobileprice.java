package Mobilem;
 
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder; 
import org.hibernate.Session;



import Mobile.model.Mobilem;


public class Mobileprice {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        Session session = factory.openSession();  
        Transaction t = session.beginTransaction();  
		Mobilem mp = new Mobilem(1,"Redmi","15000");
        Mobilem mp1 = new Mobilem(2,"Realme","10000");
     //   Transaction transaction = null;
     //   Session session = HiberMobile.getSessionFactory().openSession();
            // start a transaction
          //  session.beginTransaction();
            // save the student objects
            session.save(mp);
            session.save(mp1);
            // commit transaction
       //     session.getTransaction().commit();
       /* } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
	}*/
         //   session.save(e1);  
            t.commit();  
            System.out.println("successfully saved");    
         //    factory.close();  
           //  session.close();     
	}
}
