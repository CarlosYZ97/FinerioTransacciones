package pe.finerio.app.transaction.domain.repository;

import pe.finerio.app.transaction.domain.model.Transaction;

public interface TransactionRepository {
    void createOrUpdateTransaction(Transaction transaction);
}
