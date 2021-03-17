package br.edu.ifpb.dac.loja.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ifpb.dac.loja.modelo.dto.ProdutoDTO;
import br.edu.ifpb.dac.loja.servico.CatalogoService;


public class CatalogoController {
	
	@Autowired
	private CatalogoService catalogoService;

	public List<ProdutoDTO> consultaCatalogoProdutos() {
		return catalogoService.consultaCatalogoProdutos();
	}
}
