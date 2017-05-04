package it.cocacola.championship.daos;

import java.util.List;

import it.cocacola.championship.model.DriverModel;
import it.cocacola.championship.model.VehicleModel;


public interface DriverDAO
{

	List<DriverModel> findDriversByCode(String code);

	List<DriverModel> findDriversByVehicle(VehicleModel vehicle);
}