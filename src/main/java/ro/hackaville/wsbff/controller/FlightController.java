package ro.hackaville.wsbff.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.hackaville.wsbff.model.dto.FlightDto;
import ro.hackaville.wsbff.model.dto.body.FlightsRequest;
import ro.hackaville.wsbff.service.FlightService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/bff/flights")
@RestController
public class FlightController {

    private final FlightService flightService;

    @GetMapping("/{id}")
    public FlightDto getFlightById(@PathVariable final String id) {
        return flightService.getFlightById(id);
    }

    @PostMapping
    public List<FlightDto> getFlightsByFilters(@RequestBody final FlightsRequest request) {
        return flightService.getFlightsByFilter(request);
    }
}
