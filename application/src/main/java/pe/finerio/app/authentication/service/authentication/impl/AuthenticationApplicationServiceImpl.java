package pe.finerio.app.authentication.service.authentication.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pe.finerio.app.authentication.domain.model.Authentication;
import pe.finerio.app.authentication.domain.model.Credential;
import pe.finerio.app.authentication.domain.service.AuthenticationService;
import pe.finerio.app.authentication.dto.ConfirmationResponseDto;
import pe.finerio.app.authentication.service.authentication.AuthenticationApplicationService;
import pe.finerio.app.transaction.domain.service.TransactionService;
import pe.finerio.app.user.domain.model.UserInfo;
import pe.finerio.app.user.domain.service.UserService;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthenticationApplicationServiceImpl implements AuthenticationApplicationService {

    private final AuthenticationService authenticationService;
    private final UserService userService;
    private final TransactionService transactionService;
    @Override
    public ConfirmationResponseDto authentication(String email, String password) {
        Credential credential  = new Credential();
        credential.setUsername(email);
        credential.setPassword(password);

        Authentication authentication  = authenticationService.login(credential);
        String beareToken = authentication.getToken_type().concat(" ").concat(authentication.getAccess_token());
        UserInfo userInfo  = userService.getUser(beareToken);

        transactionService.saveTransactions(beareToken, userInfo.getId());
        return ConfirmationResponseDto.ok();
    }
}
