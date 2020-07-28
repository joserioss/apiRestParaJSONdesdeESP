package cl.jrios.model.dto;

import java.util.List;

import cl.jrios.model.entity.Dispositivo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class DispositivosDto {
	private Integer status;
	private List<Dispositivo> data;
}
