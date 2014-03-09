package org.dev.emmanuel.cms.dao;

import org.dev.emmanuel.cms.domain.Physician;

public interface PhysicianDao {
	
	public void createPhysician(Physician p);
	public void getPhysician(String id);
	public Physician updatePhysician(Physician p);
	public void deletePhysician(Physician p);
	
}
