
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Post],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(postForm : Form[Post]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.25*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/adminLayout("Add Post")/*4.25*/{_display_(Seq[Any](format.raw/*4.26*/("""
	"""),format.raw/*5.2*/("""<div class="container">
		<div class="row" >
			<div class="col s2">
			</div>
			<div class="col s8">
				<div class="card" >
					<div class="card-panel teal">
						<h5 class="white-text center">ADD POST</h5>
					</div>
					"""),_display_(/*14.7*/helper/*14.13*/.form(action = routes.PostController.store(), Symbol("enctype") -> "multipart/form-data")/*14.102*/{_display_(Seq[Any](format.raw/*14.103*/("""
						"""),_display_(/*15.8*/helper/*15.14*/.CSRF.formField),format.raw/*15.29*/("""

						"""),format.raw/*17.7*/("""<div class="card-content" >
							<div class="input-field">
								"""),_display_(/*19.10*/helper/*19.16*/.inputText(postForm("title"))),format.raw/*19.45*/("""
							"""),format.raw/*20.8*/("""</div>

							<div class="input-field">
								"""),_display_(/*23.10*/helper/*23.16*/.textarea(postForm("description"))),format.raw/*23.50*/("""
							"""),format.raw/*24.8*/("""</div>
							<div>
								<button style="margin-bottom: 30px;" type="submit" class="btn blue right">Post</button>
							</div>
						</div>

					""")))}),format.raw/*30.7*/("""
				"""),format.raw/*31.5*/("""</div>
			</div>
			<div class="col s2">
			</div>
		</div>
	</div>
""")))}),format.raw/*37.2*/("""


	"""))
      }
    }
  }

  def render(postForm:Form[Post]): play.twirl.api.HtmlFormat.Appendable = apply(postForm)

  def f:((Form[Post]) => play.twirl.api.HtmlFormat.Appendable) = (postForm) => apply(postForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-24T14:03:53.798192
                  SOURCE: /home/computer/Desktop/Play/blog/app/views/create.scala.html
                  HASH: a739d481d9e098b4490874496e4b0d9bba066d78
                  MATRIX: 953->1|1049->27|1094->24|1122->44|1150->47|1181->70|1219->71|1248->74|1513->313|1528->319|1627->408|1667->409|1702->418|1717->424|1753->439|1790->449|1889->521|1904->527|1954->556|1990->565|2070->618|2085->624|2140->658|2176->667|2362->823|2395->829|2500->904
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|46->14|46->14|46->14|46->14|47->15|47->15|47->15|49->17|51->19|51->19|51->19|52->20|55->23|55->23|55->23|56->24|62->30|63->31|69->37
                  -- GENERATED --
              */
          