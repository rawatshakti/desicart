package com.desicart.util;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class RestHelper {

    public static String doHttpGet(String url) throws IOException {
        String responseString = "";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        responseString = closeableHttpResponseToString(response);

        return responseString;
    }

    public static String doHttpGet(String url, String[] params) throws IOException {
        String responseString = "";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<params.length;i++)
        {
            if(i==params.length-1)
                sb.append(params[i]);
            else
                sb.append(params[i] + "/");
        }

        HttpGet httpGet = new HttpGet(url + sb.toString());
        CloseableHttpResponse response = httpClient.execute(httpGet);
        responseString = closeableHttpResponseToString(response);

        return responseString;
    }

    private static String closeableHttpResponseToString(CloseableHttpResponse response) throws IOException {
        String responseString = "";

        try {
            HttpEntity entity = response.getEntity();
            responseString = EntityUtils.toString(entity, "UTF-8");
            EntityUtils.consume(entity);
        }
        finally {
            response.close();
        }

        return responseString;
    }
}
