package cl.jrios.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.jrios.model.entity.Dispositivo;

public interface DispositivoDao extends JpaRepository<Dispositivo, Integer> {
	 public List<Dispositivo> findAllByOrderByIdDesc();
	 public List<Dispositivo> findAllByOrderByIdAsc();

}
