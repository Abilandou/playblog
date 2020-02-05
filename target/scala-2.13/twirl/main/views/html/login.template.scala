
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Auth],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm : Form[Auth]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.26*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.versioned("materialize/css/materialize.min.css")),format.raw/*4.108*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(/*5.46*/routes/*5.52*/.Assets.versioned("stylesheets/main.css")),format.raw/*5.93*/("""">
<script src=""""),_display_(/*6.15*/routes/*6.21*/.Assets.versioned("materialize/js/materialize.min.js")),format.raw/*6.75*/("""" crossorigin="anonymous"></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.versioned("javascripts/jquery-3.4.1.min.js")),format.raw/*7.73*/("""" crossorigin="anonymous"></script>
<script src=""""),_display_(/*8.15*/routes/*8.21*/.Assets.versioned("javascripts/adminMain.js")),format.raw/*8.66*/("""" crossorigin="anonymous"></script>



"""),_display_(/*12.2*/main("Admin Login")/*12.21*/{_display_(Seq[Any](format.raw/*12.22*/("""
	"""),format.raw/*13.2*/("""<div class="container">
		<div class="row" >
			<div class="col s2">
			</div>
			<div class="col s8">
				<div class="card" >
					<div class="card-panel teal">
						<h5 class="white-text center bold">ADMIN LOGIN</h5>
					</div>
					<div>"""),_display_(/*22.12*/flash/*22.17*/.get("error")),format.raw/*22.30*/("""</div>
					"""),_display_(/*23.7*/helper/*23.13*/.form(action = routes.AuthController.auth())/*23.57*/{_display_(Seq[Any](format.raw/*23.58*/("""
						"""),_display_(/*24.8*/helper/*24.14*/.CSRF.formField),format.raw/*24.29*/("""

						"""),format.raw/*26.7*/("""<div class="card-content" >
							<div class="input-field">
								"""),_display_(/*28.10*/helper/*28.16*/.inputText(loginForm("email"))),format.raw/*28.46*/("""
							"""),format.raw/*29.8*/("""</div><br><br>

							<div class="input-field">
								"""),_display_(/*32.10*/helper/*32.16*/.inputPassword(loginForm("password"))),format.raw/*32.53*/("""
							"""),format.raw/*33.8*/("""</div><br><br>
							<div>
								<button style="margin-bottom: 10px;" type="submit" class="btn blue right">Login</button>
							</div>
						</div>

					""")))}),format.raw/*39.7*/("""
					"""),format.raw/*40.6*/("""<div><a  href="/">BACK TO HOME</a></div>
				</div>
			</div>
			<div class="col s2">
			</div>
		</div>
	</div>
""")))}),format.raw/*47.2*/("""


	"""))
      }
    }
  }

  def render(loginForm:Form[Auth]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[Auth]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-24T16:11:40.487447
                  SOURCE: /home/computer/Desktop/Play/blog/app/views/login.scala.html
                  HASH: 83fd7b3d02993496d91c1a21f42b9a95976fa782
                  MATRIX: 952->1|1049->28|1094->25|1122->45|1150->47|1221->92|1235->98|1312->154|1387->203|1401->209|1462->250|1506->268|1520->274|1594->328|1671->379|1685->385|1757->437|1834->488|1848->494|1913->539|1983->583|2011->602|2050->603|2080->606|2359->858|2373->863|2407->876|2447->890|2462->896|2515->940|2554->941|2589->950|2604->956|2640->971|2677->981|2776->1053|2791->1059|2842->1089|2878->1098|2966->1159|2981->1165|3039->1202|3075->1211|3270->1376|3304->1383|3455->1504
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|44->12|44->12|44->12|45->13|54->22|54->22|54->22|55->23|55->23|55->23|55->23|56->24|56->24|56->24|58->26|60->28|60->28|60->28|61->29|64->32|64->32|64->32|65->33|71->39|72->40|79->47
                  -- GENERATED --
              */
          