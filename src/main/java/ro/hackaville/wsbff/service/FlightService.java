package ro.hackaville.wsbff.service;

import ro.hackaville.wsbff.model.dto.FlightDto;
import ro.hackaville.wsbff.model.dto.body.FlightsRequest;

import java.util.List;

public interface FlightService {

    FlightDto getFlightById(final String id);

    List<FlightDto> getFlightsByFilter(final FlightsRequest request);
}
