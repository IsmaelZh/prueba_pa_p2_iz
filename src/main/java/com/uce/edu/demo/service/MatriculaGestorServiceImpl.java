package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.repository.IMatriculaRepository;
import com.uce.edu.demo.repository.IPropietarioRepository;
import com.uce.edu.demo.repository.IVehiculoRepository;

@Service
public class MatriculaGestorServiceImpl implements IMatriculaGestorService {
	
	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Autowired
	@Qualifier("liviano")
	private IMatriculaService matriculaServiceLiviano;
	
	@Autowired
	@Qualifier("pesado")
	private IMatriculaService matriculaServicePesado;
	
	@Autowired
	public IMatriculaRepository iMatriculaRepository;
	
	@Override
	public void generar(String cedula, String placa) {
		// TODO Auto-generated method stub
		Propietario propietario = this.iPropietarioRepository.consultar(cedula);
		Vehiculo vehiculo = this.iVehiculoRepository.buscar(placa);
		BigDecimal valorMatricula;
		
		if(vehiculo.getTipo().equals("Liviano")) {
			
			valorMatricula = this.matriculaServiceLiviano.calcularValor(vehiculo.getPrecio());
			
		}else {
			
			valorMatricula = this.matriculaServicePesado.calcularValor(vehiculo.getPrecio());
		}
		
		if(valorMatricula.compareTo(new BigDecimal(2000)) > 0) {
			BigDecimal descuento = valorMatricula.multiply(new BigDecimal(7)).divide(new BigDecimal(100));
			valorMatricula = valorMatricula.subtract(descuento);
		}
		
		Matricula matricula = new Matricula();
		matricula.setFechaMatricula(LocalDateTime.now());
		matricula.setValorMatricula(valorMatricula);
		matricula.setPropietario(propietario);
		matricula.setVehiculo(vehiculo);
		
		this.iMatriculaRepository.crear(matricula);
		
	}
	
}
