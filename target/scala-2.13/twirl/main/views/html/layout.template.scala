
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

object layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(body: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
	<title>"""),_display_(/*5.10*/title),format.raw/*5.15*/("""</title>


<link rel="stylesheet" media="screen" href=""""),_display_(/*8.46*/routes/*8.52*/.Assets.versioned("materialize/css/materialize.min.css")),format.raw/*8.108*/("""">
<script src=""""),_display_(/*9.15*/routes/*9.21*/.Assets.versioned("materialize/js/materialize.min.js")),format.raw/*9.75*/("""" crossorigin="anonymous"></script>
<script src=""""),_display_(/*10.15*/routes/*10.21*/.Assets.versioned("javascripts/jquery-3.4.1.min.js")),format.raw/*10.73*/("""" crossorigin="anonymous"></script>
<script src=""""),_display_(/*11.15*/routes/*11.21*/.Assets.versioned("javascripts/main.js")),format.raw/*11.61*/("""" crossorigin="anonymous"></script>



	<div class="navbar-fixed">
	<nav class="teal">
    <div class="nav-wrapper">
      <a href="/" class="brand-logo">BLOGPOST</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="/">Home</a></li>
        <li><a href="/posts">Posts</a></li>
        <li><a href="/login">Login</a></li>
      </ul>
    </div>
  </nav>
</div>
</head>
<body>

	"""),_display_(/*30.3*/body),format.raw/*30.7*/("""


	"""),format.raw/*33.2*/("""<footer class="page-footer black">
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
                  DATE: 2019-12-24T14:03:49.115596
                  SOURCE: /home/computer/Desktop/Play/blog/app/views/layout.scala.html
                  HASH: c2962b3c056c3eb80f6fb80fb5bca4f3ba869d09
                  MATRIX: 954->1|1076->28|1104->30|1172->72|1197->77|1282->136|1296->142|1373->198|1417->216|1431->222|1505->276|1583->327|1598->333|1671->385|1749->436|1764->442|1825->482|2282->913|2306->917|2340->924
                  LINES: 28->1|33->1|34->2|37->5|37->5|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|62->30|62->30|65->33
                  -- GENERATED --
              */
          