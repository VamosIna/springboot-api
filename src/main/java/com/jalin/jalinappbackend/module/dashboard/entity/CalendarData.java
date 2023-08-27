package com.jalin.jalinappbackend.module.dashboard.entity;

    import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "calendar_data")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CalendarData {
    @Id
    @GeneratedValue
    private UUID id;
    private LocalDate date;
    private Integer totalCheckIn;
    private Integer totalMissionCompleted;
}
