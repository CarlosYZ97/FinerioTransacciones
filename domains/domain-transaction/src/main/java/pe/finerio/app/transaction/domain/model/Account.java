package pe.finerio.app.transaction.domain.model;

import lombok.Data;

@Data
public class Account {
    private String id;
    private Double availableBalance;
    private Double balance;
    private String dateCreated;
    private Boolean deleted;
    private String lastUpdated;
    private String name;
    private String number;
    private String type;
    private User user;
    private Institution institution;
}
