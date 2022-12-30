package pe.finerio.app.restclient.authentication.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationRequestDTO {
    private String username;
    private String password;
}
