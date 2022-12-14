package com.neolians.website.functions.pages;

import com.neolians.website.repository.pages.PageNeoMobile;
import com.neolians.website.repository.pages.PageNousRejoindre;
import org.junit.Assert;

public class NousRejoindreFromFooter {
    private NousRejoindreFromFooter() {
        throw new IllegalStateException("Utility class");
    }


    /**
     * Verifie page Nos Partenaire depuis la barre en pied de page
     */

    public static void verifyNousRejoindrePageFromFooter(){

        String URL = PageNousRejoindre.url3.getCurrentUrl();
        Assert.assertEquals(URL,"/nous-rejoindre/");
        System.out.println("l'url current est    "+URL);





    }

}
