package ro.hackaville.wsbff.model.dto;

import lombok.*;
import ro.hackaville.wsbff.model.dao.FlightInformations;
import ro.hackaville.wsbff.model.dao.FlightsOperator;
import ro.hackaville.wsbff.model.dao.Location;

import java.math.BigDecimal;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FlightDto {

    private String id;

    private Integer number;

    private FlightsOperator operator;

    private FlightInformations flightInformations;

    private BigDecimal price;

    private Location location;

    private LocalTime delay;
}
