package com.kinath.learning;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kinath.learning.config.UserConfig;
import com.kinath.learning.sabre.response.AuthResponse;
import com.kinath.learning.sabre.WorkFlow;
import com.kinath.learning.sabre.response.FlightToResponse;
import com.kinath.learning.util.CodecUtils;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * Created by kinath on 30/03/2017.
 */
public class MainApp
{
    public static void main( String[] args )
    {
        String clientIDclientSecretString = CodecUtils.encodeBase64( UserConfig.CLIENT_ID ) + ":" + CodecUtils.encodeBase64( UserConfig.CLIENT_PWD );
        System.out.println( clientIDclientSecretString );

        String authTokenReqString = CodecUtils.encodeBase64( clientIDclientSecretString );
        System.out.println( authTokenReqString );

        HttpClient client = HttpClientBuilder.create().build();
        ObjectMapper objectMapper = new ObjectMapper();
        AuthResponse authResponse = WorkFlow.authenticate( authTokenReqString, client, objectMapper );
        System.out.println(authResponse.getAccessToken());

        FlightToResponse flightToResponse = WorkFlow.getFlightsToCity(authResponse.getAccessToken(),"DFW",client,objectMapper);
        System.out.println("DONE");
    }

}
