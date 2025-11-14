package ua.com.reactive.reactive.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nurse {

    private Long id;
    private String firstName;
    private String lastName;
}
