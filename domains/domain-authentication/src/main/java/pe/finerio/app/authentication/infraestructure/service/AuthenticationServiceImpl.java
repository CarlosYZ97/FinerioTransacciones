package pe.finerio.app.authentication.infraestructure.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pe.finerio.app.authentication.domain.mapper.AuthenticationMapper;
import pe.finerio.app.authentication.domain.model.Authentication;
import pe.finerio.app.authentication.domain.model.Credential;
import pe.finerio.app.authentication.domain.service.AuthenticationService;
import pe.finerio.app.connector.service.authentication.AuthenticationConnector;
import pe.finerio.app.restclient.authentication.request.AuthenticationRequestDTO;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final AuthenticationConnector authenticationConnector;

    @Override
    public Authentication login(Credential credential) {
        AuthenticationRequestDTO authenticationRequestDTO = AuthenticationRequestDTO.builder()
                .username(credential.getUsername())
                .password(credential.getPassword())
                .build();
        return AuthenticationMapper.INSTANCE.map(authenticationConnector.login(authenticationRequestDTO));
    }
}
