package com.br.alura.mvc.mudi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.alura.mvc.mudi.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	
//	@PersistenceContext
//	private EntityManager entityManager;
	

//		
//		Query query =  entityManager.createQuery("select p from Pedido p", Pedido.class);
//    	return query.getResultList();
		
		
	

}
