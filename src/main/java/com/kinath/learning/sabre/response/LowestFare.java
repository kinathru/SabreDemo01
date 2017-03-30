package com.kinath.learning.sabre.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL) @JsonPropertyOrder({"AirlineCodes", "Fare"}) public class LowestFare
{

    @JsonProperty("AirlineCodes") private List<String> airlineCodes = null;
    @JsonProperty("Fare") private Double fare;
    @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AirlineCodes") public List<String> getAirlineCodes()
    {
        return airlineCodes;
    }

    @JsonProperty("AirlineCodes") public void setAirlineCodes( List<String> airlineCodes )
    {
        this.airlineCodes = airlineCodes;
    }

    @JsonProperty("Fare") public Double getFare()
    {
        return fare;
    }

    @JsonProperty("Fare") public void setFare( Double fare )
    {
        this.fare = fare;
    }

    @JsonAnyGetter public Map<String, Object> getAdditionalProperties()
    {
        return this.additionalProperties;
    }

    @JsonAnySetter public void setAdditionalProperty( String name, Object value )
    {
        this.additionalProperties.put( name, value );
    }

}