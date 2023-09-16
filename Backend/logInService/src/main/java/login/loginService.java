package login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class loginService {
    private logInRepository lG;

    @Autowired
    public loginService(logInRepository lG) {
        this.lG = lG;
    }

    public boolean login(String userID, String password) {
        bloodDonor donor = lG.findByUserIdAndPassword(userID, password);
        if (donor != null) {
            return true;
        } else {
            return false;
        }
    }

   

    public String updateAvailability(String username, String availabilityStatus) {
        bloodDonor donor = lG.findByUserId(username);
        if (donor == null) {
            return "User not found.";
        }
        donor.setAvailabilityStatus(availabilityStatus);
        lG.save(donor);

        return "Availability status updated successfully.";
    }

	public bloodDonor getDetails(String userId) {
		// TODO Auto-generated method stub
		bloodDonor BD=lG.findByUserId(userId);
		return BD;
	}
}
