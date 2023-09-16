package DonorList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorService {
    @Autowired
    private DonorRepository donorRep;

    public List<bloodDonor> getAllDonor(String bloodGroup) {
        return donorRep.findAllByBloodGroup(bloodGroup);
    }

    public List<bloodDonor> getAllDonor(String bloodGroup, String state, String city) {
        return donorRep.findAllByBloodGroupAndStateAndCityAndAvailabilityStatus(bloodGroup, state, city, "Available");
    }
}
