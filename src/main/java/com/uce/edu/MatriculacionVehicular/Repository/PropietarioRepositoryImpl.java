package com.uce.edu.MatriculacionVehicular.Repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.MatriculacionVehicular.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el propietario: " + p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Cuenta ha eliminado el propietario: " + cedula);
	}

}
