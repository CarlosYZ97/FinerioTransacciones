package pe.finerio.app.restclient.transaction.response;

import lombok.Data;

import java.util.List;

@Data
public class TransactionResponseDTO {

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


    @Data
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
    public static class User{
        private String id;
    }

    @Data
    public static class Institution{
        private Long id;
        private String code;
        private String institutionType;
        private String name;
        private String status;
    }

    @Data
    public static class Concepts{
        private String id;
        private Double amount;
        private String description;
        private String type;
        private String movement;
        private Category category;
    }

    @Data
    public static class Category{
        private String id;
        private String color;
        private String name;
        private String textColor;
        private Parent parent;
    }

    @Data
    public static class Parent{
        private String id;
    }
}
