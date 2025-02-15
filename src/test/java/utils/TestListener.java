package utils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        result.getMethod().setRetryAnalyzerClass(RetryAnalyzerClass.class);  // ✅ Apply retry logic
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("All tests completed.");
    }

}
