
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registerForm: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),_display_(/*4.2*/adminLayout("Register")/*4.25*/{_display_(Seq[Any](format.raw/*4.26*/("""
	"""),format.raw/*5.2*/("""<div class="container">
		<div class="row" >
			<div class="col s2">
			</div>
			<div class="col s8">
				<div class="card" >
					<div class="card-panel teal">
						<h5 class="white-text center bold">ADD NEW USER</h5>
					</div>
					"""),_display_(/*14.7*/helper/*14.13*/.form(action = routes.AuthController.validateRegistration())/*14.73*/{_display_(Seq[Any](format.raw/*14.74*/("""
						"""),_display_(/*15.8*/helper/*15.14*/.CSRF.formField),format.raw/*15.29*/("""

						"""),format.raw/*17.7*/("""<div class="card-content" >
							<input type="hidden" name="admin" value="1">
							<div class="input-field">
								"""),_display_(/*20.10*/helper/*20.16*/.inputText(registerForm("name"))),format.raw/*20.48*/("""
							"""),format.raw/*21.8*/("""</div>
							<div class="input-field">
								"""),_display_(/*23.10*/helper/*23.16*/.inputText(registerForm("email"))),format.raw/*23.49*/("""
							"""),format.raw/*24.8*/("""</div>

							<div class="input-field">
								"""),_display_(/*27.10*/helper/*27.16*/.inputPassword(registerForm("password"))),format.raw/*27.56*/("""
							"""),format.raw/*28.8*/("""</div>
							<div>
								<button style="margin-bottom: 10px;" type="submit" class="btn blue right">Register</button>
							</div>
						</div>

					""")))}),format.raw/*34.7*/("""
					"""),format.raw/*35.6*/("""<div><a  href="/dashboard">BACK TO DASHBOARD</a></div>
				</div>
			</div>
			<div class="col s2">
			</div>
		</div>
	</div>
""")))}),format.raw/*42.2*/("""
"""))
      }
    }
  }

  def render(registerForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(registerForm)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (registerForm) => apply(registerForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-24T14:03:52.786273
                  SOURCE: /home/computer/Desktop/Play/blog/app/views/register.scala.html
                  HASH: 4e76c5897a033889d6bc1df7713be8fd79ae187c
                  MATRIX: 955->1|1075->28|1103->31|1134->54|1172->55|1200->57|1465->296|1480->302|1549->362|1588->363|1622->371|1637->377|1673->392|1708->400|1857->522|1872->528|1925->560|1960->568|2036->617|2051->623|2105->656|2140->664|2217->714|2232->720|2293->760|2328->768|2512->922|2545->928|2703->1056
                  LINES: 28->1|33->2|35->4|35->4|35->4|36->5|45->14|45->14|45->14|45->14|46->15|46->15|46->15|48->17|51->20|51->20|51->20|52->21|54->23|54->23|54->23|55->24|58->27|58->27|58->27|59->28|65->34|66->35|73->42
                  -- GENERATED --
              */
          