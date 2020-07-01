package kz.kazpost.webservices.calculate.endpoint;


import kz.kazpost.webservices.calculate.schema.CalculateRequest;
import kz.kazpost.webservices.calculate.schema.CalculateResponse;
import kz.kazpost.webservices.calculate.schema.CalculateSqrtRequest;
import kz.kazpost.webservices.calculate.schema.CalculateSqrtResponse;
import kz.kazpost.webservices.calculate.service.InitProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class Endpoints {
	
	private static final String KZ_TARGET_NAMESPACE = "http://webservices.kazpost.kz/calculate/schema";
	
	@Autowired
	private InitProcessService service;

	@PayloadRoot(localPart = "CalculateRequest", namespace = KZ_TARGET_NAMESPACE)
	@ResponsePayload
	public CalculateResponse cal(@RequestPayload CalculateRequest request) {
		return service.cal(request);
	}

	@PayloadRoot(localPart = "CalculateSqrtRequest", namespace = KZ_TARGET_NAMESPACE)
	@ResponsePayload
	public CalculateSqrtResponse cal(@RequestPayload CalculateSqrtRequest request) {
		return service.cal(request);
	}


}