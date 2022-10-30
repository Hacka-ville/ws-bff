package ro.hackaville.wsbff.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import ro.hackaville.wsbff.model.dto.FlightDto;
import ro.hackaville.wsbff.service.FlightService;
import ro.hackaville.wsbff.model.dto.body.FlightsRequest;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FlightServiceImpl implements FlightService {

    @Override
    public FlightDto getFlightById(final String id) {
        WebClient client = WebClient.create();

        final var responseSpec = client.get()
                .uri("https://localhost:9091/api/flights/" + id)
                .retrieve()
                .bodyToMono(FlightDto.class);

        return responseSpec.block();
    }

    @Override
    public List<FlightDto> getFlightsByFilter(FlightsRequest request) {
        WebClient client = WebClient.create();

        final var responseSpec = client.post()
                .uri("http://localhost:9091/api/flights/")
                .bodyValue(request)
                .retrieve()
                .bodyToFlux(FlightDto.class);

        return responseSpec.toStream().toList();
    }


}
