package com.neolians.website.functions.pages;

import com.neolians.website.repository.pages.PageNeoMobile;
import org.junit.Assert;

public class NeoMobileFromFooter {
    private NeoMobileFromFooter() {
        throw new IllegalStateException("Utility class");
    }


    /**
     * Verifie page test application mobile
     */

    public static void verifyNeoMobilePageFromFooter(){

        String URL = PageNeoMobile.url2.getUrl();
        Assert.assertEquals(URL,"/neo-mobile/");
        System.out.println("l'url current est    "+URL);



    }


}
