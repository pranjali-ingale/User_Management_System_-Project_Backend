package controller;	

	import entity.User;
	import service.UserService;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	import java.util.List;

	@RestController
	@RequestMapping("/api/users")
	@CrossOrigin(origins = "http://localhost:3000")
	public class UserController {

	    @Autowired
	    private UserService service;

	    // GET all users
	    @GetMapping
	    public List<User> getAllUsers() {
	        return service.getAllUsers();
	    }

	    // GET user by ID
	    @GetMapping("/{id}")
	    public User getUser(@PathVariable Long id) {
	        return service.getUserById(id);
	    }

	    // CREATE user
	    @PostMapping
	    public User createUser(@RequestBody User user) {
	        return service.createUser(user);
	    }

	    // UPDATE user
	    @PutMapping("/{id}")
	    public User updateUser(@PathVariable Long id, @RequestBody User user) {
	        return service.updateUser(id, user);
	    }

	    // DELETE user
	    @DeleteMapping("/{id}")
	    public void deleteUser(@PathVariable Long id) {
	        service.deleteUser(id);
	    }
	}

