package amazon.clone.orchestrator;

import amazon.clone.models.User;
import amazon.clone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserOrchestrator {
    @Autowired
    private UserService userService;

    public void addUser(User User) throws Exception {
        userService.createUser(User);
    }
}
