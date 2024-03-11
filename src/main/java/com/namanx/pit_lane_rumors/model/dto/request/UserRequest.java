package com.namanx.pit_lane_rumors.model.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;

import static com.namanx.pit_lane_rumors.model.constant.Messages.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Validated
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequest {

    @NotBlank(message = BLANK_USERNAME)
    @Pattern(
            regexp = "/^[a-zA-Z0-9]+([a-zA-Z0-9](_|-| )[a-zA-Z0-9])*[a-zA-Z0-9]*$/",
            message = USERNAME_REGEX
    )
    String username;

    @NotBlank(message = BLANK_PASSWORD)
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = PASSWORD_REGEX
    )
    String password;

}
