package ua.com.reactive.reactive.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Diagnosis {

    private String code;    // наприклад: J45
    private String name;    // "Бронхіальна астма"
    private String details; // опис, за бажанням
}
