package com.uce.edu.MatriculacionVehicular.Service;

import com.uce.edu.MatriculacionVehicular.modelo.Vehiculo;

public interface IVehiculoService {


	public void insertar(Vehiculo v);
	
	public Vehiculo buscar(String placa);
	
	public void actualizar (Vehiculo v);
	
    public void eliminar(String placa);
	
}
