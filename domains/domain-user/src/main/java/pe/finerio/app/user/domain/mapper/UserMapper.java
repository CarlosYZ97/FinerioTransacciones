package pe.finerio.app.user.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pe.finerio.app.restclient.user.response.UserResponseDTO;
import pe.finerio.app.user.domain.model.UserInfo;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    default  UserInfo map (UserResponseDTO userResponseDTO){
        return UserInfo.builder()
                .id(userResponseDTO.getId())
                .accountExpired(userResponseDTO.getAccountExpired())
                .accountLocked(userResponseDTO.getAccountLocked())
                .customerId(userResponseDTO.getCustomerId())
                .dateCreated(userResponseDTO.getDateCreated())
                .email(userResponseDTO.getEmail())
                .enabled(userResponseDTO.getEnabled())
                .finerioCode(userResponseDTO.getFinerioCode())
                .hasNewTerms(userResponseDTO.getHasNewTerms())
                .lastUpdated(userResponseDTO.getLastUpdated())
                .name(userResponseDTO.getName())
                .notificationsEnabled(userResponseDTO.getNotificationsEnabled())
                .passwordExpired(userResponseDTO.getPasswordExpired())
                .signupCredentialEmailSent(userResponseDTO.getSignupCredentialEmailSent())
                .signupCredentialPushSent(userResponseDTO.getSignupCredentialPushSent())
                .signupEmailSent(userResponseDTO.getSignupEmailSent())
                .signupFrom(userResponseDTO.getSignupFrom())
                .termsAndConditionsAccepted(userResponseDTO.getTermsAndConditionsAccepted())
                .type(userResponseDTO.getType())
                .build();
    }
}
