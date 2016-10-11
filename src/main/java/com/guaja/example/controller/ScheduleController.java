package com.guaja.example.controller;

import com.guaja.example.dto.ScheduleDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by cguajardo on 9/15/16 at 8:03 PM
 */
@RestController
public class ScheduleController {

    @RequestMapping(value = "/schedule", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<ScheduleDTO> getSchedules(ModelAndView mav) {
        RestTemplate template = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Ocp-Apim-Subscription-Key", "cc3166da6bd84289bcd0d50dc729e1c4");

        HttpEntity entity = new HttpEntity(headers);

        String url = "https://api.fantasydata.net/v3/nfl/scores/JSON/Schedules/2016REG";

        HttpEntity<List<ScheduleDTO>> response = template.exchange(url, HttpMethod.GET, entity, new ParameterizedTypeReference<List<ScheduleDTO>>() {});

        List<ScheduleDTO> allSchedules = response.getBody();
        List<ScheduleDTO> currentWeekSchedules = allSchedules.stream().filter(p -> p.getWeek() == 2).collect(Collectors.toList());

        return currentWeekSchedules;
    }
}
