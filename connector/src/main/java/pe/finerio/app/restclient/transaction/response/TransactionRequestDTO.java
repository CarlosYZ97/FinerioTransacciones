package pe.finerio.app.restclient.transaction.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TransactionRequestDTO {
    private String bearerToken;
    private String idUser;
    private Integer page;
    private Integer limit;
}
