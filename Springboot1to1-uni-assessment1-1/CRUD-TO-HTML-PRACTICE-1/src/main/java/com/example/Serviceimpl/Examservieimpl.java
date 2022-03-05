package com.example.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ExamRepo;
import com.example.Service.Examservice;
import com.example.entity.Exam;

@Service
public class Examservieimpl implements Examservice{

	@Autowired
	private ExamRepo examr;
	@Override
	public void storedata(Exam exam) {
		// TODO Auto-generated method stub
		examr.save(exam);
	}

	@Override
	public List<Exam> fetchdata() {
		// TODO Auto-generated method stub
		return examr.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		examr.deleteById(id);
	}

	@Override
	public void updatedata(Exam exam) {
		// TODO Auto-generated method stub
		examr.save(exam);
	}
}

