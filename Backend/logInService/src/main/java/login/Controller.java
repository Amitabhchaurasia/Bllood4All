package login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Controller {
    @Autowired
    private loginService ls;
    
    @CrossOrigin
    @GetMapping("login/{username}/{password}")
    public boolean login(@PathVariable String username, @PathVariable String password) {
        return ls.login(username, password);
    }
    
    @CrossOrigin
    @GetMapping("login/{username}")
    public bloodDonor getDetails(@PathVariable String username) {
        return ls.getDetails(username);
    }
    
    @CrossOrigin
    @PutMapping("/update/{username}/{availabilityStatus}")
    public String updateAvailability(@PathVariable String username, @PathVariable String availabilityStatus) {
        return ls.updateAvailability(username, availabilityStatus);
    }
}
