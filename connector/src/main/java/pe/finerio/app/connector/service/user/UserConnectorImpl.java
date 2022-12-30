package pe.finerio.app.connector.service.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pe.finerio.app.connector.service.apiconnect.ApiUserClient;
import pe.finerio.app.restclient.user.response.UserResponseDTO;

import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserConnectorImpl implements UserConnector{

    private final ApiUserClient apiUserClient;

    @Override
    public UserResponseDTO getUser(String bearerToken) {
        return Objects.requireNonNull(apiUserClient.getUser(bearerToken).getBody());
    }
}
