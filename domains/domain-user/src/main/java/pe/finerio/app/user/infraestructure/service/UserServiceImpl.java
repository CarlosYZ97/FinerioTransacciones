package pe.finerio.app.user.infraestructure.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pe.finerio.app.connector.service.user.UserConnector;
import pe.finerio.app.restclient.transaction.response.TransactionResponseDTO;
import pe.finerio.app.restclient.user.response.UserResponseDTO;
import pe.finerio.app.user.domain.mapper.UserMapper;
import pe.finerio.app.user.domain.model.UserInfo;
import pe.finerio.app.user.domain.service.UserService;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserConnector userConnector;

    @Override
    public UserInfo getUser(String beareToken) {
        UserResponseDTO user = userConnector.getUser(beareToken);
        return UserMapper.INSTANCE.map(user);
    }
}
