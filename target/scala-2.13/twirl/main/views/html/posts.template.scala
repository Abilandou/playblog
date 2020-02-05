
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

object posts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Post],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(posts: List[Post]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.21*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/layout("Posts")/*6.17*/{_display_(Seq[Any](format.raw/*6.18*/("""

"""),format.raw/*8.1*/("""<div class="container-fluid">
	<div class="row">
		"""),_display_(/*10.4*/for(post <- posts) yield /*10.22*/ {_display_(Seq[Any](format.raw/*10.24*/("""
		"""),format.raw/*11.3*/("""<div class="row col s3 card hoverable" id="posts"  style="margin-left:25px;" >
            <div class="col-12">
                <div class="col s4">
                <div class="card-image waves-effect waves-block waves-light">
			        		<a type="submit"><img width="100px" height="200px" src=" product" class="img-fluid my-4"></a>
                </div>
                </div>
                <div class="col-sm-8">
                     <h2 class="card-title mt-4 text-darken-4" style="margin-left:50px;">"""),_display_(/*19.91*/post/*19.95*/.title),format.raw/*19.101*/("""</h2>
                    <div class="divider"></div>
                    <div class="col-sm-8 mt-2">
                        <p style="text-align:justify">"""),_display_(/*22.56*/post/*22.60*/.description),format.raw/*22.72*/("""</p>
                        """),_display_(/*23.26*/helper/*23.32*/.form(routes.PostController.singlePost((post.id)))/*23.82*/{_display_(Seq[Any](format.raw/*23.83*/("""
			        		"""),format.raw/*24.14*/("""<button type="submit"  class="btn btn-danger white-text pull-right my-4">View Details</button>
			        	""")))}),format.raw/*25.14*/("""
                    """),format.raw/*26.21*/("""</div>
                </div>
            </div>
        </div>
		""")))}),format.raw/*30.4*/("""
	"""),format.raw/*31.2*/("""</div>
</div>
""")))}),format.raw/*33.2*/("""


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
                  DATE: 2019-12-24T14:03:49.936284
                  SOURCE: /home/computer/Desktop/Play/blog/app/views/posts.scala.html
                  HASH: 1bf5298eef9efdcd8890ee6f8a70051373e5d82d
                  MATRIX: 952->3|1044->27|1089->22|1119->44|1147->47|1170->62|1208->63|1238->67|1318->121|1352->139|1392->141|1423->145|1967->662|1980->666|2008->672|2195->832|2208->836|2241->848|2299->879|2314->885|2373->935|2412->936|2455->951|2595->1060|2645->1082|2746->1153|2776->1156|2823->1173
                  LINES: 28->2|31->4|34->2|36->5|37->6|37->6|37->6|39->8|41->10|41->10|41->10|42->11|50->19|50->19|50->19|53->22|53->22|53->22|54->23|54->23|54->23|54->23|55->24|56->25|57->26|61->30|62->31|64->33
                  -- GENERATED --
              */
          