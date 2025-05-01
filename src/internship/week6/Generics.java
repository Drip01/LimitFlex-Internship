package internship.week6;

interface Player {

    String name();
}
record BaseballPlayer (String name, String position) implements Player {}
record FootballPlayer (String name, String position) implements Player {}
record VolleyPlayer (String name, String position) implements Player {}

public class Generics {

    public static void main(String[] args) {

        var janey = new Affiliation("city", "Enugu, Enugu",
                "NG");

        BaseballTeam jane1 = new BaseballTeam("Jane Fc");
        BaseballTeam ckc1 = new BaseballTeam("Ckc Fc");
        scoreResult(jane1, 1, ckc1, 3);

        BaseballTeam jane2 = new BaseballTeam("Jane Fc");
        BaseballTeam ckc2 = new BaseballTeam("Ckc Fc");
        scoreResult(jane2, 1, ckc2, 3);

        Team<BaseballPlayer, Affiliation> jane =
                new Team<>("Jane Fc", janey);
        Team<BaseballPlayer, Affiliation> ckc = new Team<>("Ckc Fc");
        scoreResult(jane, 1, ckc, 3);

        var Drip = new BaseballPlayer("Drip", "Right Fielder");
        var Ifeanyi = new BaseballPlayer("Ifeanyi", "Right Fielder");
        jane.addTeamMember(Drip);
        jane.addTeamMember(Ifeanyi);
        var guthrie = new BaseballPlayer("Guthrie",  "Center Fielder");
        jane.addTeamMember(guthrie);
        jane.listTeamMembers();

        SportTeam afc1 = new SportTeam("Reno fc");
        Team<FootballPlayer, String> afc = new Team<>("Reno fc",
                "City of Onitsha, Anambra, in NG");
        var tex = new FootballPlayer("Tex Walker", "Center forward");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer("Rory Laird", "Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

        Team<VolleyPlayer, Affiliation> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMember(new VolleyPlayer("N Roberts", "Setter"));
        adelaide.listTeamMembers();

        var canberra = new Team<VolleyPlayer, Affiliation>("Canberra Heat");
        canberra.addTeamMember(new VolleyPlayer("B Black", "Opposite"));
        canberra.listTeamMembers();
        scoreResult(canberra, 0, adelaide, 1);

//        Team<Integer> melbourne = new Team<>("Melbourne Vipers");
    }

    public static void scoreResult(BaseballTeam team1, int t1_score,
                                   BaseballTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportTeam team1, int t1_score,
                                   SportTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score,
                                   Team team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
