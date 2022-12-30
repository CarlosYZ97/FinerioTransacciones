package pe.finerio.app.transaction.infraestructure.repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import pe.finerio.app.transaction.domain.model.Transaction;
import pe.finerio.app.transaction.domain.repository.TransactionRepository;
import pe.finerio.app.transaction.infraestructure.dao.mapper.TransactionMapper;
import pe.finerio.app.transaction.infraestructure.dao.repository.TransactionRepositoryJpa;

@Slf4j
@Repository
@RequiredArgsConstructor
public class TransactionRepositoryImpl implements TransactionRepository {

    private final TransactionRepositoryJpa transactionRepositoryJpa;

    @Override
    public void createOrUpdateTransaction(Transaction transaction) {
        transactionRepositoryJpa.save(TransactionMapper.INSTANCE.mapEntity(transaction));
    }
}
