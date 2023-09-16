package DonorList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonorRepository extends JpaRepository<bloodDonor, Long> {
    List<bloodDonor> findAllByBloodGroup(String bloodGroup);

	List<bloodDonor> findAllByBloodGroupAndStateAndCityAndAvailabilityStatus(String bloodGroup, String state,
			String city, String string);
}