package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerClass implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 2; // Number of retry attempts

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            System.out.println("Retrying test: " + result.getName() + " | Attempt " + retryCount);
            return true;  // Retry test
        }
        return false;  // Stop retrying
    }
}
