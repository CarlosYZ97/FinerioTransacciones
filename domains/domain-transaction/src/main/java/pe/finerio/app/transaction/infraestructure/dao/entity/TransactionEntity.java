package pe.finerio.app.transaction.infraestructure.dao.entity;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName = "transaction")
public class TransactionEntity {

    @DynamoDBHashKey
    private String transactionId;
    @DynamoDBAttribute
    private Double amount;
    @DynamoDBAttribute
    private Double balance;
    @DynamoDBAttribute
    private String customDate;
    @DynamoDBAttribute
    private String customDescription;
    @DynamoDBAttribute
    private String date;
    @DynamoDBAttribute
    private String dateCreated;
    @DynamoDBAttribute
    private Boolean deleted;
    @DynamoDBAttribute
    private String description;
    @DynamoDBAttribute
    private Boolean duplicated;
    @DynamoDBAttribute
    private Boolean hasConcepts;
    @DynamoDBAttribute
    private Boolean inResume;
    @DynamoDBAttribute
    private String lastUpdated;
    @DynamoDBAttribute
    private String type;
    @DynamoDBAttribute
    private Account account;
    @DynamoDBAttribute
    private List<Concepts> concepts;

    @Data
    @DynamoDBDocument
    public static class Account{
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

    @Data
    @DynamoDBDocument
    public static class User{
        private String id;
    }

    @Data
    @DynamoDBDocument
    public static class Institution{
        private Long id;
        private String code;
        private String institutionType;
        private String name;
        private String status;
    }

    @Data
    @DynamoDBDocument
    public static class Concepts{
        private String id;
        private Double amount;
        private String description;
        private String type;
        private String movement;
        private Category category;
    }

    @Data
    @DynamoDBDocument
    public static class Category{
        private String id;
        private String color;
        private String name;
        private String textColor;
        private Parent parent;
    }

    @Data
    @DynamoDBDocument
    public static class Parent{
        private String id;
    }
}
