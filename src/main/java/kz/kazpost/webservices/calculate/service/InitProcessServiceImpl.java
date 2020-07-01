package kz.kazpost.webservices.calculate.service;

import kz.kazpost.webservices.calculate.dao.InitProcessDao;
import kz.kazpost.webservices.calculate.schema.CalculateRequest;
import kz.kazpost.webservices.calculate.schema.CalculateResponse;
import kz.kazpost.webservices.calculate.schema.CalculateSqrtRequest;
import kz.kazpost.webservices.calculate.schema.CalculateSqrtResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitProcessServiceImpl implements InitProcessService {

    @Autowired
    private InitProcessDao dao;

    @Override
    public CalculateResponse cal(CalculateRequest request) {
        return dao.cal(request);
    }
    @Override
    public CalculateSqrtResponse cal(CalculateSqrtRequest request) {
        return dao.cal(request);
    }
}
