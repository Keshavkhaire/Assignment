package com.example.Service;

import java.util.List;

import com.example.entity.Exam;

public interface Examservice {

	public void storedata(Exam exam);
	public List<Exam> fetchdata();
	public void delete(int id);
	public void updatedata(Exam exam);
}
