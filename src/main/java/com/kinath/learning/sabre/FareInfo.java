package com.kinath.learning.sabre;

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
-----------------------------------com.kinath.learning.sabre.FlightToResponse.java-----------------------------------

        package com.kinath.learning.sabre;

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
    @JsonProperty("Links") private List<Link_> links = null;
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

    @JsonProperty("Links") public List<Link_> getLinks()
    {
        return links;
    }

    @JsonProperty("Links") public void setLinks( List<Link_> links )
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
-----------------------------------com.kinath.learning.sabre.Link.java-----------------------------------

        package com.kinath.learning.sabre;

        import java.util.HashMap;
        import java.util.Map;
        import com.fasterxml.jackson.annotation.JsonAnyGetter;
        import com.fasterxml.jackson.annotation.JsonAnySetter;
        import com.fasterxml.jackson.annotation.JsonIgnore;
        import com.fasterxml.jackson.annotation.JsonInclude;
        import com.fasterxml.jackson.annotation.JsonProperty;
        import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL) @JsonPropertyOrder({"rel", "href"}) public class Link
{

    @JsonProperty("rel") private String rel;
    @JsonProperty("href") private String href;
    @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rel") public String getRel()
    {
        return rel;
    }

    @JsonProperty("rel") public void setRel( String rel )
    {
        this.rel = rel;
    }

    @JsonProperty("href") public String getHref()
    {
        return href;
    }

    @JsonProperty("href") public void setHref( String href )
    {
        this.href = href;
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
-----------------------------------com.kinath.learning.sabre.Link_.java-----------------------------------

        package com.kinath.learning.sabre;

        import java.util.HashMap;
        import java.util.Map;
        import com.fasterxml.jackson.annotation.JsonAnyGetter;
        import com.fasterxml.jackson.annotation.JsonAnySetter;
        import com.fasterxml.jackson.annotation.JsonIgnore;
        import com.fasterxml.jackson.annotation.JsonInclude;
        import com.fasterxml.jackson.annotation.JsonProperty;
        import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL) @JsonPropertyOrder({"rel", "href"}) public class Link_
{

    @JsonProperty("rel") private String rel;
    @JsonProperty("href") private String href;
    @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rel") public String getRel()
    {
        return rel;
    }

    @JsonProperty("rel") public void setRel( String rel )
    {
        this.rel = rel;
    }

    @JsonProperty("href") public String getHref()
    {
        return href;
    }

    @JsonProperty("href") public void setHref( String href )
    {
        this.href = href;
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
-----------------------------------com.kinath.learning.sabre.LowestFare.java-----------------------------------

        package com.kinath.learning.sabre;

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