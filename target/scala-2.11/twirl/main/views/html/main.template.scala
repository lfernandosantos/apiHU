
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
       
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*8.112*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">
     
      	
    </head>
    <body>
	    <header class="navbar navbar-default">
	        <div class="container" role="presentation">
	            <ul class="nav navbar-nav navbar-right">
	            	<li><a href=""""),_display_(/*17.29*/routes/*17.35*/.HotelController.formularioNovoHotel),format.raw/*17.71*/("""">Novo Hotel</a></li>  
	            </ul>
	            <ul class="nav navbar-nav navbar-right">
	                <li><a href=""""),_display_(/*20.32*/routes/*20.38*/.DisponibilidadeController.formularioNovaDisponibilidade),format.raw/*20.94*/("""">Disponibilidade</a></li>
	            </ul>
	            <ul class="nav navbar-nav navbar-right">
	                <li><a href=""""),_display_(/*23.32*/routes/*23.38*/.HotelController.salvaDados),format.raw/*23.65*/("""">Home</a></li>
	            </ul>
	          
	        </div>
	    </header>
	    <main class="container">
        """),_display_(/*29.10*/content),format.raw/*29.17*/("""
        """),format.raw/*30.9*/("""</main> 
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Jan 05 19:55:33 BRST 2017
                  SOURCE: C:/Users/ferna/Documents/Projetos/projeto-hu/app/views/main.scala.html
                  HASH: e2a6e6c1c79ead4486ca69cf6ca7ba2973f10da6
                  MATRIX: 748->1|873->31|900->32|994->100|1019->105|1184->244|1198->250|1271->302|1358->363|1372->369|1432->408|1678->627|1693->633|1750->669|1905->797|1920->803|1997->859|2155->990|2170->996|2218->1023|2362->1140|2390->1147|2426->1156
                  LINES: 27->1|32->1|33->2|37->6|37->6|39->8|39->8|39->8|40->9|40->9|40->9|48->17|48->17|48->17|51->20|51->20|51->20|54->23|54->23|54->23|60->29|60->29|61->30
                  -- GENERATED --
              */
          