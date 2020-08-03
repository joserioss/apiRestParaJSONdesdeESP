package cl.jrios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import cl.jrios.model.entity.Dispositivo;
import cl.jrios.model.entity.DispositivoResponse;
import cl.jrios.service.DispositivoService;

@Controller
public class HomeController {

	@Autowired
	private DispositivoService servicio;

	@MessageMapping("/api/v1/dispositivos")
	@SendTo("/topic/user")
	public DispositivoResponse getDispositivo(Dispositivo dispositivio) {

		
		return new DispositivoResponse();
	}
}
