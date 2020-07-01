package kz.kazpost.webservices.calculate.service;

import kz.kazpost.webservices.calculate.schema.CalculateRequest;
import kz.kazpost.webservices.calculate.schema.CalculateResponse;
import kz.kazpost.webservices.calculate.schema.CalculateSqrtRequest;
import kz.kazpost.webservices.calculate.schema.CalculateSqrtResponse;


public interface InitProcessService {
    CalculateResponse cal(CalculateRequest request);
    CalculateSqrtResponse cal(CalculateSqrtRequest request);
}


