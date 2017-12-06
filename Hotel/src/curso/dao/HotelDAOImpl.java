package curso.dao;

import javax.persistence.EntityManager;

import curso.entity.Quarto;

public class HotelDAOImpl implements HotelDAO {
	
	private EntityManager em;


	@Override
	public void adicionar(Quarto q) {
		em = ResourceManager.getEntityManager();
		em.getTransaction().begin();
		if (em.find(Quarto.class, (long) q.getId()) != null)
			em.merge(q);
		else
			em.persist(q);
		em.getTransaction().commit();
		em.close();
	}
	
	
	@Override
	public Quarto pesquisarPorNumero(long id) {
		em = ResourceManager.getEntityManager();
		Quarto q = em.find(Quarto.class, (long)id);
		return q;
	}
	
	
	@Override
	public void deletarQuarto(Quarto q) {
		em = ResourceManager.getEntityManager();
		em.getTransaction().begin();
		em.remove(em.contains(q) ? q : em.merge(q));
		em.getTransaction().commit();
		em.close();
	}
	
	
	public void alterarQuarto(Quarto q) {
		em = ResourceManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(q);
		em.getTransaction().commit();
		em.close();
		
	}
}
