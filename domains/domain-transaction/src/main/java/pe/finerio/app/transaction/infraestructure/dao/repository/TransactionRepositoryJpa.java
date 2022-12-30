package pe.finerio.app.transaction.infraestructure.dao.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.finerio.app.transaction.infraestructure.dao.entity.TransactionEntity;

@EnableScan
@Repository
public interface TransactionRepositoryJpa extends CrudRepository<TransactionEntity, String> {
    TransactionEntity getTransactionBytransactionId(String transactionId);
}
