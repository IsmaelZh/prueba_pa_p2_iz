package com.uce.edu.demo.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base el vehiculo: " + v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha encontrado en la base el vehiculo: " + placa);
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Toyota");
		vehiculo.setModelo("Yaris");
		vehiculo.setPlaca(placa);
		vehiculo.setPrecio(new BigDecimal(15700));
		vehiculo.setTipo("Liviano");
		return vehiculo;
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el vehiculo: " + v);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el vehiculo: " + placa);
	}

}
