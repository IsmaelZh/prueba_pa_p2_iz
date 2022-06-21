package com.uce.edu.MatriculacionVehicular;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.MatriculacionVehicular.Service.IPropietarioService;
import com.uce.edu.MatriculacionVehicular.Service.IVehiculoService;
import com.uce.edu.MatriculacionVehicular.modelo.Propietario;
import com.uce.edu.MatriculacionVehicular.modelo.Vehiculo;

@SpringBootApplication
public class PruebaPaP2IzApplication implements CommandLineRunner{
	
	@Autowired
	private IPropietarioService iPropietarioService;

	@Autowired
	private IVehiculoService iVehiculoService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2IzApplication.class, args);
	}
	
		public void run(String... args) throws Exception {
			
			Propietario propietario = new Propietario();
			propietario.setNombre("Ismael");
			propietario.setApellido("Zhindon");
			propietario.setCedula("0309632150");
			
			this.iPropietarioService.insertar(propietario);
			
			Vehiculo vehiculo = new Vehiculo();
			vehiculo.setMarca("A62");
			vehiculo.setModelo("A55");
			vehiculo.setPlaca("PCF-629");
			vehiculo.setPrecio(new BigDecimal(5000));
			vehiculo.setTipo("Liviano");	
			
			this.iVehiculoService.insertar(vehiculo);
			
			
		}
		

	
	}


