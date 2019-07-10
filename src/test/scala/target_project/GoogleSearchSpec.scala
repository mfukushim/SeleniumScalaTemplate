package target_project


import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.openqa.selenium.{By, WebDriver}
import org.scalatest.{BeforeAndAfterAll, FlatSpec}
import org.scalatestplus.selenium.WebBrowser

class GoogleSearchSpec extends FlatSpec with WebBrowser with BeforeAndAfterAll {
  implicit val webDriver: WebDriver = new FirefoxDriver
  implicit val webBrowser: WebBrowser = this
  implicit val googlePage: GoogleCommon = new GoogleCommon


  "Google検索" should "検索出来る" in {

    googlePage.goTop

    textField(xpath("/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input")).value = "あきばこ工房"

    submit()

    //  検索結果ができあがるまで待ち
    new WebDriverWait(webDriver, 10)
      .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div/div/div[1]/a/h3")))

    //  sample succeeded
    assert(webDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div/div/div[1]/a/h3")).getText.contains("あきばこ工房"), "見つからない")

  }

  override def afterAll() = {
    quit()
  }

}
