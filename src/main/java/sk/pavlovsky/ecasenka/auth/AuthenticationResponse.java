package sk.pavlovsky.ecasenka.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sk.pavlovsky.ecasenka.modul.Role;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {

    Integer id;
    String name;
    Role role;
    String token;

}
