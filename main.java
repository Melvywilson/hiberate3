package com.student;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class main {
	public static void main(String[] args)
	{
		try
		{
			Session session1=null;
			SessionFactory sf=new Configuration().configure
					().buildSessionFactory();
			session1=sf.openSession();
			Transaction tx=session1.beginTransaction();
			System.out.println("Inserting Record...<br>");
			Address address1=new Address("OMR Road","Chennai","TN","600097");
			Address address2=new Address("Ring Road","Banglore","Karnataka","560000");
			Student student1=new Student("Eswar",address1);
			Student student2=new Student("Joe",address2);
			session1.save(student1);
			session1.save(student2);
			tx.commit();
			session1.close();
			System.out.println("Done writing...<br>");
		}
		catch(Exception e)
		{
			System.out.println("Caught exception"+e);
		}
		
	}
	}
