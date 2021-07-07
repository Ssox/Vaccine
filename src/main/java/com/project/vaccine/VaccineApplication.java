/*sites
* https://meucalendariodevacinas.com.br/
* https://portalarquivos2.saude.gov.br/images/campanhas/PNI/MS_PNI_Cartaz-Calendario-de-Vacinacao_64x46.pdf
* https://bvsms.saude.gov.br/bvs/publicacoes/cart_vac.pdf
* https://www.gov.br/saude/pt-br/assuntos/saude-de-a-a-z
*/

/* Initialize project
*  create postgres database with name vaccine
*
* */


package com.project.vaccine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.project.vaccine.model")
public class VaccineApplication {

	public static void main(String[] args) { SpringApplication.run(VaccineApplication.class, args); }

}
