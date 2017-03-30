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

@JsonInclude(JsonInclude.Include.NON_NULL) @JsonPropertyOrder({"DestinationLocation", "FareInfo", "Links"}) public class FlightToResponse
{

    @JsonProperty("DestinationLocation") private String destinationLocation;
    @JsonProperty("FareInfo") private List<FareInfo> fareInfo = null;
    @JsonProperty("Links") private List<Link> links = null;
    @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("DestinationLocation") public String getDestinationLocation()
    {
        return destinationLocation;
    }

    @JsonProperty("DestinationLocation") public void setDestinationLocation( String destinationLocation )
    {
        this.destinationLocation = destinationLocation;
    }

    @JsonProperty("FareInfo") public List<FareInfo> getFareInfo()
    {
        return fareInfo;
    }

    @JsonProperty("FareInfo") public void setFareInfo( List<FareInfo> fareInfo )
    {
        this.fareInfo = fareInfo;
    }

    @JsonProperty("Links") public List<Link> getLinks()
    {
        return links;
    }

    @JsonProperty("Links") public void setLinks( List<Link> links )
    {
        this.links = links;
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