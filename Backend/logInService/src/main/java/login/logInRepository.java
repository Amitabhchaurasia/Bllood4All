package login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface logInRepository extends JpaRepository<bloodDonor, Long> {
    bloodDonor findByUserIdAndPassword(String userID, String password);

    bloodDonor findByUserId(String userId);

    
}
