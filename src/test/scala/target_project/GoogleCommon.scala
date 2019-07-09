package target_project


import org.openqa.selenium.WebDriver
import org.scalatestplus.selenium.WebBrowser

case class GoogleCommon(implicit wd: WebDriver) extends WebBrowser {


  val host = "https://www.google.com/"

  def goTop = {
    go.to(host)

  }

  def doLogin(loginId: String, pass: String) = {

    wd.manage.window.setSize(new org.openqa.selenium.Dimension(1371, 877))

    //  ログインロジックなど

    //  更新待ちとか
    //    val wait: WebDriverWait = new WebDriverWait(wd, 10)
    //    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("slow_element")))

  }

}
