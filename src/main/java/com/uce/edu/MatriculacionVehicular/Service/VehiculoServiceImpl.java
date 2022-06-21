package com.uce.edu.MatriculacionVehicular.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.MatriculacionVehicular.Repository.IVehiculoRepository;
import com.uce.edu.MatriculacionVehicular.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl implements IVehiculoService{
	
	@Autowired
	private IVehiculoRepository vehiculoRepository;

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.insertar(v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.buscar(placa);
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.actualizar(v);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.eliminar(placa);
	}

}
