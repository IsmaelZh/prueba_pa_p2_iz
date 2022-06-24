package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.service.IMatriculaGestorService;
import com.uce.edu.demo.service.IPropietarioService;
import com.uce.edu.demo.service.IVehiculoService;

@SpringBootApplication
public class PruebaU1P2IzApplication implements CommandLineRunner {
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaGestorService iMatriculaGestorService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaU1P2IzApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		        //1
				Propietario p = new Propietario();
				p.setNombre("Ismael");
				p.setApellido("Zhindon");
				p.setCedula("0302568957");
				this.iPropietarioService.crear(p);
				
				//2
				Vehiculo v = new Vehiculo();
				v.setMarca("Mercedes Benz");
				v.setModelo("3348");
				v.setPlaca("PJI-592");
				v.setPrecio(new BigDecimal(70000));
				v.setTipo("Pesado");
				this.iVehiculoService.insertar(v);
				
				//3
				v.setPlaca("GRT-897");
				this.iVehiculoService.actualizar(v);
				
				//4
				this.iMatriculaGestorService.generar(p.getCedula(), v.getPlaca());
		
	}

}
