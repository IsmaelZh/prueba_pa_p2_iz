package com.uce.edu.MatriculacionVehicular.Repository;

import com.uce.edu.MatriculacionVehicular.modelo.Propietario;

public interface IPropietarioRepository {

	//Crear
	public void insertar(Propietario p);

	//Eliminar
    public void eliminar(String cedula);
	
}
