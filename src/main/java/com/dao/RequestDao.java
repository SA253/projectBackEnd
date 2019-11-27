package com.dao;

import java.util.List;

import com.model.RequestModel;

public interface RequestDao {
	public boolean addRequest(RequestModel rqst);

//	public boolean updateService(ServiceModel svc);
	public boolean deleteRequest(String rqstName);

	public RequestModel findRequest(String rqstName);

	public List<RequestModel> getAllRequests();

	public boolean isRequestExists(String rqstName);
}
