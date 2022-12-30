package pe.finerio.app.connector.service.authentication;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pe.finerio.app.connector.service.apiconnect.ApiAuthenticationClient;
import pe.finerio.app.restclient.authentication.request.AuthenticationRequestDTO;
import pe.finerio.app.restclient.authentication.response.AuthenticationResponseDTO;

import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthenticationConnectorImpl implements AuthenticationConnector{

    private final ApiAuthenticationClient apiRestAuthenticationClient;

    @Override
    public AuthenticationResponseDTO login(AuthenticationRequestDTO authenticationRequestDTO) {
        return Objects.requireNonNull(apiRestAuthenticationClient.login(authenticationRequestDTO).getBody());
    }
}
