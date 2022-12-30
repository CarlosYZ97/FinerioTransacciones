package pe.finerio.app.restclient.user.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserResponseDTO {
    private String id;
    private Boolean accountExpired;
    private Boolean accountLocked;
    private Long customerId;
    private String dateCreated;
    private String email;
    private Boolean enabled;
    private String lastUpdated;
    private String name;
    private Boolean notificationsEnabled;
    private Boolean passwordExpired;
    private Boolean signupCredentialEmailSent;
    private Boolean signupCredentialPushSent;
    private Boolean signupEmailSent;
    private String signupFrom;
    private Boolean termsAndConditionsAccepted;
    private String type;
    private String finerioCode;
    private Boolean hasNewTerms;
}
