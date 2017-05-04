/**
 *
 */
package it.cocacola.championship.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.cocacola.championship.daos.GranPrixDAO;
import it.cocacola.championship.model.GranPrixModel;


@Component(value = "GranPrixDAO")
public class DefaultGranPrixDAO implements GranPrixDAO
{

	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<GranPrixModel> findGranPrix()
	{

		final String queryString = //
				"SELECT {p:" + GranPrixModel.PK + "} "//
						+ "FROM {" + GranPrixModel._TYPECODE + " AS p} ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		return flexibleSearchService.<GranPrixModel> search(query).getResult();
	}


	@Override
	public List<GranPrixModel> findGranPrixByCode(final String code)
	{
		final String queryString = //
				"SELECT {p:" + GranPrixModel.PK + "}" //
						+ "FROM {" + GranPrixModel._TYPECODE + " AS p} "//
						+ "WHERE " + "{p:" + GranPrixModel.CODE + "}=?code ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);

		return flexibleSearchService.<GranPrixModel> search(query).getResult();
	}


}