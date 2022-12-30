package pe.finerio.app.transaction.domain.model;

import lombok.Data;

import java.util.List;

@Data
public class TransactionInfo {
    private List<Transaction> data;
    private Integer size;

    @Data
    public static class Transaction{
        private String id;
        private Double amount;
        private Double balance;
        private String customDate;
        private String customDescription;
        private String date;
        private String dateCreated;
        private Boolean deleted;
        private String description;
        private Boolean duplicated;
        private Boolean hasConcepts;
        private Boolean inResume;
        private String lastUpdated;
        private String type;
        private Account account;
        private List<Concepts> concepts;
    }
}
