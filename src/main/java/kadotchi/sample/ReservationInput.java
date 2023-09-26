package kadotchi.sample;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Setter;

@Setter
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

}
