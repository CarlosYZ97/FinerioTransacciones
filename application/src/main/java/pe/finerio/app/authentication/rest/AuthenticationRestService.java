package pe.finerio.app.authentication.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.finerio.app.authentication.dto.ConfirmationResponseDto;
import pe.finerio.app.authentication.service.authentication.AuthenticationApplicationService;

@RestController
@RequestMapping("api/external/authentication")
@RequiredArgsConstructor
public class AuthenticationRestService {

    private final AuthenticationApplicationService authenticationApplicationService;

    @GetMapping("/runTest")
    public ConfirmationResponseDto runTest(@RequestParam("email") String email, @RequestParam( "password") String password){
        return authenticationApplicationService.authentication(email, password);
    }
}
