package com.neolians.website.functions.pages;

import com.neolians.website.repository.pages.PageNeoMobile;

public class NeoMobile {

    private NeoMobile() { throw new IllegalStateException("Utility class");}


    public static void verifiePageNeoMobile(){


        /**
         * Verifier le paragraphe 1
         */
       PageNeoMobile.paragraphe1.assertPresent();

       PageNeoMobile.contenu1paragraphe1.assertPresent();
       String contenu1P1 = PageNeoMobile.contenu1paragraphe1.getText();
       PageNeoMobile.contenu1paragraphe1.assertEquals("Nous vous accompagnons dans votre activité de développement d’applications mobiles à travers :",contenu1P1);



       PageNeoMobile.contenu2paragraphe1.assertPresent();
       String contenu2p1 = PageNeoMobile.contenu2paragraphe1.getText();
       PageNeoMobile.contenu2paragraphe1.assertEquals("L’élaboration de votre stratégie de test d’application mobile et sa mise œuvre,",contenu2p1);


        /**
         * Verifier l'image 1
         */
       PageNeoMobile.firstGif.assertPresent();


        /**
         * Verifier le cadre horizontal
         */
       PageNeoMobile.horizontalFrame.assertPresent();

        /**
         * Verifier le premier cadre horizontal
         */
        PageNeoMobile.horizontalFrame1.assertPresent();
       PageNeoMobile.contenuhorizontalFrame1.assertPresent();

        /**
         * Verifier le deuxième cadre horizontal
         */
        PageNeoMobile.horizontalFrame2.assertPresent();
        PageNeoMobile.contenuhorizontalFrame2.assertPresent();

        /**
         * Verifier le troisième cadre horizontal
         */
        PageNeoMobile.horizontalFrame3.assertPresent();
        PageNeoMobile.contenuhorizontalFrame3.assertPresent();

        /**
         * Verifier le quatrième cadre horizontal
         */
        PageNeoMobile.horizontalFrame4.assertPresent();
        PageNeoMobile.contenuhorizontalFrame4.assertPresent();


        /**
         * Verifier le paragraphe 2
         */
        PageNeoMobile.paragraphe2.assertPresent();

        PageNeoMobile.contenu1paragraphe2.assertPresent();
        String contenu1P2 = PageNeoMobile.contenu1paragraphe2.getText();
        PageNeoMobile.contenu1paragraphe2.assertEquals("Nos prestations de test dédiées aux applications mobiles :"
                ,contenu1P2);



        PageNeoMobile.contenu2paragraphe2.assertPresent();
        String contenu2p2 = PageNeoMobile.contenu2paragraphe2.getText();
        PageNeoMobile.contenu2paragraphe2.assertEquals("Cloud Test :"
                ,contenu2p2);


        /**
         * Verifier l'image 2
         */
        PageNeoMobile.secondGif.assertPresent();







    }



}
