package cl.jrios.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.jrios.model.dao.DispositivoDao;
import cl.jrios.model.dto.DispositivoFormDto;
import cl.jrios.model.dto.DispositivosDto;
import cl.jrios.model.entity.Dispositivo;

@Service
public class DispositivoService {

	@Autowired
	private DispositivoDao dispositivoDao;
	
	@Transactional(readOnly = true)
	public DispositivosDto obtenerTodos() {
		return new DispositivosDto(200, dispositivoDao.findAll());
	}
	
	@Transactional
	public DispositivosDto registrar(DispositivoFormDto dispositivoForm) {
		Dispositivo dispositivo = new Dispositivo();
		dispositivo.setNombre(dispositivoForm.getNombre());
		dispositivo.setDatos(dispositivoForm.getDatos());
		Dispositivo respuesta = dispositivoDao.save(dispositivo);
		
		return new DispositivosDto(201,Arrays.asList(respuesta));
	}

	@Transactional
	public DispositivosDto actualizar() {
		return new DispositivosDto();
	}
	
	@Transactional
	public DispositivosDto eliminar() {
		return new DispositivosDto();
	}
	

	public DispositivosDto obtenerDispositivo(Integer id) {
		return new DispositivosDto();
	}
	
}
