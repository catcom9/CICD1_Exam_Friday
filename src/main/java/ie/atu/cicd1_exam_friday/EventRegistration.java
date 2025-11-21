package ie.atu.cicd1_exam_friday;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EventRegistration {
    @NotBlank
    private String attendeeName;
    @Email
    private String email;
    @Pattern(regexp="TK-[0-9]{4}")
    private String ticketCode;
    @Positive
    private int quantity;
}
