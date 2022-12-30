package pe.finerio.app.authentication.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pe.finerio.app.authentication.domain.model.Authentication;
import pe.finerio.app.restclient.authentication.response.AuthenticationResponseDTO;

@Mapper
public interface AuthenticationMapper {
    AuthenticationMapper INSTANCE = Mappers.getMapper(AuthenticationMapper.class);

    default Authentication map (AuthenticationResponseDTO authenticationResponseDTO){
        return Authentication.builder()
                .access_token(authenticationResponseDTO.getAccess_token())
                .expires_in(authenticationResponseDTO.getExpires_in())
                .refresh_token(authenticationResponseDTO.getRefresh_token())
                .roles(authenticationResponseDTO.getRoles())
                .token_type(authenticationResponseDTO.getToken_type())
                .username(authenticationResponseDTO.getUsername())
                .build();
    }

}
