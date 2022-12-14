package com.neolians.website.functions.pages;

import com.neolians.website.repository.pages.PageNeoExternalisationFromNosOffres;
import com.neolians.website.repository.pages.PageNeoMobile;
import org.junit.Assert;

public class ExternaliserVosTestsFromFooter {
    private ExternaliserVosTestsFromFooter() { throw new IllegalStateException("Utility class");}



    /**
     * ouvre la page externaliser vos tests depuis la barre en pied de page
     */

    public static void verifyExternaliserVosTestsPageFromFooter(){

        String URL = PageNeoExternalisationFromNosOffres.url4.getCurrentUrl();
        Assert.assertEquals(URL,"/neo-externalisation/");
        System.out.println("l'url current est    "+URL);



    }












}
