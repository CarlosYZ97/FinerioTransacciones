package pe.finerio.app.connector.service.user;

import pe.finerio.app.restclient.user.response.UserResponseDTO;

public interface UserConnector {
    public UserResponseDTO getUser(String bearerToken);
}
