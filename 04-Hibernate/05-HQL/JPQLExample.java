package Hibernate;

import jakarta.persistence.*;
import java.util.List;

public class JPQLExample {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        //  SELECT all
        List<Student> list = em.createQuery("from Student", Student.class).getResultList();
        for (Student s : list) {
            System.out.println(s);
        }

        //  SELECT with WHERE
        List<Student> filtered = em.createQuery(
                "from Student where age > :age", Student.class)
                .setParameter("age", 20)
                .getResultList();

        System.out.println("\nFiltered:");
        filtered.forEach(System.out::println);

        //  UPDATE
        Query updateQuery = em.createQuery(
                "update Student set name = :name where id = :id");
        updateQuery.setParameter("name", "Updated JPQL");
        updateQuery.setParameter("id", 1);
        int updated = updateQuery.executeUpdate();
        System.out.println("\nRows Updated: " + updated);

        //  DELETE
        Query deleteQuery = em.createQuery(
                "delete from Student where id = :id");
        deleteQuery.setParameter("id", 2);
        int deleted = deleteQuery.executeUpdate();
        System.out.println("Rows Deleted: " + deleted);

        tx.commit();

        em.close();
        emf.close();
    }
}
