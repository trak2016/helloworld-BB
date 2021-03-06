package pl.com.mmadry.helloworld.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import pl.com.mmadry.helloworld.core.model.User;
import pl.com.mmadry.helloworld.core.repository.UserRepository;

/**
 *
 * @author Mateusz Mądry <mmadry@soft-project.pl>
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public User getElement(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getElements() {
        return userRepository.findAll();
    }

    @Override
    public void add(User element) {
        userRepository.save(element);
    }

    @Override
    public void update(User element) {
        userRepository.save(element);
    }

    @Override
    public void delete(User element) {
        userRepository.delete(element);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.delete(id);
    }

    @Override
    public User save(User element) {
        return userRepository.save(element);
    }
}
