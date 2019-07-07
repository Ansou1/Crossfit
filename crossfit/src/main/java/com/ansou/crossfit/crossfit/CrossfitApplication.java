package com.ansou.crossfit.crossfit;

import com.ansou.crossfit.crossfit.Entity.Client;
import com.ansou.crossfit.crossfit.Entity.Course;
import com.ansou.crossfit.crossfit.Entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrossfitApplication {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Client.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Teacher.class)
				.buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			/*Course myCourse = new Course("Java tutorial with frameworks");

            Review firstReview = new Review("Very good :)");
            Review secondReview = new Review("Good");
            Review thirdReview = new Review("It's okay");
            Review fourthReview = new Review("The course is lacking of information");
            Review fifthReview = new Review("The course is useless");

            myCourse.add(firstReview);
            myCourse.add(secondReview);
            myCourse.add(thirdReview);
            myCourse.add(fourthReview);
            myCourse.add(fifthReview);

            session.save(myCourse);*/

            /*
            Course myCourse = session.get(Course.class, 10);
            System.out.println(myCourse);
            System.out.println(myCourse.getReviews());
            */

			Course myCourse = session.get(Course.class, 10);
			session.delete(myCourse);


			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}

}
