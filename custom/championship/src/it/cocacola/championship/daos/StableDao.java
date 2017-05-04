package it.cocacola.championship.daos;

import java.util.List;

import it.cocacola.championship.model.StableModel;


public interface StableDao
{
	List<StableModel> findStables();

	List<StableModel> findStablesByCode(String code);
}
