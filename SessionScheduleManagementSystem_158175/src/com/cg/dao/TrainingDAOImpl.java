package com.cg.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.cg.bean.ScheduledSessions;

@Repository
@Transactional
public class TrainingDAOImpl implements ITrainingDAO{
	
	@PersistenceContext
	public EntityManager entityManager;

	@Override
	public ArrayList<ScheduledSessions> sessionsdatalist() {
		
		Query q=entityManager.createQuery("Select ss from ScheduledSessions ss");
		return (ArrayList<ScheduledSessions>) q.getResultList();
	}

}
