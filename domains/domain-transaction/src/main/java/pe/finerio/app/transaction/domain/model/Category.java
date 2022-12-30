package pe.finerio.app.transaction.domain.model;

import lombok.Data;

@Data
public class Category {
    private String id;
    private String color;
    private String name;
    private String textColor;
    private Parent parent;
}
