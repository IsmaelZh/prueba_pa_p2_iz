package com.uce.edu.MatriculacionVehicular.Repository;

import com.uce.edu.MatriculacionVehicular.modelo.Vehiculo;

public interface IVehiculoRepository {

	//C: crear/insertar 
	public void insertar(Vehiculo v);
	//R: leer/buscar
	public Vehiculo buscar(String placa);
	//U: actualizar 
	public void actualizar (Vehiculo v);
	//D: eliminar
    public void eliminar(String placa);
	
}
