package pe.finerio.app.connector.service.authentication;

import pe.finerio.app.restclient.authentication.request.AuthenticationRequestDTO;
import pe.finerio.app.restclient.authentication.response.AuthenticationResponseDTO;

public interface AuthenticationConnector {

    public AuthenticationResponseDTO login(AuthenticationRequestDTO authenticationRequestDTO);
}
