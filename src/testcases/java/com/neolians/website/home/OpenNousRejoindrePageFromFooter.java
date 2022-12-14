package com.neolians.website.home;

import com.neolians.common.utils.report.Report;
import com.neolians.website.functions.general.Errors;
import com.neolians.website.functions.general.Footer;
import com.neolians.website.functions.general.Menu;
import com.neolians.website.functions.pages.Home;
import com.neolians.website.functions.pages.NeoMobileFromFooter;
import com.neolians.website.functions.pages.NousRejoindreFromFooter;
import com.neolians.website.utils.report.NeoliansTestcase;
import io.github.artsok.RepeatedIfExceptionsTest;

public class OpenNousRejoindrePageFromFooter extends NeoliansTestcase  {


    @RepeatedIfExceptionsTest(repeats = 1, suspend = 5000L, name = "check Nous Rejoindre Page From Footer")
    void OpenPageNousRejoindreFromFooter() {


        Report.newStep(1, "Open Home Page");
        Home.openPage();


        Report.newStep(2, "open Nous Rejoindre page from footer");
        Home.openPageNousRejoindreFromFooter();

        Report.newStep(3, "Verify Menu");
        Menu.verifieMenu();

        Report.newStep(3, "verify Nous Rejoindre Page");
        NousRejoindreFromFooter.verifyNousRejoindrePageFromFooter();

        Report.newStep(4, "Verify Footer");
        Footer.verifieFooter();

        Report.newStep(5, "Check No error");
        Errors.checkNoErrors();

    }
    }
