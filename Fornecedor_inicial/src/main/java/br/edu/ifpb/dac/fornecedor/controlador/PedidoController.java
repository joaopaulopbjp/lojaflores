package br.edu.ifpb.dac.fornecedor.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.dac.fornecedor.modelo.Pedido;
import br.edu.ifpb.dac.fornecedor.modelo.dto.ItemDoPedidoDTO;
import br.edu.ifpb.dac.fornecedor.servicos.PedidoService;


public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	public Pedido realizaPedido(List<ItemDoPedidoDTO> produtos) {
		return pedidoService.realizaPedido(produtos);
	}
	
	public Pedido getPedidoPorId(Long id) {
		return pedidoService.getPedidoPorId(id);
	}
}
