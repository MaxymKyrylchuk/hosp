package ua.com.reactive.reactive.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prescription {

    private Long id;

    private PrescriptionType type;

    private String description; // назва ліків, назва процедури тощо

    private Doctor createdBy;   // лікар, який створив призначення

    private LocalDateTime createdAt;

    private boolean completed;  // виконано чи ні

    private String completedBy; // хто виконав: лікар або медсестра
}
