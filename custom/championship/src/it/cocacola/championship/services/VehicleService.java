package it.cocacola.championship.services;

import java.util.List;

import it.cocacola.championship.model.VehicleModel;


public interface VehicleService
{

	List<VehicleModel> getVehicles();

	VehicleModel getVehiclesForCode(String code);

}