package target_project

import org.openqa.selenium.WebDriver
import org.scalatestplus.selenium.WebBrowser

case class YahooCommon(implicit wd: WebDriver) extends WebBrowser {


  val host = "https://www.yahoo.co.jp/"

  def goTop = {
    go.to(host)

  }

  def doLogin(loginId: String, pass: String) = {

    wd.manage.window.setSize(new org.openqa.selenium.Dimension(1371, 877))

    //  ログインロジックなど
  }

}
