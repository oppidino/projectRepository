/**
 *
 */
package it.cocacola.championship.daos;

import java.util.List;

import it.cocacola.championship.model.VehicleModel;


public interface VehicleDAO
{
	List<VehicleModel> findVehicles();

	List<VehicleModel> findVehiclesByCode(String code);
}
