package com.mhk.poc.main;

import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.mhk.poc.model.Phone;
import com.mhk.poc.model.Student;
import com.mhk.poc.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Student student = (Student)session.load(Student.class, 1l);
			System.out.println(student);
			
			Set<Phone> phones = student.getStudentPhoneNumbers();
			System.out.println("This student has set of "+ student.getStudentPhoneNumbers().size()+" phones");
			for(Phone phone : phones){
				System.out.println(phone.getPhoneNumber() + phone.getPhoneType());
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
