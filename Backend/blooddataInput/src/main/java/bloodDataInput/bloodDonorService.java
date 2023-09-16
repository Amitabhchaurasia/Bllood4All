package bloodDataInput;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bloodDonorService {

    @Autowired
    private DonorRepository donorRep;

    public void addDonor(bloodDonor bD) {
        donorRep.save(bD);
    }
    public boolean donorExists(String userId) {
        Optional<bloodDonor> donor = donorRep.findByUserId(userId);
        return donor.isPresent();
    }
    public boolean donorExists(String fullName, String mobileNumber) {
        Optional<bloodDonor> donorByNameAndNumber = donorRep.findByFullNameAndMobileNumber(fullName, mobileNumber);
        return donorByNameAndNumber.isPresent();
    }

}
