package pe.finerio.app.authentication.domain.service;

import pe.finerio.app.authentication.domain.model.Authentication;
import pe.finerio.app.authentication.domain.model.Credential;

public interface AuthenticationService {
     Authentication login(Credential  credential);
}
