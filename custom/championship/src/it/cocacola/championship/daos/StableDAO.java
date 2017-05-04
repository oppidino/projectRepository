package it.cocacola.championship.daos;

import java.util.List;

import it.cocacola.championship.model.StableModel;
import it.cocacola.championship.model.VehicleModel;


public interface StableDAO
{
	List<StableModel> findStables();

	List<StableModel> findStablesByCode(String code);

	List<StableModel> findStablesByVehicle(VehicleModel vehicle);
}
