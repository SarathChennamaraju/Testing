package crud.springbootcrud.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import crud.springbootcrud.entity.User;
import crud.springbootcrud.service.UserService;
import crud.springbootcrud.service.UserServiceImpl;

@RestController
@RequestMapping("api/users")
public class UserController {
	private static final org.slf4j.Logger LOGGER =LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserServiceImpl userservice;
	@PostMapping
    public User createUser(@RequestBody User user){
        User savedUser = userservice.CreateUser(user);
        LOGGER.info("User saved successfully");
        return savedUser;
    }

    // build get user by id REST API
    // http://localhost:8080/api/users/1
    @GetMapping("{id}")
    public Optional<User> getUserById(@PathVariable int id){
        Optional<User> user = userservice.getUserById(id);
        LOGGER.info("User with id viewed successfully");
        return user;
    }

    // Build Get All Users REST API
    // http://localhost:8080/api/users
    @GetMapping
    public List<User> getAllUsers(){
        List<User> users = userservice.getAllUsers();
        LOGGER.info("Users viewed successfully");
        return users;
    }

     //Build Update User REST API
    @PutMapping("{id}")
//     http://localhost:8080/api/users/1
    public User updateUser(@PathVariable int id,
                                           @RequestBody User user){
        user.setId(id);
        User updatedUser = userservice.UpdateUser(user);
        LOGGER.info("User updated successfully");
        return updatedUser;
    }

    // Build Delete User REST API
   @DeleteMapping("{id}")
    public String deleteUser(@PathVariable int id){
        userservice.DeleteUser(id);
        LOGGER.info("Data deleted successfully");
        return "User successfully deleted!";
        
    }
}



