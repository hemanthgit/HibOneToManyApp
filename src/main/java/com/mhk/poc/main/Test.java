package com.mhk.poc.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mhk.poc.model.Phone;
import com.mhk.poc.model.Student;
import com.mhk.poc.util.HibernateUtil;

// Test
public class Test {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			/*Loading Data*/
			Student student = (Student)session.load(Student.class, 1l);
			System.out.println(student);
			
			Set<Phone> phones = student.getStudentPhoneNumbers();
			System.out.println("This student has set of "+ student.getStudentPhoneNumbers().size()+" phones");
			for(Phone phone : phones){
				System.out.println(phone.getPhoneNumber() + phone.getPhoneType());
			}
			
			/*Inserting  Data*/
			Transaction transaction = session.beginTransaction();
			Phone phone1 = new Phone();
			phone1.setPhoneNumber(01234);
			phone1.setPhoneType("Apple");
			
			Phone phone2 = new Phone();
			phone2.setPhoneNumber(129);
			phone2.setPhoneType("Asus");
			
			Set<Phone> stuPhoneNumbers = new HashSet<Phone>();
			stuPhoneNumbers.add(phone1);
			stuPhoneNumbers.add(phone2);
			
			Student stu = new Student();
			stu.setStudentName("pqr");
			stu.setStudentPhoneNumbers(stuPhoneNumbers);
			
			session.save(stu);
			transaction.commit();
			System.out.println("Student data inserted successfully");
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
