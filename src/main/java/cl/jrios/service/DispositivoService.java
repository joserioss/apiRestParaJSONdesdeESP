package cl.jrios.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	public List<Integer> obtenerUltimos() {
		String mac = "60:01:94:61:B1:FD";
		List<Integer> resp = new ArrayList<>();
		List<Dispositivo> dispositivos;

		dispositivos = dispositivoDao.findAllByOrderByIdDesc();

		for (Dispositivo disp : dispositivos) {
			if (mac.equals(disp.getNombre())) {

				resp.add(Integer.parseInt(disp.getDatos()));
				System.out.println(disp);
			}

		}
		return resp;
	}

	@Transactional
	public DispositivosDto registrar(DispositivoFormDto dispositivoForm) {
		Dispositivo dispositivo = new Dispositivo();
		dispositivo.setNombre(dispositivoForm.getNombre());
		dispositivo.setDatos(dispositivoForm.getDatos());
		Dispositivo respuesta = dispositivoDao.save(dispositivo);

		return new DispositivosDto(201, Arrays.asList(respuesta));
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
