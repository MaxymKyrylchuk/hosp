package ua.com.reactive.reactive.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    private Long id;
    private String firstName;
    private String lastName;
    private int age;

    // первинний діагноз при надходженні
    private Diagnosis initialDiagnosis;

    // остаточний діагноз при виписці
    private Diagnosis finalDiagnosis;

    // список призначень, зроблених лікарем
    private List<Prescription> prescriptions;

    // пацієнт виписаний чи ні
    private boolean discharged;
}
