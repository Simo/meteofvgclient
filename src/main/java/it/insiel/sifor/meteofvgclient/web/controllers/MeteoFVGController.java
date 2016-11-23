package it.insiel.sifor.meteofvgclient.web.controllers;

import it.insiel.sifor.meteofvgclient.web.client.RestClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sbierti on 22/11/16.
 */
@RestController
public class MeteoFVGController {

    @RequestMapping("/ajax/getData4graphNeve.php")
    public String grafici(@RequestParam Long stazione, @RequestParam Long n, @RequestParam Long delta_t){
        RestClient client = new RestClient("http://www.meteo.fvg.it/");
        String endp = "ajax/getData4graphNeve.php?";
        String staz = "stazione=" + stazione.toString();
        String gior = "n=" + n.toString();
        String delt = "delta_t=" + delta_t.toString();
        return client.get(endp + staz + "&" + gior + "&" + delt);
    }
}
