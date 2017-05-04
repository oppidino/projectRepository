package it.cocacola.championship.services;

import java.util.List;

import it.cocacola.championship.model.StableModel;


public interface StableService
{

	List<StableModel> getVehicles();

	StableModel getVehiclesForCode(String code);

}