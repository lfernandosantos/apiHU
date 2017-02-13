
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object formularioNovaDisponibilidade_Scope0 {
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

class formularioNovaDisponibilidade extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Disponibilidade],play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(formulario: Form[Disponibilidade]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*5.37*/("""


"""),format.raw/*12.4*/("""
 
"""),_display_(/*15.2*/main("Welcome to Play")/*15.25*/ {_display_(Seq[Any](format.raw/*15.27*/("""
	"""),_display_(/*16.3*/helper/*16.9*/.form(routes.DisponibilidadeController.salvaDisponibilidade)/*16.69*/{_display_(Seq[Any](format.raw/*16.70*/("""
		"""),format.raw/*17.3*/("""<h1>Disponibilidade</h1>
		"""),_display_(/*18.4*/b3/*18.6*/.text(formulario("hotel"), '_label -> "Hotel:")),format.raw/*18.53*/("""
		"""),_display_(/*19.4*/b3/*19.6*/.text(formulario("data"),'_label -> "Data:")),format.raw/*19.50*/("""
		"""),_display_(/*20.4*/b3/*20.6*/.text(formulario("disponibilidade"), '_label -> "disponibilidade:")),format.raw/*20.73*/("""
		"""),_display_(/*21.4*/b3/*21.6*/.text(formulario("minimoDeNoites"), '_label -> "minimoDeNoites:")),format.raw/*21.71*/("""
		"""),_display_(/*22.4*/b3/*22.6*/.submit('class -> "btn btn-primary")/*22.42*/ {_display_(Seq[Any](format.raw/*22.44*/(""" """),format.raw/*22.45*/("""Cadastrar """)))}),format.raw/*22.56*/("""

	""")))}),format.raw/*24.3*/("""	
""")))}))
      }
    }
  }

  def render(formulario:Form[Disponibilidade]): play.twirl.api.HtmlFormat.Appendable = apply(formulario)

  def f:((Form[Disponibilidade]) => play.twirl.api.HtmlFormat.Appendable) = (formulario) => apply(formulario)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object formularioNovaDisponibilidade extends formularioNovaDisponibilidade_Scope0.formularioNovaDisponibilidade
              /*
                  -- GENERATED --
                  DATE: Wed Jan 04 17:25:48 BRST 2017
                  SOURCE: C:/Users/ferna/Documents/Projetos/projeto-hu/app/views/formularioNovaDisponibilidade.scala.html
                  HASH: 7cfa06b19f36a8a9a8ae9b114fdc06ce52b77451
                  MATRIX: 900->99|1065->134|1098->338|1130->382|1162->405|1202->407|1232->411|1246->417|1315->477|1354->478|1385->482|1440->511|1450->513|1518->560|1549->565|1559->567|1624->611|1655->616|1665->618|1753->685|1784->690|1794->692|1880->757|1911->762|1921->764|1966->800|2006->802|2035->803|2077->814|2113->820
                  LINES: 30->5|35->5|38->12|40->15|40->15|40->15|41->16|41->16|41->16|41->16|42->17|43->18|43->18|43->18|44->19|44->19|44->19|45->20|45->20|45->20|46->21|46->21|46->21|47->22|47->22|47->22|47->22|47->22|47->22|49->24
                  -- GENERATED --
              */
          