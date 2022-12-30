package pe.finerio.app.authentication.domain.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Authentication {
    private String access_token;
    private Integer expires_in;
    private String refresh_token;
    private List<String> roles;
    private String token_type;
    private String username;
}
