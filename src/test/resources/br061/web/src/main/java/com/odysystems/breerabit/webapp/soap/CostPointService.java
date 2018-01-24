package com.odysystems.breerabit.webapp.soap;

import javax.jws.WebService;

@WebService
public interface CostPointService {

	public void marshalCostpointEMFXML() throws Exception;
}
