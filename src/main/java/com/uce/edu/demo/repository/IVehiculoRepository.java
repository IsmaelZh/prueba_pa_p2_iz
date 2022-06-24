package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Vehiculo;

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
