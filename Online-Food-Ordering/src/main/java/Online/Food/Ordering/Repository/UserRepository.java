package Online.Food.Ordering.Repository;

import Online.Food.Ordering.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    static User findByEmail(String email) {
        return null;
    }

}