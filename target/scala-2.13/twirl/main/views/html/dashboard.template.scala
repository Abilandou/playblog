
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

object dashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Post],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(posts: List[Post]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.21*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/adminLayout("Admin Dashboard")/*5.32*/{_display_(Seq[Any](format.raw/*5.33*/("""
	
	"""),format.raw/*7.2*/("""<div class="container">
		<div class="row" >
			<h1>"""),_display_(/*9.9*/posts/*9.14*/.size()),format.raw/*9.21*/(""" """),format.raw/*9.22*/("""post(s)</h1>
			<a href="posts/create"><button class="btn btn-primary btn-mini my-4" style="margin-left: 600px;" title="Add New Post">Add New</button></a>
			<table class="table striped highlight responsive-table table-bordered" >
				<thead>
					<tr>
						<th>#</th>
						<th>Title</th>
						<th>Description</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					"""),_display_(/*21.7*/for(post <- posts) yield /*21.25*/ {_display_(Seq[Any](format.raw/*21.27*/("""
						"""),format.raw/*22.7*/("""<tr>
							<td>"""),_display_(/*23.13*/post/*23.17*/.id),format.raw/*23.20*/("""</td>
							<td>"""),_display_(/*24.13*/post/*24.17*/.title),format.raw/*24.23*/("""</td>
							<td>"""),_display_(/*25.13*/post/*25.17*/.description),format.raw/*25.29*/("""</td>
							<td>
								"""),_display_(/*27.10*/helper/*27.16*/.form(routes.PostController.show(post.id))/*27.58*/ {_display_(Seq[Any](format.raw/*27.60*/("""
				                    """),format.raw/*28.25*/("""<input type="submit" title="View Details" class="btn" value="View">
				                """)))}),format.raw/*29.22*/("""

				                """),_display_(/*31.22*/helper/*31.28*/.form(routes.PostController.edit(post.id))/*31.70*/ {_display_(Seq[Any](format.raw/*31.72*/("""
									"""),format.raw/*32.10*/("""<input type="submit" title="Edit Post" class="btn blue" value="Edit">
								""")))}),format.raw/*33.10*/("""
								"""),_display_(/*34.10*/helper/*34.16*/.form(routes.PostController.destroy(post.id))/*34.61*/ {_display_(Seq[Any](format.raw/*34.63*/("""
								 	"""),_display_(/*35.12*/helper/*35.18*/.CSRF.formField),format.raw/*35.33*/("""
				                    """),format.raw/*36.25*/("""<input type="submit" title="Delete Post" id="delete-record" class="btn red" value="Delete">
				                """)))}),format.raw/*37.22*/("""
							"""),format.raw/*38.8*/("""</td>
						</tr>
					""")))}),format.raw/*40.7*/("""
				"""),format.raw/*41.5*/("""</tbody>
			</table>
		</div>
	</div>
    
	
""")))}),format.raw/*47.2*/("""


"""))
      }
    }
  }

  def render(posts:List[Post]): play.twirl.api.HtmlFormat.Appendable = apply(posts)

  def f:((List[Post]) => play.twirl.api.HtmlFormat.Appendable) = (posts) => apply(posts)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-24T14:03:51.180047
                  SOURCE: /home/computer/Desktop/Play/blog/app/views/dashboard.scala.html
                  HASH: bc05314998f3776ed0b757a3e0b2b6ddd6c2f7b3
                  MATRIX: 956->3|1048->25|1093->22|1121->42|1149->45|1187->75|1225->76|1257->82|1337->137|1350->142|1377->149|1405->150|1826->545|1860->563|1900->565|1935->573|1980->591|1993->595|2017->598|2063->617|2076->621|2103->627|2149->646|2162->650|2195->662|2251->691|2266->697|2317->739|2357->741|2411->767|2532->857|2584->882|2599->888|2650->930|2690->932|2729->943|2840->1023|2878->1034|2893->1040|2947->1085|2987->1087|3027->1100|3042->1106|3078->1121|3132->1147|3277->1261|3313->1270|3369->1296|3402->1302|3484->1354
                  LINES: 28->2|31->3|34->2|35->4|36->5|36->5|36->5|38->7|40->9|40->9|40->9|40->9|52->21|52->21|52->21|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|58->27|58->27|58->27|58->27|59->28|60->29|62->31|62->31|62->31|62->31|63->32|64->33|65->34|65->34|65->34|65->34|66->35|66->35|66->35|67->36|68->37|69->38|71->40|72->41|78->47
                  -- GENERATED --
              */
          