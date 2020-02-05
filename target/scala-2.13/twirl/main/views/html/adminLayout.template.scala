
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

object adminLayout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(body: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
	<title>"""),_display_(/*6.10*/title),format.raw/*6.15*/("""</title>

  <link rel="stylesheet" media="screen" href=""""),_display_(/*8.48*/routes/*8.54*/.Assets.versioned("materialize/css/materialize.min.css")),format.raw/*8.110*/("""">
  <link rel="stylesheet" media="screen" href=""""),_display_(/*9.48*/routes/*9.54*/.Assets.versioned("css/main.css")),format.raw/*9.87*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(/*10.46*/routes/*10.52*/.Assets.versioned("stylesheets/main.css")),format.raw/*10.93*/("""">
<script src=""""),_display_(/*11.15*/routes/*11.21*/.Assets.versioned("materialize/js/materialize.min.js")),format.raw/*11.75*/("""" crossorigin="anonymous"></script>
<script src=""""),_display_(/*12.15*/routes/*12.21*/.Assets.versioned("javascripts/jquery-3.4.1.min.js")),format.raw/*12.73*/("""" crossorigin="anonymous"></script>
<script src=""""),_display_(/*13.15*/routes/*13.21*/.Assets.versioned("javascripts/adminMain.js")),format.raw/*13.66*/("""" crossorigin="anonymous"></script>


	<div class="navbar-fixed">
	<nav class="black">
    <div class="nav-wrapper">
      <a href="/dashboard" class="brand-logo">DashBoard</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="/">Home</a></li>
        <li><a href="/dashboard">Posts</a></li>
        <li><a href="/register">Add User</a></li>
        <li><a href="/login">Logout</a></li>
      </ul>
    </div>
  </nav>
        
</div>
</head>
<body>

	"""),_display_(/*33.3*/body),format.raw/*33.7*/("""

  """),format.raw/*35.3*/("""<script type="text/javascript">
    $(document).ready(function()"""),format.raw/*36.33*/("""{"""),format.raw/*36.34*/("""
    """),format.raw/*37.5*/("""$('.sidenav').sidenav();
  """),format.raw/*38.3*/("""}"""),format.raw/*38.4*/(""");

      document.addEventListener('DOMContentLoaded', function() """),format.raw/*40.64*/("""{"""),format.raw/*40.65*/("""
    """),format.raw/*41.5*/("""var elems = document.querySelectorAll('.sidenav');
    var instances = M.Sidenav.init(elems, draggable);
  """),format.raw/*43.3*/("""}"""),format.raw/*43.4*/(""");
  </script>



  <footer class="page-footer">
          <div class="container">
            <div class="row">
              <div class="col l6 s12">
                <h5 class="white-text">Footer Content Here</h5>
              </div>
            </div>
          </div>
          <div class="footer-copyright">
            <div class="container">
            © 2019 All Rights Reserved
            <a class="grey-text text-lighten-4 right" href="#!">something</a>
            </div>
          </div>
        </footer>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,body:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(body)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (body) => apply(title)(body)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-24T15:52:36.201670
                  SOURCE: /home/computer/Desktop/Play/blog/app/views/adminLayout.scala.html
                  HASH: bdad920a7b3e17094038baa20c11303fc80cbccb
                  MATRIX: 959->1|1081->28|1111->32|1179->74|1204->79|1289->138|1303->144|1380->200|1457->251|1471->257|1524->290|1600->339|1615->345|1677->386|1722->404|1737->410|1812->464|1890->515|1905->521|1978->573|2056->624|2071->630|2137->675|2669->1181|2693->1185|2726->1191|2819->1256|2848->1257|2881->1263|2936->1291|2964->1292|3061->1361|3090->1362|3123->1368|3259->1477|3287->1478
                  LINES: 28->1|33->1|35->3|38->6|38->6|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|65->33|65->33|67->35|68->36|68->36|69->37|70->38|70->38|72->40|72->40|73->41|75->43|75->43
                  -- GENERATED --
              */
          