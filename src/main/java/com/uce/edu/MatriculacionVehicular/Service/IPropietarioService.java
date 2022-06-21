package com.uce.edu.MatriculacionVehicular.Service;

import com.uce.edu.MatriculacionVehicular.modelo.Propietario;

public interface IPropietarioService {

	
	public void insertar(Propietario p);


    public void eliminar(String cedula);
	
}
