package Hibernate;

import jakarta.persistence.*;

public class UpdateExample {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Student s = em.find(Student.class, 1);

        if (s != null) {
            s.setName("Updated Name");
            s.setAge(25);

            em.merge(s);
            System.out.println("Updated Successfully!");
        }

        tx.commit();

        em.close();
        emf.close();
    }
}
