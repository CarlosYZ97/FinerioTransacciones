package pe.finerio.app.transaction.infraestructure.dao.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pe.finerio.app.restclient.transaction.response.TransactionResponseDTO;
import pe.finerio.app.transaction.domain.model.*;
import pe.finerio.app.transaction.infraestructure.dao.entity.TransactionEntity;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface TransactionMapper {

    TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);

    default TransactionInfo map(TransactionResponseDTO transactionResponse){
        TransactionInfo transactionInfo = new TransactionInfo();
        transactionInfo.setSize(transactionResponse.getSize());
        transactionInfo.setData(
                transactionResponse.getData().stream().map(TransactionMapper.INSTANCE::map).collect(Collectors.toList())
        );
       return transactionInfo;
    }

    default TransactionInfo.Transaction map(TransactionResponseDTO.Transaction transactionDTO){
        TransactionInfo.Transaction transaction  = new TransactionInfo.Transaction();
        transaction.setId(transactionDTO.getId());
        transaction.setAccount(TransactionMapper.INSTANCE.map(transactionDTO.getAccount()));
        transaction.setBalance(transactionDTO.getBalance());
        transaction.setAmount(transactionDTO.getAmount());
        transaction.setCustomDate(transactionDTO.getCustomDate());
        transaction.setCustomDescription(transactionDTO.getCustomDescription());
        transaction.setDate(transactionDTO.getDate());
        transaction.setDeleted(transactionDTO.getDeleted());
        transaction.setDescription(transactionDTO.getDescription());
        transaction.setDuplicated(transactionDTO.getDuplicated());
        transaction.setHasConcepts(transactionDTO.getHasConcepts());
        transaction.setInResume(transactionDTO.getInResume());
        transaction.setLastUpdated(transactionDTO.getLastUpdated());
        transaction.setType(transactionDTO.getType());
        transaction.setConcepts(
                transactionDTO.getConcepts().stream().map(TransactionMapper.INSTANCE::map).collect(Collectors.toList()));
        return transaction;
    }

    default Account map(TransactionResponseDTO.Account account){
        Account accountInfo = new Account();
        accountInfo.setBalance(account.getBalance());
        accountInfo.setDateCreated(account.getDateCreated());
        accountInfo.setAvailableBalance(account.getAvailableBalance());
        accountInfo.setDeleted(account.getDeleted());
        accountInfo.setLastUpdated(account.getLastUpdated());
        accountInfo.setName(account.getName());
        accountInfo.setNumber(account.getNumber());
        accountInfo.setType(account.getType());
        accountInfo.setUser(TransactionMapper.INSTANCE.map(account.getUser()));
        accountInfo.setInstitution(TransactionMapper.INSTANCE.map(account.getInstitution()));
        return accountInfo;
    }

    default User map(TransactionResponseDTO.User user){
        User userInfo = new User();
        userInfo.setId(user.getId());
        return userInfo;
    }

    default Institution map (TransactionResponseDTO.Institution institution){
        Institution institutionInfo = new Institution();
        institutionInfo.setId(institution.getId());
        institutionInfo.setName(institution.getName());
        institutionInfo.setInstitutionType(institution.getInstitutionType());
        institutionInfo.setCode(institution.getCode());
        institutionInfo.setStatus(institution.getStatus());
        return institutionInfo;
    }

    default Concepts map (TransactionResponseDTO.Concepts concepts){
        Concepts conceptsInfo = new Concepts();
        conceptsInfo.setAmount(concepts.getAmount());
        conceptsInfo.setDescription(concepts.getDescription());
        conceptsInfo.setId(concepts.getId());
        conceptsInfo.setDescription(concepts.getDescription());
        conceptsInfo.setMovement(concepts.getMovement());
        conceptsInfo.setCategory(TransactionMapper.INSTANCE.map(concepts.getCategory()));
        return conceptsInfo;
    }

    default Category map(TransactionResponseDTO.Category category){
        Category categoryInfo = new Category();
        categoryInfo.setId(category.getId());
        categoryInfo.setName(category.getName());
        categoryInfo.setColor(category.getColor());
        categoryInfo.setParent(TransactionMapper.INSTANCE.map(category.getParent()));
        return categoryInfo;
    }

    default Parent map (TransactionResponseDTO.Parent parent){
        Parent parentInfo = new Parent();
        parentInfo.setId(parent.getId());
        return parentInfo;
    }

    default Transaction map(TransactionInfo.Transaction transactionInfo){
        Transaction transaction = new Transaction();
        transaction.setId(transactionInfo.getId());
        transaction.setAccount(transactionInfo.getAccount());
        transaction.setBalance(transactionInfo.getBalance());
        transaction.setAmount(transactionInfo.getAmount());
        transaction.setCustomDate(transactionInfo.getCustomDate());
        transaction.setCustomDescription(transactionInfo.getCustomDescription());
        transaction.setDate(transactionInfo.getDate());
        transaction.setDeleted(transactionInfo.getDeleted());
        transaction.setDescription(transactionInfo.getDescription());
        transaction.setDuplicated(transactionInfo.getDuplicated());
        transaction.setHasConcepts(transactionInfo.getHasConcepts());
        transaction.setInResume(transactionInfo.getInResume());
        transaction.setLastUpdated(transactionInfo.getLastUpdated());
        transaction.setType(transactionInfo.getType());
        transaction.setConcepts(transactionInfo.getConcepts());

        return transaction;
    }

    default TransactionEntity mapEntity(Transaction transaction){
        TransactionEntity transactionEntity = new TransactionEntity();
        transactionEntity.setTransactionId(transaction.getId());
        transactionEntity.setAccount(TransactionMapper.INSTANCE.map(transaction.getAccount()));
        transactionEntity.setBalance(transaction.getBalance());
        transactionEntity.setAmount(transaction.getAmount());
        transactionEntity.setCustomDate(transaction.getCustomDate());
        transactionEntity.setCustomDescription(transaction.getCustomDescription());
        transactionEntity.setDate(transaction.getDate());
        transactionEntity.setDeleted(transaction.getDeleted());
        transactionEntity.setDescription(transaction.getDescription());
        transactionEntity.setDuplicated(transaction.getDuplicated());
        transactionEntity.setHasConcepts(transaction.getHasConcepts());
        transactionEntity.setInResume(transaction.getInResume());
        transactionEntity.setLastUpdated(transaction.getLastUpdated());
        transactionEntity.setType(transaction.getType());
        transactionEntity.setConcepts(
                transaction.getConcepts().stream().map(TransactionMapper.INSTANCE::map).collect(Collectors.toList()));
        return transactionEntity;
    }

    default TransactionEntity.Concepts map (Concepts concepts){
        TransactionEntity.Concepts conceptsEntity = new TransactionEntity.Concepts();
        conceptsEntity.setAmount(concepts.getAmount());
        conceptsEntity.setDescription(concepts.getDescription());
        conceptsEntity.setId(concepts.getId());
        conceptsEntity.setDescription(concepts.getDescription());
        conceptsEntity.setMovement(concepts.getMovement());
        conceptsEntity.setCategory(TransactionMapper.INSTANCE.map(concepts.getCategory()));
        return conceptsEntity;
    }

    default TransactionEntity.Category map(Category category){
        TransactionEntity.Category categoryEntity = new TransactionEntity.Category();
        categoryEntity.setId(category.getId());
        categoryEntity.setName(category.getName());
        categoryEntity.setColor(category.getColor());
        categoryEntity.setParent(TransactionMapper.INSTANCE.map(category.getParent()));
        return categoryEntity;
    }

    default TransactionEntity.Parent map (Parent parent){
        TransactionEntity.Parent parentEntity = new TransactionEntity.Parent();
        parentEntity.setId(parent.getId());
        return parentEntity;
    }

    default TransactionEntity.Account map(Account account){
        TransactionEntity.Account accountEntity = new TransactionEntity.Account();
        accountEntity.setBalance(account.getBalance());
        accountEntity.setDateCreated(account.getDateCreated());
        accountEntity.setAvailableBalance(account.getAvailableBalance());
        accountEntity.setDeleted(account.getDeleted());
        accountEntity.setLastUpdated(account.getLastUpdated());
        accountEntity.setName(account.getName());
        accountEntity.setNumber(account.getNumber());
        accountEntity.setType(account.getType());
        accountEntity.setUser(TransactionMapper.INSTANCE.map(account.getUser()));
        accountEntity.setInstitution(TransactionMapper.INSTANCE.map(account.getInstitution()));
        return accountEntity;
    }

    default TransactionEntity.User map(User user){
        TransactionEntity.User userEntity = new TransactionEntity.User();
        userEntity.setId(user.getId());
        return userEntity;
    }

    default TransactionEntity.Institution map (Institution institution){
        TransactionEntity.Institution institutionEntity = new TransactionEntity.Institution();
        institutionEntity.setId(institution.getId());
        institutionEntity.setName(institution.getName());
        institutionEntity.setInstitutionType(institution.getInstitutionType());
        institutionEntity.setCode(institution.getCode());
        institutionEntity.setStatus(institution.getStatus());
        return institutionEntity;
    }
}
