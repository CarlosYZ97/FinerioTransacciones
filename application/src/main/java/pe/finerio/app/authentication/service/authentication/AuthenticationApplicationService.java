package pe.finerio.app.authentication.service.authentication;

import pe.finerio.app.authentication.dto.ConfirmationResponseDto;

public interface AuthenticationApplicationService {
    ConfirmationResponseDto authentication(String email, String password);
}
