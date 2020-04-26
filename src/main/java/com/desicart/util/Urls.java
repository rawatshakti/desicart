package com.desicart.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Urls {

    @Value("${secure}")
    private static Boolean IsSecure;

    @Value("${api.external.type}")
    private static String ApiExternalType;


}
