package bloodDataInput;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private bloodDonorService donorRepo;
    @CrossOrigin
    @PostMapping("/blood")
    public String addDonor(@RequestBody bloodDonor BD) {
        boolean userIdExists = donorRepo.donorExists(BD.getUserId());
        boolean fullNameAndMobileNumberExists = donorRepo.donorExists(BD.getFullName(), BD.getMobileNumber());

        if (userIdExists && fullNameAndMobileNumberExists) {
        	return "1";
        } else if (userIdExists) {
        	return "2";
            
        } else if (fullNameAndMobileNumberExists) {
        	return "3";
            
        }

        donorRepo.addDonor(BD);
        return "4";
        
    }
}
