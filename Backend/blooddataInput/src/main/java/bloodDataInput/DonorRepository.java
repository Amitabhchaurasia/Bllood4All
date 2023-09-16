package bloodDataInput;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonorRepository extends CrudRepository<bloodDonor, Long> {
    // Add custom query methods if needed
    Optional<bloodDonor> findByUserId(String userId);

	Optional<bloodDonor> findByFullNameAndMobileNumber(String fullName, String mobileNumber);
}
