package com.cg.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.bean.ScheduledSessions;
import com.cg.dao.ITrainingDAO;

@Service
public class TrainingServiceImpl implements ITrainingService{
	
	@Autowired
	public ITrainingDAO iTrainingDao;

	@Override
	public ArrayList<ScheduledSessions> sessionsdatalist() {
		
		return iTrainingDao.sessionsdatalist();
	}

}
