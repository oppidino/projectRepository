package it.cocacola.championship.services;

import java.util.List;

import it.cocacola.championship.model.StableModel;
import it.cocacola.championship.model.VehicleModel;


public interface StableService
{

	List<StableModel> getStables();

	StableModel getStablesForCode(String code);

	StableModel getStablesForVehicle(VehicleModel vehicle);

}