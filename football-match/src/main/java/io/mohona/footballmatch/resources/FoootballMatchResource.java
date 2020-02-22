package io.mohona.footballmatch.resources;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import io.mohona.footballmatch.models.LeageDetails;
import io.mohona.footballmatch.models.LeaguePosition;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.boot.web.client.RestTemplateBuilder;


@RestController
@RequestMapping("/getStanding")
public class FoootballMatchResource {
    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(path="/{countryName}/{leagueName}/{teamName}",method= RequestMethod.GET)
    public LeaguePosition getStanding(@PathVariable("countryName")  String countryName, @PathVariable("leagueName") String leagueName, @PathVariable("teamName") String teamName) throws IOException {
      // ResponseEntity<Object[]> response= restTemplate.getForEntity("https://apiv2.apifootball.com/?action=get_standings&league_id=148&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978",Object[].class);

        ResponseEntity<LeageDetails[]> response= restTemplate.getForEntity("https://apiv2.apifootball.com/?action=get_standings&league_id=148&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978",LeageDetails[].class);

        LeageDetails[] l = response.getBody();
        LeaguePosition position= new LeaguePosition();

        for(int i=0;i<l.length;i++)
        {
            if(l[i].getCountry_name().equals(countryName) && l[i].getLeague_name().equals(leagueName) && l[i].getTeam_name().equals(teamName))
            {

                position.setCountryName(l[i].getCountry_name());
                position.setLeagueId(l[i].getLeague_id());
                position.setLeagueName(l[i].getLeague_name());
                position.setTeamId(l[i].getTeam_id());
                position.setTeamName(l[i].getTeam_name());
                position.setOverAllLeaguePosition(l[i].getOverall_league_position());

                break;
            }
        }

      //  Object ob = new LeageDetails();
      //  ob= (LeageDetails) l[0];

      return position;
      //  return Collections.singletonList(new LeaguePosition("C01","Sapient","L01","Football League","T01","Team1","1"));
    }
}
