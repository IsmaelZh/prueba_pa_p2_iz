package com.uce.edu.MatriculacionVehicular.Repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.MatriculacionVehicular.modelo.MatricularVehiculo;

@Repository
public class MatriculaVehiculoRepository implements IMatriculaVehiculoRepository {
	
	@Override
	public void insertar(MatricularVehiculo m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado la matricula" + m);
	}

}
