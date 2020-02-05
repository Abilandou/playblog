
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Post],Post,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(postForm : Form[Post], post: Post):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.37*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/adminLayout("Update Post")/*4.28*/{_display_(Seq[Any](format.raw/*4.29*/("""
	
	"""),format.raw/*6.2*/("""<div class="container">
		<div class="row" >
			<div class="col s2">
			</div>
			<div class="col s8">
				<div class="card" >
					<div class="card-panel">
						<h3 class="teal-text center">Update Post</h3>
					</div>
					"""),_display_(/*15.7*/helper/*15.13*/.form(action = routes.PostController.update(post.id))/*15.66*/{_display_(Seq[Any](format.raw/*15.67*/("""
						"""),_display_(/*16.8*/helper/*16.14*/.CSRF.formField),format.raw/*16.29*/("""
						"""),format.raw/*17.7*/("""<div class="card-content" >
							<div class="input-field">
								
									<input type="text" value=""""),_display_(/*20.37*/post/*20.41*/.title),format.raw/*20.47*/("""" name="title"data-length="100" required="">
								<label for="title" >Post Title:</label>
							</div><br><br>

							<div class="input-field">
								
									<textarea name="description" required="" data-length="300" >"""),_display_(/*26.71*/post/*26.75*/.description),format.raw/*26.87*/("""</textarea>
								<label for="description" >Post Description:</label>
							</div><br><br>
							<div>
								<button type="submit" class="btn blue right">Update</button>
							</div>
						</div>

					""")))}),format.raw/*34.7*/("""
				"""),format.raw/*35.5*/("""</div>
			</div>
			<div class="col s2">
			</div>
		</div>
	</div>
""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(postForm:Form[Post],post:Post): play.twirl.api.HtmlFormat.Appendable = apply(postForm,post)

  def f:((Form[Post],Post) => play.twirl.api.HtmlFormat.Appendable) = (postForm,post) => apply(postForm,post)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-24T14:03:49.682748
                  SOURCE: /home/computer/Desktop/Play/blog/app/views/edit.scala.html
                  HASH: 91cd68ca795ac54be20cf17c15d4528bff2d9d6d
                  MATRIX: 956->1|1064->39|1109->36|1137->56|1165->59|1199->85|1237->86|1269->92|1531->328|1546->334|1608->387|1647->388|1682->397|1697->403|1733->418|1768->426|1904->535|1917->539|1944->545|2205->779|2218->783|2251->795|2499->1013|2532->1019|2637->1094
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|38->6|47->15|47->15|47->15|47->15|48->16|48->16|48->16|49->17|52->20|52->20|52->20|58->26|58->26|58->26|66->34|67->35|73->41
                  -- GENERATED --
              */
          