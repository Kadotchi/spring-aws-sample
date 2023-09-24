package kadotchi.sample;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class ReservationInput {
    private String trainingId;

    @NotBlank
    private String name;

    @NotBlank
    @Pattern(regexp = "0¥¥d{1,4}-¥¥d{1,4}-¥¥d{4}")
    private String phone;

    @NotBlank
    @Email
    private String emailAddress;

    @NotBlank
    private String studentTypeCode;

    public String getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(String trainingId) {
        this.trainingId = trainingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getStudentTypeCode() {
        return studentTypeCode;
    }

    public void setStudentTypeCode(String studentTypeCode) {
        this.studentTypeCode = studentTypeCode;
    }


}
