/**
 *
 */
package it.cocacola.championship.daos;

import java.util.List;

import it.cocacola.championship.model.VehicleModel;


public interface VehicleDao
{
	List<VehicleModel> findVehicles();

	List<VehicleModel> findVehiclesByCode(String code);
}
