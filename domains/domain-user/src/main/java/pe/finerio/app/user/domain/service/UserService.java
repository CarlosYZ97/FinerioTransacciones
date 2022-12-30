package pe.finerio.app.user.domain.service;

import pe.finerio.app.user.domain.model.UserInfo;

public interface UserService {

    public UserInfo getUser(String beareToken);
}
