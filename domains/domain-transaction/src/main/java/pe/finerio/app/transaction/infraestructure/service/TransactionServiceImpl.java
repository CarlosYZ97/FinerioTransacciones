package pe.finerio.app.transaction.infraestructure.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pe.finerio.app.connector.service.transaction.TransactionConnector;
import pe.finerio.app.restclient.transaction.response.TransactionRequestDTO;
import pe.finerio.app.transaction.domain.repository.TransactionRepository;
import pe.finerio.app.transaction.infraestructure.dao.mapper.TransactionMapper;
import pe.finerio.app.transaction.domain.model.TransactionInfo;
import pe.finerio.app.transaction.domain.service.TransactionService;

@Slf4j
@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionConnector transactionConnector;
    private final TransactionRepository transactionRepository;
    private TransactionInfo getTransactions(String bearerToken, String idUser, int page, int limit) {
        TransactionRequestDTO transactionRequestDTO = TransactionRequestDTO.builder()
                .bearerToken(bearerToken)
                .idUser(idUser)
                .page(page)
                .limit(limit)
                .build();
        return TransactionMapper.INSTANCE.map(transactionConnector.getTransactions(transactionRequestDTO));
    }

    @Override
    public void saveTransactions(String bearerToken, String idUser) {
        TransactionInfo transactionInfo = null;
        int limit = 10;
        int page = 0;

        do{
            transactionInfo = this.getTransactions(bearerToken, idUser, page, limit);
            if(transactionInfo.getSize() > 0){
                transactionInfo.getData().stream().forEach( transaction ->
                    transactionRepository.createOrUpdateTransaction(TransactionMapper.INSTANCE.map(transaction))
                );
            }
            page++;
        }while (transactionInfo.getSize() > 0);

    }
}
