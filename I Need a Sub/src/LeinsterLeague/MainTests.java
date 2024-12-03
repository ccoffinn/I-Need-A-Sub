// Student Name/ID: Sarah Scott B00165892
package LeinsterLeague;

public class MainTests {

    public static void PopulateTeamA() {
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

        Player oCuilleanainOisin = new Player("O'Cuilleanain, Oisin", 2164);
        rathminesDiv1.players.add(oCuilleanainOisin);

        Player scottSarah = new Player("Scott, Sarah", 1970);
        rathminesDiv1.players.add(scottSarah);

        Player smithDerek = new Player("Smith, Derek", 1936);
        rathminesDiv1.players.add(smithDerek);


        // GENERATE TEAM B //
        // WE WILL NOT BE MAKING SUBS TO THIS TEAM SO ONLY NEED TO GENERATE PLAYERS FOR
        // THE ROUND 4 MATCH TEST
        Team gonzagaDiv1 = new Team(TeamName.Gonzaga, Division.Armstrong);

        // GENERATE TEAM C
        // WE WILL MAKE PLAYERS AND 3 ROUNDS OF RESULTS TO DETERMINE BEST SUB
        Team rathminesDiv2 = new Team(TeamName.Rathmines, Division.Heidenfeld);

        // TEST 1: display team A and it's players
        System.out.println("Created Team A: " + rathminesDiv1);

        // TEST 2: find best substitute for round 4 match

        // TEST 3: declare legal team

        // TEST 4: declare illegal team

        // TEST 5: generate round 4 results
        Match round4 = new Match(Division.Armstrong, rathminesDiv1, gonzagaDiv1);

        // TEST 6: display updated team information
        System.out.println("Updated Team A: " + rathminesDiv1);
        System.out.println("Updated Team C: " + rathminesDiv2);

        // TEST 7: find best sub after team info updated

        // TEST 8: declare legal sub

        // TEST 9: declare illegal sub


    }
}
