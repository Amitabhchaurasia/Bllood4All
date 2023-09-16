package bloodDataInput;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class bloodDonor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String bloodGroup;
    private String mobileNumber;
    private String state;
    private String city;
    private String availabilityStatus;

    private String userId;
    private String password;

    public bloodDonor() {

    }

    public bloodDonor(String fullName, String bloodGroup, String mobileNumber, String state, String district,
            String city, String availabilityStatus, String userId, String password) {

        this.fullName = fullName;
        this.bloodGroup = bloodGroup;
        this.mobileNumber = mobileNumber;
        this.state = state;
      
        this.city = city;
        this.availabilityStatus = availabilityStatus;
        this.userId = userId;
        this.password = password;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBloodGroup() {
        return this.bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAvailabilityStatus() {
        return this.availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
