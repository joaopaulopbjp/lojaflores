package br.edu.ifpb.dac.loja.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.dac.loja.modelo.dto.CompraDTO;
import br.edu.ifpb.dac.loja.servico.CompraService;

@RestController
@RequestMapping("compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;

	@PostMapping
	public void realizaCompra(@RequestBody CompraDTO compra) {
		System.out.println("CompraController_realizarCompra. ");
		compraService.realizarCompra(compra);
	}
}
