package ro.hackaville.wsbff.model.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FlightInformations {

    private LocalDate date;

    private LocalTime flightHour;

    private LocalTime arriveHour;
}
