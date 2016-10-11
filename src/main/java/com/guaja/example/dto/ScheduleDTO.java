package com.guaja.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.guaja.example.util.JsonDateTime;
import org.joda.time.DateTime;

/**
 * Created by cguajardo on 9/15/16 at 8:22 PM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScheduleDTO {

    @JsonProperty("GameKey")
    private String gameKey;

    @JsonProperty("SeasonType")
    private int seasonType;

    @JsonProperty("Season")
    private int season;

    @JsonProperty("Week")
    private int week;

    @JsonProperty("Date") //"Date": "2016-09-08T20:30:00",
    @JsonSerialize(using = JsonDateTime.SerializeDateTime.class)
    @JsonDeserialize(using = JsonDateTime.DeserializeDateTime.class)
    private DateTime date;

    @JsonProperty("AwayTeam")
    private String awayTeam;

    @JsonProperty("HomeTeam")
    private String homeTeam;

    @JsonProperty("PointSpread")
    private float pointSpread;

    @JsonProperty("OverUnder")
    private float overUnder;

    @JsonProperty("AwayTeamMoneyLine")
    private int awayTeamMoneyLine;

    @JsonProperty("HomeTeamMoneyLine")
    private int homeTeamMoneyLine;


    /*

            "StadiumDetails": {
            "StadiumID": 13,
                "Name": "Sports Authority Field at Mile High",
                "City": "Denver",
                "State": "CO",
                "Country": "USA",
                "Capacity": 76125,
                "PlayingSurface": "Grass",
                "GeoLat": 39.743936,
                "GeoLong": -105.020097
    }
     */

    public String getGameKey() {
        return gameKey;
    }

    public void setGameKey(String gameKey) {
        this.gameKey = gameKey;
    }

    public int getSeasonType() {
        return seasonType;
    }

    public void setSeasonType(int seasonType) {
        this.seasonType = seasonType;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public float getPointSpread() {
        return pointSpread;
    }

    public void setPointSpread(float pointSpread) {
        this.pointSpread = pointSpread;
    }

    public float getOverUnder() {
        return overUnder;
    }

    public void setOverUnder(float overUnder) {
        this.overUnder = overUnder;
    }

    public int getAwayTeamMoneyLine() {
        return awayTeamMoneyLine;
    }

    public void setAwayTeamMoneyLine(int awayTeamMoneyLine) {
        this.awayTeamMoneyLine = awayTeamMoneyLine;
    }

    public int getHomeTeamMoneyLine() {
        return homeTeamMoneyLine;
    }

    public void setHomeTeamMoneyLine(int homeTeamMoneyLine) {
        this.homeTeamMoneyLine = homeTeamMoneyLine;
    }

    /*
    {
            "GameKey": "201610110",
            "SeasonType": 1,
            "Season": 2016,
            "Week": 1,
            "Date": "2016-09-08T20:30:00",
            "AwayTeam": "CAR",
            "HomeTeam": "DEN",
            "Channel": null,
            "PointSpread": 3.4,
            "OverUnder": 45.6,
            "StadiumID": 13,
            "Canceled": false,
            "GeoLat": 39.743936,
            "GeoLong": -105.020097,
            "ForecastTempLow": 56,
            "ForecastTempHigh": 89,
            "ForecastDescription": "Sunny",
            "ForecastWindChill": 82,
            "ForecastWindSpeed": 4,
            "AwayTeamMoneyLine": 0,
            "HomeTeamMoneyLine": 152,
            "StadiumDetails": {
            "StadiumID": 13,
                "Name": "Sports Authority Field at Mile High",
                "City": "Denver",
                "State": "CO",
                "Country": "USA",
                "Capacity": 76125,
                "PlayingSurface": "Grass",
                "GeoLat": 39.743936,
                "GeoLong": -105.020097
    }
    },
    */
}
