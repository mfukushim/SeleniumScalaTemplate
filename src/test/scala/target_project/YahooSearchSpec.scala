package target_project

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.{By, WebDriver}
import org.scalatest.{BeforeAndAfter, BeforeAndAfterAll, FlatSpec}
import org.scalatestplus.selenium.WebBrowser

class YahooSearchSpec extends FlatSpec with WebBrowser with BeforeAndAfterAll {
  implicit val webDriver: WebDriver = new FirefoxDriver
  implicit val webBrowser: WebBrowser = this
  implicit val yahooPage: YahooCommon = new YahooCommon


  "Yahoo検索" should "検索出来る" in {

    yahooPage.goTop

    textField(cssSelector("#srchtxt")).value = "akibakokoubou"

    click on cssSelector("#srchbtn")


    //  sample error
    assert(webDriver.findElement(By.cssSelector("div.w:nth-child(1) > div:nth-child(1) > h3:nth-child(1) > a:nth-child(1)")).getText.contains("あきばこ工房"), "見つからない")

    quit()
  }

  override protected def afterAll(): Unit = {
    super.afterAll()
    quit()
  }
}
