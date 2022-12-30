package pe.finerio.app.transaction.domain.service;

import pe.finerio.app.restclient.transaction.response.TransactionRequestDTO;
import pe.finerio.app.transaction.domain.model.TransactionInfo;

public interface TransactionService {
    void saveTransactions(String bearerToken, String idUser );
}
