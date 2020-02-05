
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Post,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(post: Post):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*3.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*3.46*/routes/*3.52*/.Assets.versioned("materialize/css/materialize.min.css")),format.raw/*3.108*/("""">
<script src=""""),_display_(/*4.15*/routes/*4.21*/.Assets.versioned("materialize/js/materialize.min.js")),format.raw/*4.75*/("""" crossorigin="anonymous"></script>
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.versioned("javascripts/jquery-3.4.min.js")),format.raw/*5.71*/("""" crossorigin="anonymous"></script>
<script src=""""),_display_(/*6.15*/routes/*6.21*/.Assets.versioned("javascripts/main.js")),format.raw/*6.61*/("""" crossorigin="anonymous"></script>




"""),_display_(/*11.2*/main("Single Post")/*11.21*/{_display_(Seq[Any](format.raw/*11.22*/("""
"""),format.raw/*12.1*/("""<div class="container">
	<div class="row">
		<div class="col s12 m7">
			<div class="card">
			    <div class="card-image"> 
			       Image goes here
			    </div>
			    <div class="card-content">
			    	<p>Detail Information For:<b class="bold teal-text"> """),_display_(/*20.63*/post/*20.67*/.title),format.raw/*20.73*/("""</b></p>
			        <p>"""),_display_(/*21.16*/post/*21.20*/.description),format.raw/*21.32*/("""</p>
			    </div>
			    <div class="card-action">
			        <a href="/dashboard" class="right">BACK</a>
			    </div>
			</div>
		</div>
	</div>
</div>
""")))}),format.raw/*30.2*/("""
"""))
      }
    }
  }

  def render(post:Post): play.twirl.api.HtmlFormat.Appendable = apply(post)

  def f:((Post) => play.twirl.api.HtmlFormat.Appendable) = (post) => apply(post)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-24T14:03:48.610381
                  SOURCE: /home/computer/Desktop/Play/blog/app/views/show.scala.html
                  HASH: 385c24021ed400bce105053dd96e54b859cad760
                  MATRIX: 945->1|1052->13|1082->17|1153->62|1167->68|1244->124|1288->142|1302->148|1376->202|1453->253|1467->259|1537->309|1614->360|1628->366|1688->406|1760->452|1788->471|1827->472|1856->474|2152->743|2165->747|2192->753|2244->778|2257->782|2290->794|2485->959
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|43->11|43->11|43->11|44->12|52->20|52->20|52->20|53->21|53->21|53->21|62->30
                  -- GENERATED --
              */
          