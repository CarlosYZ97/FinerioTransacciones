package pe.finerio.app.connector.service.transaction;

import pe.finerio.app.restclient.transaction.response.TransactionRequestDTO;
import pe.finerio.app.restclient.transaction.response.TransactionResponseDTO;

public interface TransactionConnector {
    public TransactionResponseDTO getTransactions(TransactionRequestDTO transactionRequestDTO);
}
