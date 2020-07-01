package kz.kazpost.webservices.calculate.dao;

import kz.kazpost.webservices.calculate.schema.*;

public interface InitProcessDao {
    CalculateResponse cal(CalculateRequest request);
    CalculateSqrtResponse cal(CalculateSqrtRequest request);
}