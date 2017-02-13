
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object formularioNovoHotel_Scope0 {
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

class formularioNovoHotel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Hotel],play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(formulario: Form[Hotel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*5.27*/("""


"""),format.raw/*12.4*/("""
 
"""),_display_(/*15.2*/main("Welcome to Play")/*15.25*/ {_display_(Seq[Any](format.raw/*15.27*/("""
	"""),_display_(/*16.3*/helper/*16.9*/.form(routes.HotelController.salvaNovoHotel)/*16.53*/{_display_(Seq[Any](format.raw/*16.54*/("""
		"""),format.raw/*17.3*/("""<h1>Hoteis</h1>
		"""),_display_(/*18.4*/b3/*18.6*/.text(formulario("codigo"), '_label -> "Código:")),format.raw/*18.55*/("""
		"""),_display_(/*19.4*/b3/*19.6*/.text(formulario("cidade"),'_label -> "Cidade:")),format.raw/*19.54*/("""
		"""),_display_(/*20.4*/b3/*20.6*/.text(formulario("nome"), '_label -> "Nome:")),format.raw/*20.51*/("""
		"""),_display_(/*21.4*/b3/*21.6*/.submit('class -> "btn btn-primary")/*21.42*/ {_display_(Seq[Any](format.raw/*21.44*/(""" """),format.raw/*21.45*/("""Cadastrar """)))}),format.raw/*21.56*/("""

	""")))}),format.raw/*23.3*/("""	
""")))}))
      }
    }
  }

  def render(formulario:Form[Hotel]): play.twirl.api.HtmlFormat.Appendable = apply(formulario)

  def f:((Form[Hotel]) => play.twirl.api.HtmlFormat.Appendable) = (formulario) => apply(formulario)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object formularioNovoHotel extends formularioNovoHotel_Scope0.formularioNovoHotel
              /*
                  -- GENERATED --
                  DATE: Tue Jan 03 18:55:56 BRST 2017
                  SOURCE: C:/Users/ferna/Documents/Projetos/projeto-hu/app/views/formularioNovoHotel.scala.html
                  HASH: 7b093363b50629629d0cfbdb7af602a462fbaf2f
                  MATRIX: 870->99|1025->124|1058->328|1090->372|1122->395|1162->397|1192->401|1206->407|1259->451|1298->452|1329->456|1375->476|1385->478|1455->527|1486->532|1496->534|1565->582|1596->587|1606->589|1672->634|1703->639|1713->641|1758->677|1798->679|1827->680|1869->691|1905->697
                  LINES: 30->5|35->5|38->12|40->15|40->15|40->15|41->16|41->16|41->16|41->16|42->17|43->18|43->18|43->18|44->19|44->19|44->19|45->20|45->20|45->20|46->21|46->21|46->21|46->21|46->21|46->21|48->23
                  -- GENERATED --
              */
          