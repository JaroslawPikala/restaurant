package pl.coderslab.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void createUser(User user){
        userRepository.save(user);
    }

    public void saveUser(User user){
        userRepository.save(user);
    }
}
