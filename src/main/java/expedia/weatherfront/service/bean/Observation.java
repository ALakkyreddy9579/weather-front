package expedia.weatherfront.service.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Observation {
    public Location display_location;
    public String temp_f;
}
