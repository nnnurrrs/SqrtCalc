package kz.kazpost.webservices.calculate.dao;


import kz.kazpost.webservices.calculate.schema.CalculateRequest;
import kz.kazpost.webservices.calculate.schema.CalculateResponse;
import org.springframework.stereotype.Repository;

@Repository
public class InitProcessDaoImpl implements InitProcessDao {

	@Override
	public CalculateResponse cal(CalculateRequest request) {
		CalculateResponse response = new CalculateResponse();
		double a = request.getNum1();
		double b = request.getNum2();
		String oper = request.getOper();
		double result=0;
		switch (oper){
			case"+":
				result = a+b;
				break;
			case "-":
				result = a-b;
				break;
			case "*":
				result = a*b;
				break;
			case "/":
				result = a/b;
				break;
			case "%":
				result = a%b;
				break;
		}
		response.setResult(result);
		return  response;
	}

	@Override
	public CalculateSqrtResponse cal(CalculateSqrtRequest request) {
		CalculateSqrtResponse response = new CalculateSqrtResponse();
		double a = request.getNumber();
		a = Math.sqrt(a);
		double result;
		result = a;
		response.setResultSqrt(result);
		return  response;
	}
}