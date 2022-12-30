package pe.finerio.app.user.domain.service;

import pe.finerio.app.user.domain.model.UserInfo;

public interface UserService {

    UserInfo getUser(String beareToken);
}
