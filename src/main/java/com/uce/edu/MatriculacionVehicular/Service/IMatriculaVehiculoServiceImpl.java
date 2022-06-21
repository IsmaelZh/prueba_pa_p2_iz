package com.uce.edu.MatriculacionVehicular.Service;

import org.springframework.stereotype.Service;

import com.uce.edu.MatriculacionVehicular.modelo.Propietario;
import com.uce.edu.MatriculacionVehicular.modelo.Vehiculo;

@Service
public class IMatriculaVehiculoServiceImpl implements IMatriculaVehiculoService{

	@Override
	public void insertar(String cedula, String placa) {
		
		Propietario propietario = new Propietario();
		propietario.setCedula(cedula);
		
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setPlaca(placa);

		//MatricularVehiculo matricula = new MatricularVehiculo();
		
	}

}
