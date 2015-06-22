import org.openqa.selenium.chrome.ChromeDriver

driver = {
    File file = new File("C:/Users/danie_000/Desktop/ResS/chromedrivers/chromedriver.exe");
    System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
    new ChromeDriver();
}

baseUrl = "http://localhost:8070/"