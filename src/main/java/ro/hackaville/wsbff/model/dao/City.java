package ro.hackaville.wsbff.model.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class City {

    private String name;

    private String iataCountryCode;

    private String iataCode;
}
