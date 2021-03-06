package com.kinath.learning.util;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;

import java.util.Map;

/**
 * Created by kinath on 30/03/2017.
 */
public class HttpRequestUtils
{
    public static HttpRequestBase generateRequest( String url, Map<String, String> headers, String body, Map<String, String> urlParams, RequestType requestType )
    {
        HttpRequestBase generatedRequest = null;

        if( urlParams != null && !urlParams.isEmpty() )
        {
            url += "?";
            for( String urlParamKey : urlParams.keySet() )
            {
                url += urlParamKey + "=" +urlParams.get( urlParamKey ) + ",";
            }
            url = url.substring( 0, url.length() - 1 );
        }

        System.out.println(url);

        if( requestType == RequestType.POST )
        {
            generatedRequest = new HttpPost( url );
        }
        else if( requestType == RequestType.GET )
        {
            generatedRequest = new HttpGet( url );
        }

        for( String headerKey : headers.keySet() )
        {
            generatedRequest.addHeader( headerKey, headers.get( headerKey ) );
        }

        return generatedRequest;
    }
}
