package pl.com.mmadry.helloworld.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.com.mmadry.helloworld.core.model.User;


/**
 *
 * @author Mateusz Mądry <mmadry@soft-project.pl>
 */
public interface UserRepository extends JpaRepository<User, Long>{
    
    User findByEmail(String email);
    
}
