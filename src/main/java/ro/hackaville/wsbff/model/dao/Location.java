package ro.hackaville.wsbff.model.dao;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Location {

    @Builder.Default
    private String flightLocation = "";

    @Builder.Default
    private String arriveLocation = "";
}
