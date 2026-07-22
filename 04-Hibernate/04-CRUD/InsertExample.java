package Hibernate;

import jakarta.persistence.*;

public class InsertExample {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Student s = new Student("Adesh", 21);
        em.persist(s);

        tx.commit();

        em.close();
        emf.close();

        System.out.println("Inserted Successfully!");
    }
}
