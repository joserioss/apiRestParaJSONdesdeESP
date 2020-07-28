package cl.jrios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.jrios.model.dto.DispositivoFormDto;
import cl.jrios.model.dto.DispositivosDto;
import cl.jrios.service.DispositivoService;

@RestController
@RequestMapping("/api/v1/dispositivos")
public class DispositivoController {

	@Autowired
	private DispositivoService servicio;
	
	@GetMapping
	public DispositivosDto dispositivos(){
		return servicio.obtenerTodos();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public DispositivosDto registrar(@RequestBody DispositivoFormDto dispositivoForm){
		return servicio.registrar(dispositivoForm);
	}
}
