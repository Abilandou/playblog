
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

object singlePost extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Post,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(post: Post):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),_display_(/*3.2*/layout("Post| @post.id")/*3.26*/{_display_(Seq[Any](format.raw/*3.27*/("""
	
	"""),format.raw/*5.2*/("""<div class="row">
			<div class="col s12 m7">
			      <div class="card">
			        <div class="card-image">
			          
			          <span class="card-title">"""),_display_(/*10.40*/post/*10.44*/.title),format.raw/*10.50*/("""</span>
			        </div>
			        <div class="card-content">
			          <p>"""),_display_(/*13.18*/post/*13.22*/.description),format.raw/*13.34*/("""</p>
			        </div>
			        <a class="right" href="/posts">BACK</a>
			      </div>

			</div>
		</div>


""")))}))
      }
    }
  }

  def render(post:Post): play.twirl.api.HtmlFormat.Appendable = apply(post)

  def f:((Post) => play.twirl.api.HtmlFormat.Appendable) = (post) => apply(post)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-24T14:03:49.309674
                  SOURCE: /home/computer/Desktop/Play/blog/app/views/singlePost.scala.html
                  HASH: 350df738c256021b1b9ba61e58cd14660f5dcd65
                  MATRIX: 951->1|1058->13|1088->18|1120->42|1158->43|1190->49|1385->217|1398->221|1425->227|1536->311|1549->315|1582->327
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|42->10|42->10|42->10|45->13|45->13|45->13
                  -- GENERATED --
              */
          