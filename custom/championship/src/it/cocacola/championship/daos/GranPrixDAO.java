package it.cocacola.championship.daos;

import java.util.List;

import it.cocacola.championship.model.GranPrixModel;


public interface GranPrixDAO
{
	List<GranPrixModel> findGranPrixByCode(String code);
}