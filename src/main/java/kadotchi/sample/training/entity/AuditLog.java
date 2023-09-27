package kadotchi.sample.training.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
@Getter
@Setter
@SuppressWarnings("serial")
public class AuditLog implements Serializable {
    private String id;
    private String functionName;
    private LocalDateTime eventDateTime;
    private String userId;

}

