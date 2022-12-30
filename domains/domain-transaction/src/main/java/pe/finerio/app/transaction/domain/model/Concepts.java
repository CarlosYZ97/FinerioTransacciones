package pe.finerio.app.transaction.domain.model;

import lombok.Data;

@Data
public class Concepts {
    private String id;
    private Double amount;
    private String description;
    private String type;
    private String movement;
    private Category category;
}
