package pe.finerio.app.restclient.authentication.response;

import lombok.Data;

import java.util.List;

@Data
public class AuthenticationResponseDTO {
    private String access_token;
    private Integer expires_in;
    private String refresh_token;
    private List<String> roles;
    private String token_type;
    private String username;
}
