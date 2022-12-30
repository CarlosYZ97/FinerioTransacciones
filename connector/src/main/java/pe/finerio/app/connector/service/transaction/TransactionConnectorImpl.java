package pe.finerio.app.connector.service.transaction;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pe.finerio.app.connector.service.apiconnect.ApiTransactionClient;
import pe.finerio.app.restclient.transaction.response.TransactionRequestDTO;
import pe.finerio.app.restclient.transaction.response.TransactionResponseDTO;

import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class TransactionConnectorImpl implements TransactionConnector{

    private final ApiTransactionClient apiTransactionClient;

    @Override
    public TransactionResponseDTO getTransactions(TransactionRequestDTO transactionRequestDTO) {
        return Objects.requireNonNull(apiTransactionClient.getTransactions(transactionRequestDTO.getBearerToken(), transactionRequestDTO.getIdUser(), transactionRequestDTO.getPage(), transactionRequestDTO.getLimit()).getBody());
    }
}
