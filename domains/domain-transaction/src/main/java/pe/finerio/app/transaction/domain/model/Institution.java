package pe.finerio.app.transaction.domain.model;

import lombok.Data;

@Data
public class Institution {
    private Long id;
    private String code;
    private String institutionType;
    private String name;
    private String status;
}
