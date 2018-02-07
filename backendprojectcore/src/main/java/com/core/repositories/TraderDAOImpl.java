package com.core.repositories;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.core.models.Trader;



@Repository
@Transactional
public class TraderDAOImpl implements TraderDAO {

	private SessionFactory sessionFactory;
    
	@Autowired 
	public TraderDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Override
	public Trader findByUserId(int userId) {
		Session session = this.sessionFactory.getCurrentSession();
        TypedQuery<Trader> query = session.getNamedQuery("findById");  
        query.setParameter("id", userId);
        List<Trader> traders = query.getResultList();
        return traders.get(0);
	}


	@Override
	public List<Trader> findByLocation(String location) {
		return null;
	}


	@Override
	public List<Trader> findAll() {
		Session session = this.sessionFactory.getCurrentSession();
        TypedQuery<Trader> query = session.getNamedQuery("findAll");  
        List<Trader> traders = query.getResultList();
        return traders;
	}

	@Override
	public int findAllCount() {
		Session session = this.sessionFactory.getCurrentSession();
        TypedQuery<Number> query = session.getNamedQuery("findAllCount"); 
        int count = ((Number)query.getSingleResult()).intValue();
        return count;
	}

	@Override
	public Trader save(Trader trader) {
		Session session = this.sessionFactory.openSession();
		session.save(trader);
		session.close();
		return trader;
	}

}