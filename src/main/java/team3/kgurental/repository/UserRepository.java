package team3.kgurental.repository;

import org.springframework.stereotype.Repository;
import team3.kgurental.model.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    private  EntityManager em;

    public void save(User user){
        em.persist(user);
    }

    public User findOne(String userId) {
        return em.find(User.class, userId);
    }


    public List<User> findByLoginId(String userId) {          //아이디로 회원찾기
        return em.createQuery("select m from User m where m.userId = :userId", User.class)
                .setParameter("userId", userId)
                .getResultList();
    }

}
