package pe.finerio.app.authentication.service.authentication;

import pe.finerio.app.authentication.dto.ConfirmationResponseDto;

public interface AuthenticationApplicationService {
    public ConfirmationResponseDto authentication(String email, String password);
}
