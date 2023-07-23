package sk.pavlovsky.ecasenka.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.pavlovsky.ecasenka.modul.Role;


@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(service.register(request, Role.USER));
    }

    @PostMapping("/registeradmin")
    public ResponseEntity<AuthenticationResponse> registerAdmin(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(service.register(request, Role.ADMIN));
    }

    @PostMapping("/registerdoctor")
    public ResponseEntity<AuthenticationResponse> registerDoctor(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(service.register(request, Role.DOCTOR));
    }


    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }
}
