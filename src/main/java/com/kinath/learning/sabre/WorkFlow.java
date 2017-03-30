package com.kinath.learning.sabre;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kinath.learning.config.ResourceConfig;
import com.kinath.learning.sabre.response.AuthResponse;
import com.kinath.learning.util.HttpRequestUtils;
import com.kinath.learning.util.RequestType;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kinath on 30/03/2017.
 */
public class WorkFlow
{
    public static AuthResponse authenticate( String authTokenReqString, HttpClient client, ObjectMapper objectMapper )
    {
        HttpResponse httpResponse = null;
        AuthResponse authResponse = null;
        Map<String, String> headers = new HashMap<String, String>();
        headers.put( "Authorization", "Basic " + authTokenReqString );
        headers.put( "Content-Type", "application/x-www-form-urlencoded" );
        headers.put( "Accept", "*/*" );

        Map<String, String> urlParams = new HashMap<String, String>();
        urlParams.put( "grant_type", "client_credentials" );

        HttpRequestBase clientRequest = HttpRequestUtils.generateRequest( ResourceConfig.AUTH_TOKEN_URL, headers, null, urlParams, RequestType.POST );
        try
        {
            httpResponse = client.execute( clientRequest );
            if( httpResponse != null )
            {
                String jsonString = EntityUtils.toString( httpResponse.getEntity() );
                authResponse = objectMapper.readValue( jsonString, AuthResponse.class );
            }
        }
        catch( IOException e )
        {
            e.printStackTrace();
        }

        return authResponse;
    }
}
