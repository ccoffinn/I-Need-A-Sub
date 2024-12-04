// Student Name/ID: Sarah Scott B00165892
package LeinsterLeague;
import LeagueSubs.*;

public class MainTests {

    public static void RunTests() {
        // GENERATE TEAM A WITH 3 ROUNDS OF RESULTS //

        Team rathminesDiv1 = new Team(TeamName.Rathmines, Division.Armstrong);

        Player cafollaPeter = new Player("Cafolla, Peter", 1878);
        Results cafollaR1 = new Results(1, true, false, cafollaPeter);
        cafollaPeter.resultsList.add(cafollaR1);
        Results cafollaR2 = new Results(1, false, false, cafollaPeter);
        cafollaPeter.resultsList.add(cafollaR2);
        Results cafollaR3 = new Results(2, true, false, cafollaPeter);
        cafollaPeter.resultsList.add(cafollaR3);
        rathminesDiv1.players.add(cafollaPeter);

        Player goraAntonia = new Player("Gora, Antonina", 1965);
        Results goraR1 = new Results(2, true, false, goraAntonia);
        goraAntonia.resultsList.add(goraR1);
        Results goraR2 = new Results(0, false, false, goraAntonia);
        goraAntonia.resultsList.add(goraR2);
        Results goraR3 = new Results(1, true, false, goraAntonia);
        goraAntonia.resultsList.add(goraR3);
        rathminesDiv1.players.add(goraAntonia);

        Player  harringtonEoin = new Player("Harrington, Eoin", 1901);
        Results harringtonR1 = new Results(0, false, false, harringtonEoin);
        harringtonEoin.resultsList.add(harringtonR1);
        Results harringtonR2 = new Results(1, true, false, harringtonEoin);
        harringtonEoin.resultsList.add(harringtonR2);
        Results harringtonR3 = new Results(1, false, false, harringtonEoin);
        harringtonEoin.resultsList.add(harringtonR3);
        rathminesDiv1.players.add(harringtonEoin);

        Player  mcDermottMalo = new Player("McDermott, Malo", 1972);
        Results mcdermottR1 = new Results(1, true, false, mcDermottMalo);
        mcDermottMalo.resultsList.add(mcdermottR1);
        Results mcdermottR2 = new Results(0, false, false, mcDermottMalo);
        mcDermottMalo.resultsList.add(mcdermottR2);
        Results mcdermottR3 = new Results(0, false, false, mcDermottMalo);
        mcDermottMalo.resultsList.add(mcdermottR3);
        rathminesDiv1.players.add(mcDermottMalo);

        Player moranStephan= new Player("Moran, Stephan", 2154);
        rathminesDiv1.players.add(moranStephan);
        Results ms1Result = new Results(0, false, false, moranStephan);
        Results ms2Result = new Results(1, true, false, moranStephan);
        Results ms3Result = new Results(2, true, false, moranStephan);
        moranStephan.resultsList.add(ms1Result);
        moranStephan.resultsList.add(ms2Result);
        moranStephan.resultsList.add(ms3Result);

        Player oCuilleanainOisin = new Player("O'Cuilleanain, Oisin", 2164);
        rathminesDiv1.players.add(oCuilleanainOisin);
        Results oo1Result = new Results(0, false, false, oCuilleanainOisin);
        Results oo2Result = new Results(1, true, false, oCuilleanainOisin);
        Results oo3Result = new Results(2, true, false, oCuilleanainOisin);
        oCuilleanainOisin.resultsList.add(oo1Result);
        oCuilleanainOisin.resultsList.add(oo2Result);
        oCuilleanainOisin.resultsList.add(oo3Result);

        Player scottSarah = new Player("Scott, Sarah", 1970);
        rathminesDiv1.players.add(scottSarah);
        Results ss1Result = new Results(1, false, false, scottSarah);
        Results ss2Result = new Results(1, true, false, scottSarah);
        Results ss3Result = new Results(1, true, false, scottSarah);
        scottSarah.resultsList.add(ss1Result);
        scottSarah.resultsList.add(ss2Result);
        scottSarah.resultsList.add(ss3Result);

        Player smithDerek = new Player("Smith, Derek", 1936);
        rathminesDiv1.players.add(smithDerek);
        Results sd1Result = new Results(0, false, false, smithDerek);
        Results sd2Result = new Results(1, true, false, smithDerek);
        Results sd3Result = new Results(2, true, false, smithDerek);
        smithDerek.resultsList.add(sd1Result);
        smithDerek.resultsList.add(sd2Result);
        smithDerek.resultsList.add(sd3Result);


        // GENERATE TEAM B //
        // WE WILL NOT BE MAKING SUBS TO THIS TEAM SO ONLY NEED TO GENERATE PLAYERS FOR
        // THE ROUND 4 MATCH TEST
        Team gonzagaDiv1 = new Team(TeamName.Gonzaga, Division.Armstrong);
        Player gp1 = new Player("Barnes, Oliver",1884);
        Player gp2 = new Player("Bourached, Anthony",2021);
        Player gp3 = new Player("Carroll, Peter",2150);
        Player gp4 = new Player("Casey, Eoghan",1908);
        Player gp5 = new Player("Collins, Sam E.",2456);
        Player gp6 = new Player("Crowley, James",2164);
        Player gp7 = new Player("Delaney, Killian",2254);
        Player gp8 = new Player("Freeman, Gordon",2007);
        gonzagaDiv1.players.add(gp1);
        gonzagaDiv1.players.add(gp2);
        gonzagaDiv1.players.add(gp3);
        gonzagaDiv1.players.add(gp4);
        gonzagaDiv1.players.add(gp5);
        gonzagaDiv1.players.add(gp6);
        gonzagaDiv1.players.add(gp7);
        gonzagaDiv1.players.add(gp8);

        // GENERATE TEAM C
        // WE WILL MAKE PLAYERS AND 3 ROUNDS OF RESULTS TO DETERMINE BEST SUB
        Team rathminesDiv2 = new Team(TeamName.Rathmines, Division.Heidenfeld);
        Player rp1 = new Player("Aherne, John P.",1882);
        Player rp2 = new Player("Bermingham, Tony",1848);
        Player rp3 = new Player("Connell, Kris",1813);
        Player rp4 = new Player("Cosgrove, Pat",1760);
        Player rp5 = new Player("Goggins, David",1862);
        Player rp6 = new Player("Greenan, Darragh",1621);
        Player rp7 = new Player("Kennedy, Isaac",1520);
        Player rp8 = new Player("Lynch, Peter J.",1719);
        rathminesDiv2.players.add(rp1);
        rathminesDiv2.players.add(rp2);
        rathminesDiv2.players.add(rp3);
        rathminesDiv2.players.add(rp4);
        rathminesDiv2.players.add(rp5);
        rathminesDiv2.players.add(rp6);
        rathminesDiv2.players.add(rp7);
        rathminesDiv2.players.add(rp8);

        Results rp1Result = new Results(0, false, false, rp1);
        Results rp2Result = new Results(1, true, false, rp1);
        Results rp3Result = new Results(2, true, false, rp1);
        rp1.resultsList.add(rp1Result);
        rp1.resultsList.add(rp2Result);
        rp1.resultsList.add(rp3Result);

        rp1Result = new Results(0, false, false, rp2);
        rp2Result = new Results(0, true, false, rp2);
        rp3Result = new Results(2, false, false, rp2);
        rp2.resultsList.add(rp1Result);
        rp2.resultsList.add(rp2Result);
        rp2.resultsList.add(rp3Result);

        rp1Result = new Results(1, false, true, rp3);
        rp2Result = new Results(1, false, true, rp3);
        rp3Result = new Results(1, true, false, rp3);
        rp3.resultsList.add(rp1Result);
        rp3.resultsList.add(rp2Result);
        rp3.resultsList.add(rp3Result);

        rp1Result = new Results(2, true, false, rp4);
        rp2Result = new Results(2, true, false, rp4);
        rp3Result = new Results(0, true, false, rp4);
        rp4.resultsList.add(rp1Result);
        rp4.resultsList.add(rp2Result);
        rp4.resultsList.add(rp3Result);

        rp1Result = new Results(2, false, false, rp5);
        rp2Result = new Results(1, false, false, rp5);
        rp3Result = new Results(2, true, false, rp5);
        rp5.resultsList.add(rp1Result);
        rp5.resultsList.add(rp2Result);
        rp5.resultsList.add(rp3Result);

        rp1Result = new Results(2, false, false, rp6);
        rp2Result = new Results(1, false, false, rp6);
        rp3Result = new Results(1, false, false, rp6);
        rp6.resultsList.add(rp1Result);
        rp6.resultsList.add(rp2Result);
        rp6.resultsList.add(rp3Result);

        rp1Result = new Results(0, false, false, rp7);
        rp2Result = new Results(1, true, false, rp7);
        rp3Result = new Results(2, true, false, rp7);
        rp7.resultsList.add(rp1Result);
        rp7.resultsList.add(rp2Result);
        rp7.resultsList.add(rp3Result);

        rp1Result = new Results(2, true, false, rp8);
        rp2Result = new Results(2, true, false, rp8);
        rp3Result = new Results(2, true, false, rp8);
        rp8.resultsList.add(rp1Result);
        rp8.resultsList.add(rp2Result);
        rp8.resultsList.add(rp3Result);

        //////////////////////////////////////////////

                // TESTS TO RUN //

        //////////////////////////////////////////////

        // TEST 1: display team A and it's players
        // System.out.println("Created Team A: " + rathminesDiv1);

        // TEST 2: find best substitute for round 4 on board 8 (white)
        // System.out.println(BestSub.FindBestSub(rathminesDiv2, true));

        // TEST 3: declare legal team

        // TEST 4: declare illegal team

        // TEST 5: generate round 4 results
        Match round4 = new Match(Division.Armstrong, rathminesDiv1, gonzagaDiv1);

        // TEST 6: find best sub after team info updated

        // TEST 7: declare legal sub

        // TEST 8: declare illegal sub


    }
}
