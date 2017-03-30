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

@JsonInclude(JsonInclude.Include.NON_NULL) @JsonPropertyOrder({"CurrencyCode", "LowestFare", "OriginLocation", "DepartureDateTime", "ReturnDateTime", "Links"}) public class FareInfo
{

    @JsonProperty("CurrencyCode") private String currencyCode;
    @JsonProperty("LowestFare") private LowestFare lowestFare;
    @JsonProperty("OriginLocation") private String originLocation;
    @JsonProperty("DepartureDateTime") private String departureDateTime;
    @JsonProperty("ReturnDateTime") private String returnDateTime;
    @JsonProperty("Links") private List<Link> links = null;
    @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CurrencyCode") public String getCurrencyCode()
    {
        return currencyCode;
    }

    @JsonProperty("CurrencyCode") public void setCurrencyCode( String currencyCode )
    {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("LowestFare") public LowestFare getLowestFare()
    {
        return lowestFare;
    }

    @JsonProperty("LowestFare") public void setLowestFare( LowestFare lowestFare )
    {
        this.lowestFare = lowestFare;
    }

    @JsonProperty("OriginLocation") public String getOriginLocation()
    {
        return originLocation;
    }

    @JsonProperty("OriginLocation") public void setOriginLocation( String originLocation )
    {
        this.originLocation = originLocation;
    }

    @JsonProperty("DepartureDateTime") public String getDepartureDateTime()
    {
        return departureDateTime;
    }

    @JsonProperty("DepartureDateTime") public void setDepartureDateTime( String departureDateTime )
    {
        this.departureDateTime = departureDateTime;
    }

    @JsonProperty("ReturnDateTime") public String getReturnDateTime()
    {
        return returnDateTime;
    }

    @JsonProperty("ReturnDateTime") public void setReturnDateTime( String returnDateTime )
    {
        this.returnDateTime = returnDateTime;
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