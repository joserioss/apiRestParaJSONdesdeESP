package cl.jrios.controller;

import java.util.Random;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class WSocketController {
	@GetMapping
	public String dashboard(ModelMap modelo) {

		return "grafico.html";
	}
	
    @MessageMapping("grafico")
    @SendTo("/agente/grafico")
    public Integer[] valores() {
        Random rnd = new Random();
        
        Integer[] numeros = new Integer[50];
        
        return numeros;
    }

}
