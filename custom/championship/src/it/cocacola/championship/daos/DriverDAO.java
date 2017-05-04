package it.cocacola.championship.daos;

import java.util.List;

import it.cocacola.championship.model.DriverModel;


public interface DriverDAO
{

	List<DriverModel> findDrivers();

	List<DriverModel> findDriversByCode(String code);

}