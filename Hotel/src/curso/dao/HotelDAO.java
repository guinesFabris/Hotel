package curso.dao;

import java.util.List;

import curso.entity.Quarto;

public interface HotelDAO {
	
	void adicionar(Quarto q);
	Quarto pesquisarPorNumero(long numero);
	void deletarQuarto(Quarto q);
	void alterarQuarto(Quarto q);

}
