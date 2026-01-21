package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {//abstract method-retry
	int counter = 0;
	int retryLimit = 2;

	public boolean retry(ITestResult result) {//itstresult-interface

		if (counter < retryLimit) {
			counter++;
			return true;
		}
		return false;
	}

}
