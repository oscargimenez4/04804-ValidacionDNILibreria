/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public final class App {

    

    public final void launchApp() {
        System.out.println("VALIDACIÓN DE DNI");
        System.out.println("=================");

        System.out.printf("DNI ......: %d%c%n", UtilesPrimitivos.DNI_NUM, UtilesPrimitivos.DNI_CTR);
        System.out.println("---");

        boolean dniOK = UtilesPrimitivos.validar(UtilesPrimitivos.DNI_NUM, UtilesPrimitivos.DNI_CTR);
        System.out.printf("Validez ..: %s%n", dniOK ? "Correcto" : "Incorrecto");
    }

}
