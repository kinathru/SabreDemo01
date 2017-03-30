package com.kinath.learning.util;

import org.apache.commons.codec.binary.Base64;

/**
 * Created by kinath on 30/03/2017.
 */
public class CodecUtils
{
    public static String encodeBase64(String plainString)
    {
        Base64 base64 = new Base64();
        String encoded = new String(base64.encode(plainString.getBytes()));

        return encoded;
    }
}
