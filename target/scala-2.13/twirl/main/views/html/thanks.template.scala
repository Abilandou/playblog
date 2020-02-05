
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

object thanks extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*1.46*/routes/*1.52*/.Assets.versioned("bootstrap/bootstrap.min.css")),format.raw/*1.100*/("""">
<script src=""""),_display_(/*2.15*/routes/*2.21*/.Assets.versioned("bootstrap/bootstrap.min.js")),format.raw/*2.68*/("""" crossorigin="anonymous"></script>

"""),_display_(/*4.2*/main("thanks")/*4.16*/{_display_(Seq[Any](format.raw/*4.17*/("""
	
		"""),format.raw/*6.3*/("""<div class="container mt-5 bg-primary text-white">
			<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-6">
				<h2>Thanks for contacting us</h2>
				<br/><br/><br/>
				<a href="contact" class="btn btn-success" >Back</a>
			</div>
			<div class="col-md-2"></div>
		
		</div>
	
""")))}),format.raw/*18.2*/("""

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-24T14:03:48.940
                  SOURCE: /home/computer/Desktop/Play/blog/app/views/thanks.scala.html
                  HASH: 28ba5fe0c0799d751ae4950d079d119d56188753
                  MATRIX: 1031->0|1102->45|1116->51|1185->99|1229->117|1243->123|1310->170|1375->210|1397->224|1435->225|1468->232|1811->545
                  LINES: 33->1|33->1|33->1|33->1|34->2|34->2|34->2|36->4|36->4|36->4|38->6|50->18
                  -- GENERATED --
              */
          