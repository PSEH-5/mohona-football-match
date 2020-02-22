package io.mohona.footballmatch.models;

public class LeaguePosition {
   // private String countryId;
    private  String countryName;
    private String leagueId;
    private String leagueName;
    private String teamId;
    private String teamName;
    private  String overAllLeaguePosition;

    public LeaguePosition( String countryName, String leagueId, String leagueName, String teamId, String teamName, String overAllLeaguePosition) {
      //  this.countryId = countryId;
        this.countryName = countryName;
        this.leagueId = leagueId;
        this.leagueName = leagueName;
        this.teamId = teamId;
        this.teamName = teamName;
        this.overAllLeaguePosition = overAllLeaguePosition;
    }

    public LeaguePosition() {
    }

    public String getOverAllLeaguePosition() {
        return overAllLeaguePosition;
    }

    public void setOverAllLeaguePosition(String overAllLeaguePosition) {
        this.overAllLeaguePosition = overAllLeaguePosition;
    }


    public String getCountryName() {
        return countryName;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }



    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
