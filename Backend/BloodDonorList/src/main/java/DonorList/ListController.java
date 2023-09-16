package DonorList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListController {
    @Autowired
    private DonorService DService;
    
    @CrossOrigin
    @GetMapping("/blood/{bloodGroup}")
    public List<bloodDonor> getAllDonor(@PathVariable String bloodGroup) {
        return DService.getAllDonor(bloodGroup);
    }
    @CrossOrigin
    @GetMapping("/blood/{bloodGroup}/{state}/{city}")
    public List<bloodDonor> getAllDonor(@PathVariable String bloodGroup,
    		@PathVariable String state,@PathVariable String city){
    	return DService.getAllDonor(bloodGroup,state,city);
    }
}
