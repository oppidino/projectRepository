/**
 *
 */
/**
 *
 */
package it.cocacola.championship.daos;

import java.util.List;

import it.cocacola.championship.model.PlacingModel;


public interface PlacingDAO
{

	List<PlacingModel> findPlacings();


	List<PlacingModel> findPlacingsByCode(String code);
}