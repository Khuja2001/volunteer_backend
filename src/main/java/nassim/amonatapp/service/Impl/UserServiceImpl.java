package nassim.amonatapp.service.Impl;

import nassim.amonatapp.model.User;
import nassim.amonatapp.repository.UserRepository;
import nassim.amonatapp.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public String createUser(User user) {
        userRepository.save(user);
        return "Success";
    }
}
