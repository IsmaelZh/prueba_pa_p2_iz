package com.uce.edu.MatriculacionVehicular.Repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.MatriculacionVehicular.modelo.Vehiculo;

@Repository
public class IVehiculoRepositoryImpl implements IVehiculoRepository {

	@Override
	public void actualizar(Vehiculo v) {
	
		System.out.println("Vehiculo actualizado: " + v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha encontrado el vehiculo: " + placa);
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca(placa);
		vehiculo.setModelo("A55");
		vehiculo.setPlaca("PCF-629");
		vehiculo.setPrecio(new BigDecimal(5000));
		vehiculo.setTipo("Liviano");
		return vehiculo;
	}

	@Override
	public void insertar(Vehiculo v) {
		
		System.out.println("Se ha insertado el vehiculo: " + v);
	}

	@Override
	public void eliminar(String placa) {
		
		System.out.println("Se ha eliminado el vehiculo: " + placa);		
	}


	
	
}
