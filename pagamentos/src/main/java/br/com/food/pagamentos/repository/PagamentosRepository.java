package br.com.food.pagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.food.pagamentos.model.Pagamento;

public interface PagamentosRepository extends JpaRepository<Pagamento, Long>{

}
