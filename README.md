

# Sistema Punto de Venta Zapatería Cachorros🐶

[TOC]

## Introducción

### Descripción del proyecto

​	En este documento describe la implementación de la metodología pesada-ligera ICONIX en la empresa de zapatos “Cachorros” para el desarrollo del proyecto “Cachorros app”. Incluye junto con la descripción de este ciclo de vida iterativo e incremental para el proyecto, los artefactos o documentos con los que se gestionan las tareas de adquisición y suministro: requisitos, monitorización y seguimiento del avance, así como las responsabilidades y compromisos de los participantes en el proyecto.

### Antecedentes

​	En los últimos 15 años ha existido una administración muy pobre en la zapatería cachorros, por lo tanto, el manejo del inventario, registro de ventas y gastos de la empresa es muy burdo puesto que se sigue la misma estrategia. 

​	En la actualidad el uso de un Punto de venta (POS) en una empresa genera un mejor rendimiento, los comerciantes pueden rastrear no solo sus ventas, sino también los niveles de inventario, ingresos brutos, márgenes de ganancias, patrones de ventas y una gran cantidad de otros puntos de datos.

### Definición del problema

​	Actualmente la gestión de la zapatería cachorros se realizan a mano lo que implica que se realice de manera ineficiente.

​	Sin duda puede provocar diversos problemas en la empresa, puesto que cualquiera podría acceder a estos datos sin ningún problema y todo se realiza de manera lenta. Otro aspecto importante es sobre los datos del personal, ya que no cuentan con ningún registro de estos datos.

### Objetivos Generales y Específicos

**Objetivo general:**

“Entregar un sistema usable para el personal de la zapatería cachorros”.

**Objetivos específicos:**

- Revisar el comportamiento de los diferentes usuarios ante el sistema.
- Diseñar una interfaz amigable para el usuario.
- Enfocar los aspectos que el cliente desea, y no agregar extras al sistema.
- Realizar pruebas de usabilidad.

### Justificación

Tras la problemática planteada se pretende la elaboración de un Punto de venta (POS) con la finalidad de agilizar las actividades tanto de los empleados como del propietario(a).

### Metodología empleada(ICONIX)

#### Descripción

Las principales razones del uso de un ciclo de desarrollo iterativo e incremental para la ejecución de este proyecto son:

- Sistema modular. Las características del sistema Cachorros app permiten desarrollar una base funcional mínima y sobre ella ir incrementando las funcionalidades o modificando el comportamiento o apariencia de las ya implementadas.
- Entregas frecuentes y continuas al cliente de los módulos terminados, de forma que puede disponer de una funcionalidad básica en un tiempo mínimo y a partir de ahí un incremento y mejora continua del sistema.
- Previsible inestabilidad de requisitos.
- Es posible que el sistema incorpore más funcionalidades de las inicialmente identificadas.
- Es posible que durante la ejecución del proyecto se altere el orden en el que se desean recibir los módulos.
- Para el cliente resulta difícil precisar cuál será la dimensión completa del sistema, y su crecimiento puede continuarse en el tiempo suspenderse o detenerse.
- El mantenimiento del sistema ante una visión de mejora en las funcionalidades actuales.

#### Cronograma de las etapas

| 1° Análisis de requerimientos  | 2° Análisis y diseño preliminar              | 3° Diseño                   | 4° Implementación           |
| ------------------------------ | -------------------------------------------- | --------------------------- | --------------------------- |
| Contexto                       | Diagrama de C.U                              | Diagrama de despliegue      | Plan general de prueba      |
| Clases de Usuarios             | Diagrama de Dominio                          | Arquitectura empleada       | Procedimiento de prueba     |
| Requerimientos funcionales     | Descripción de CU o diagrama de actividades. | Código por cada caso de uso | Casos de prueba             |
| Requerimientos no funcionales  | Diseño de interfaces.                        |                             | Resultado final del sistema |
| Glosario                       | Diagrama de Secuencia                        |                             |                             |
| Casos de uso identificados     | Diagrama de robustez                         |                             |                             |
| Revisión de los requerimientos | Modelo de datos                              |                             |                             |
|                                | Diagrama de clases                           |                             |                             |
|                                | Modelo de arquitectura                       |                             |                             |

#### Actividades realizadas en la primera iteración

| Integrante del equipo                            | Alexis Julian Velázquez Nava | Angel Emmanuel Hernandez Gonzalez | Alejandro Jesús Pedraza Viveros | Carlos Daniel Rodríguez Ramírez | Luis ángel Gracia Arellano |
| ------------------------------------------------ | ---------------------------- | --------------------------------- | ------------------------------- | ------------------------------- | -------------------------- |
| **Caso de Uso<br />(Diagramas y Funcionalidad)** | 2                            | 1                                 | 6                               | 5                               | 4                          |
| **Fecha de entrega**                             | 25 Marzo-20 Abril            | 25 Marzo-20 Abril                 | 25 Marzo-20 Abril               | 25 Marzo-20 Abril               | 25 Marzo-20 Abril          |

#### Actividades realizadas en la segunda iteración

| Integrante del equipo                       | Alexis Julian Velázquez Nava | Angel Emmanuel Hernandez Gonzalez | Alejandro Jesús Pedraza Viveros | Carlos Daniel Rodríguez Ramírez | Luis ángel Gracia Arellano |
| ------------------------------------------- | ---------------------------- | --------------------------------- | ------------------------------- | ------------------------------- | -------------------------- |
| **Caso de Uso (Diagramas y Funcionalidad)** | 12                           | 7                                 | 15                              | 13                              | 8                          |
| **Fecha de entrega**                        | 26 Abril- 4 Mayo             | 26 Abril- 4 Mayo                  | 26 Abril- 4 Mayo                | 26 Abril- 4 Mayo                | 26 Abril- 4 Mayo           |

#### Actividades realizadas en la tercera iteración

| Integrante del equipo                       | Alexis Julian Velázquez Nava | Angel Emmanuel Hernandez Gonzalez | Alejandro Jesús Pedraza Viveros | Carlos Daniel Rodríguez Ramírez | Luis ángel Gracia Arellano |
| ------------------------------------------- | ---------------------------- | --------------------------------- | ------------------------------- | ------------------------------- | -------------------------- |
| **Caso de Uso (Diagramas y Funcionalidad)** | 14 y 13                      | 9 y 3                             | 16 y 3                          | 10 y 3                          | 11 y 3                     |
| **Fecha de entrega**                        | 8 Junio - 10 junio           | 8 Junio - 10 junio                | 8 Junio - 10 junio              | 8 Junio - 10 junio              | 8 Junio - 10 junio         |

## Requerimientos

### Contexto

La zapatería cachorros desea implementar un sistema para sus empleados con el objetivo de agilizar el registro e inventario del calzado que entra a la tienda, así como generar tickets que generen mayor confianza en los clientes. Mientras que, por la parte interna de la sucursal, llevar un control de los pagos realizados y por realizar de cada cliente dentro del sistema se implementará la opción de registrar una devolución no mayor a 8 días del día de compra. 

El sistema deberá aportar cualidades a los objetos cómo:

Calzado:

- El calzado contará con modelo, marca, color, número/talla, precio, fecha de registro del inventario y se identificará con un código numérico de 5 dígitos.

 

Trabajador:

- El trabajador contará con un nombre, edad, dirección de hogar, cargo y un identificador de trabajador.
- El trabajador encargado realizará un corte de caja cada que la tienda cierre por medio de los registros de venta del día.
- El trabajador encargado registrará el calzado nuevo en inventario con su respectiva descripción. 
- El trabajador encargado podrá registrar una devolución si esta venta fue realizada dentro de los 8 días anteriores a la fecha actual. 
- El trabajador deberá registrar su hora de entrada y salida en la sucursal.

 

Propietario:

- Se podrá logear en el apartado de inventario.
- Verificará la venta del día y la descripción de los calzados que se vendieron.
- Verificará los productos en inventario.
- Eliminará productos del inventario.
- Agregara productos al inventario
- Registrará empleados en el sistema.
- Eliminará empleados del sistema

### Clases de Usuarios

1. Usuario para el propietario
   - Será utilizado por la dueña de la zapatería.
2. Usuario para empleado encargado.
   - Será utilizado por el encargado de la sucursal.
3. Usuario para empleado general.
   - Será utilizado por los demás empleados en la sucursal.

### Requerimientos funcionales

- El empleado podrá registrar la venta del día.
- El empleado podrá registrar cambios de calzado.
- El empleado podrá registrar su entrada y salida al trabajo
- El encargado de la tienda podrá registrar nuevo producto en el inventario.
- El propietario podrá registrar nuevos productos al inventario, así como dar de baja.
- El propietario podrá ver una tabla con las ventas realizadas desde el inicio del registro o bien ver un día en específico.

### Requerimientos no funcionales

- El empleado podrá registrar la venta del día.
- El empleado podrá registrar cambios de calzado.
- El empleado podrá registrar su entrada y salida al trabajo
- El encargado de la tienda podrá registrar nuevo producto en el inventario.
- El propietario podrá registrar nuevos productos al inventario, así como dar de baja.
- El propietario podrá ver una tabla con las ventas realizadas desde el inicio del registro o bien ver un día en específico.

### Glosario

#### Pantalla de Inicio

![image-20200505150756159](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Glosario/btnPropietario.png?raw=true)

+ Ventana Exclusiva para el propietario de la empresa.

![image-20200505151049966](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Glosario/btnVentas.png?raw=true)

+ Ventana exclusiva para realizar ventas y cambios.

![image-20200505151302971](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Glosario/btnChecar.png?raw=true)

+ ventana exclusiva para el registro de entrada y salida de los empleados.

#### Pantalla Propietario

![image-20200505151939668](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Glosario/PP_Login.png?raw=true)

+ Campos para que el propietario pueda logearse. Debe ingresar su Nombre y contraseña

![image-20200505154720138](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Glosario/PP_Inv.png?raw=true)

+ En esta sección el propietario puede agregar datos al inventario, para realizar esta tarea deberá ingresar la categoría, marca, modelo, color y el precio.

![image-20200505193635078](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Glosario/PP_Emp.png?raw=true)

- En los siguientes campos deberán ingresar el id del trabajador, nombre completo, cargo, dirección y edad para poder agregar a un nuevo empleado en la empresa.

#### Pantalla de Ventas

![PV_Ven.png](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Glosario/PV_Ven.png?raw=true)

+ Se deben ingresar el modelo, marca, talla, precio y la cantidad con la que paga el cliente para poder realizar una venta.

![image-20200505193950305](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Glosario/PV_Cam1.png?raw=true)

+ Primer apartado para realizar un cambio, en el cual ingresas la fecha de venta y buscas el modelo, después le das en el botón siguiente y te manda a la segunda sección.

![image-20200505194007407](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Glosario/PV_Cam2.png?raw=true)

+ Segundo apartado para realizar un cambio, en el cual ingresas el modelo, marca, talla, precio, diferencia y el monto del calzado, al darle click al botón cambiar efectuara el cambio del producto.

#### Pantalla Checar

![image-20200505194234197](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Glosario/PC_Ent.png?raw=true)

+ Para registrar la hora de entrada, el empleado deberá ingresar su código y darle click al botón de registrar entrada.

![image-20200505194249437](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Glosario/PC_Sal.png?raw=true)

+ Para registrar la hora de salida, el empleado deberá ingresar su código y darle click al botón de registrar salida.

### Casos de Uso identificados

- Registrar venta de calzado.
- Realizar cambio de calzado.
- Generar ticket.
- Registrar entrada de empleado.
- Registrar salida de empleado.
- Realizar Logeo para el dueño.
- Registrar producto al inventario.
- Eliminar productos del inventario.
-  Visualizar inventario.
- Visualizar ventas del día.
- 11.- Realizar corte de caja .
- Registrar empleado.
- Eliminar empleado.
- Visualizar lista de empleados.
- Cerrar sesión.
- Registrar propietario.

### Revisión de requerimientos

- El empleado podrá registrar la venta del día.
- El empleado podrá registrar cambios de calzado.
- El empleado podrá registrar su entrada y salida al trabajo
- El encargado de la tienda podrá registrar nuevo producto en el inventario.
- El propietario podrá registrar nuevos productos al inventario, así como dar de baja.
- El propietario podrá ver una tabla con las ventas realizadas desde el inicio del registro o bien ver un día en específico.
- El Sistema deberá actualizar el inventario colocando un status de vendido al producto todo esto al realizar una venta.
- El sistema podrá realizar un cambio solo antes 8 después de la compra.
- El sistema borrara los productos del inventario que tienen un status de vendido y lleva más de 8 días en ese status.
- El sistema deberá realizar un corte de caja exceptuando el fondo de caja ($300) el corte de caja llevará total vendido durante el día, así como los gastos hechos, esto incluye pago de empleados, compra de materiales y gastos en comida.
- El sistema no debe tardas más de 10 segundos en mostrar resultados de calzado.
- El sistema registrara la entrada del empleado al local, esta debe ser antes de las 9.
- El sistema registrara la salida del empleado, si la salida es antes de la hora establecida este tendrá que escribir la razón de salida.

## ANÁLISIS Y DISEÑO

### Diagrama de CU

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Map_Act.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/CU_Emp.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/CU_Pro.png?raw=true)

### Modelo de Dominio     

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/ModeloDominio.png?raw=true)

### Casos de Uso

#### Descripción de CU

#### Diseño de Interfaces

#### Diagrama de Secuencia

#### Diagrama de Robustez

#### CU-1 Registrar Venta

| ID                                                           | CU_1                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Nombre**                                                   | Registrar venta                                              |
| **Actor(es)**                                                | Empleado                                                     |
| **Precondición:**                                            | Empleado registrado en la base de datos y calzado existente en el inventario |
| **Postcondición:**                                           | Venta del calzado registrada en la base de datos.<br />Descuento de cierto modelo del calzado en el inventario. |
| **Importancia:**                                             | Alta-indispensable                                           |
| **Escenarios:**                                              |                                                              |
| **Escenario soleado: Venta Exitosa.**<br />![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)<br />**1.** El empleado captura los campos: código numérico, modelo, color, marca, rango de tallas, cantidad, costo unitario y fecha de salida (venta). <br />**2.** Visualiza el mensaje de confirmación y da clic en <Aceptar> | ![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)**<br />1.** El sistema valida los datos ingresados en los campos y realiza persistencia en la Base de Datos.<br />**2.** El sistema envía un mensaje de “¡Venta exitosa!”. |
| **Escenario Nublado: Registro Incompleto.**<br />![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)**<br />1.** El empleado no captura uno o más de los siguientes campos: código numérico, modelo, color, marca, rango de tallas, cantidad, costo unitario o fecha de salida (venta).<br />**2.** Visualiza el mensaje y da clic en <aceptar>. | ![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)**<br />1.** El sistema envía un mensaje de alerta o error. |

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Interfaces/CU_1.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasSecuencia/CU_1.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasRobustez/CU_1.png?raw=true)

#### CU-2 Realizar Cambio de Calzado

| ID                                                           | CU_2                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Nombre**                                                   | Realizar cambio de calzado                                   |
| **Actor(es)**                                                | Empleado                                                     |
| **Precondición:**                                            | Venta registrada en la base de datos                         |
| **Postcondición:**                                           | Venta del calzado registrada  en la base de datos y unidad de calzado descontada en el inventario. |
| **Importancia:**                                             | Alta-indispensable                                           |
| **Escenarios:**                                              |                                                              |
| **Escenario soleado: Cambio Exitoso.** <br />![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)**1.** El empleado verifica que la fecha de devolución y la fecha de venta este en un rango de 8 días de diferencia.<br />**2.** El empleado ingresa los datos en el formulario.<br />**3.** Visualiza el mensaje de confirmación y da clic en *.* | ![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)<br />**1.** El sistema envía muestra el formulario para devolución con los campos: código numérico, modelo, color, marca, rango de tallas, cantidad, costo unitario, fecha de ingreso y fecha de salida (venta)<br /> **2.** El sistema valida los datos ingresados en los campos y realiza persistencia en la Base de Datos. |
| **Escenario Nublado: Cambio Incompleto.** <br />![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)<br />**1.** El empleado no captura uno o más de los siguientes campos: código numérico, modelo, color, marca, rango de tallas, cantidad, costo unitario, fecha de ingreso y fecha de salida (venta)<br /> **2.** Visualiza el mensaje y da clic en *.* | ![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)**<br />1.** El sistema envía un mensaje de alerta o error. |

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Interfaces/CU_2.1.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Interfaces/CU_2.2.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasSecuencia/CU_2.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasRobustez/CU_2.png?raw=true)

#### CU-3 Generar Ticket

| ID                                                           | CU_3                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Nombre**                                                   | Generar Ticket                                               |
| **Actor(es)**                                                | Empleado                                                     |
| **Precondición:**                                            | Sistema operando                                             |
| **Postcondición:**                                           | Venta registrada en la base de datos del sistema             |
| **Importancia:**                                             | Alta-indispensable                                           |
| **Escenarios:**                                              |                                                              |
| **Escenario soleado: Cambio Exitoso.** <br />![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true) <br />**1.** El empleado verifica los datos: código numérico, modelo, color, marca, talla, cantidad, precio total y fecha de salida (venta).<br />**2.** Visualizar el mensaje de confirmación y da click en <aceptar>. | ![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)**<br />1.** El sistema valida los datos ingresados en los campos y realiza persistencia en la base de datos.<br />**2.** El sistema envía un mensaje de “Imprimir ticket”. |
| **Escenario Nublado: Genero el ticket incompleto.** <br />![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)**<br />1.** Alguno de los siguientes datos no se encuentra en el ticket o es erróneo: código numérico, modelo, color, marca, talla, cantidad, precio total y fecha de salida (venta).<br />**2.** Visualiza el mensaje y da click <Aceptar> | ![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)**<br />1.** El sistema envía un mensaje de alerta o error. |

#### CU- 4 Registrar Entrada

| ID                                                           | CU_4                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Nombre**                                                   | Registrar Entrada                                            |
| **Actor(es)**                                                | Empleado                                                     |
| **Precondición:**                                            | Empleado registrado en la base de datos                      |
| **Postcondición:**                                           | Entrada del empleado  registrada en la base de datos         |
| **Importancia:**                                             | Alta-indispensable                                           |
| **Escenarios:**                                              |                                                              |
| **Escenario soleado: Registrar Entrada Exitosa.**  <br />![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)<br />**1.** El empleado entra al apartado de “Checar”.<br />**2.** El empleado ingresa su Id_Empleado y presiona el botón “Registrar Entrada”.<br />**3.** El empleado visualiza el mensaje y da clic ** | ![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)<br />**1.** El sistema muestra el reloj y un cuadro de texto donde se ingresará su Id_Empleado<br />**2.** El sistema valida los datos ingresados en el campo de texto y realiza persistencia en la Base de Datos, envía mensaje de “Tu entrada se ha registrado exitosamente.”<br />**2.1.** El sistema valida de acuerdo con la hora y fecha si el empleado no se registró en una hora la cual es retardo, si fue así envía mensaje "Tienes más de 3 retardos acumulados Total de retardos “numero retardos”” |
| **Escenario Nublado: Registrar entrada incompleta**<br />![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)<br />**1.** El empleado ingresa su Id_Empleado y presiona el botón “Registrar Entrada”.<br />**2.** El empleado visualiza el mensaje y da clic ** | ![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)<br />**1.** El sistema valida los datos ingresados, pero están erróneos por lo cual no realiza persistencia en la base de datos y envía mensaje "Usuario no encontrado "Usuario no encontrado.". |

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Interfaces/CU_4.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasSecuencia/CU_4.jpg?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasRobustez/CU_4.jpg?raw=true)

#### CU-5 Registrar Salida

| ID                                                           | CU_5                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Nombre**                                                   | Registrar Salida                                             |
| **Actor(es)**                                                | Empleado                                                     |
| **Precondición:**                                            | Empleado registrado en la base de datos                      |
| **Postcondición:**                                           | Entrada del empleado  registrada en la base de datos         |
| **Importancia:**                                             | Alta-indispensable                                           |
| **Escenarios:**                                              |                                                              |
| **Escenario soleado: Registrar Salida Exitosa.** <br />![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true) <br />**1.** El empleado entra al apartado de “Checar”.<br />**2.** El empleado ingresa su Id_Empleado y presiona el botón “Registrar Salida”.<br />**3.** El empleado visualiza el mensaje y da clic <Aceptar> | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true) <br />**1.** El sistema muestra el reloj y un cuadro de texto donde se ingresará su Id_Empleado<br />**2.** El sistema valida los datos ingresados en el campo de texto y realiza persistencia en la Base de Datos, envía mensaje de “Tu salida se ha registrado exitosamente.” |
| **Escenario Nublado: Registrar Salida incompleta** <br />![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true) <br />**1.** El empleado ingresa su Id_Empleado y presiona el botón “Registrar Salida”.<br />**2.** El empleado visualiza el mensaje y da clic <Aceptar> | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true) <br />**1.** El sistema valida los datos ingresados, pero están erróneos por lo cual no realiza persistencia en la base de datos y envía mensaje "Usuario no encontrado.". |

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Interfaces/CU_5.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasSecuencia/CU_5.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasRobustez/CU_5.jpg?raw=true)

#### CU-6 Realizar logueo para el dueño

| ID                                                           | CU_6                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Nombre**                                                   | Realizar Logueo para el dueño                                |
| **Actor(es)**                                                | Propietario                                                  |
| **Precondición:**                                            | El dueño debe estar registrado en la base de datos.          |
| **Postcondición:**                                           | El dueño ingresa al sistema y puede hacer uso de las funciones disponibles para el dueño. |
| **Importancia:**                                             | Alta-indispensable                                           |
| **Escenarios:**                                              |                                                              |
| **Escenario soleado: Registrar Salida Exitosa.** <br />![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true) <br />**1.** El propietario ingresa los campos: Nombre de usuario, y contraseña.<br />**2.** Visualiza la pantalla de inventario. | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)  <br />**1.** El sistema valida los datos ingresados en los campos y realiza persistencia en la Base de Datos. |
| **Escenario Nublado: Registrar Salida incompleta**<br /> ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)  <br />**1.** El propietario ingresa los campos de nombre de usuario y su contraseña, pero no son correctos.<br />**2.** Visualiza el mensaje y da clic en <aceptar>. | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)  <br />**1.** El sistema envía un mensaje de alerta o error. |

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Interfaces/CU_6.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasSecuencia/CU_6.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasRobustez/CU_6.jpg?raw=true)

#### CU-7 Registrar Producto al Inventario

| ID                                                           | CU_7                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Nombre**                                                   | Registrar producto al inventario                             |
| **Actor(es)**                                                | Propietario                                                  |
| **Precondición:**                                            | Sistema operando y que el propietario se encuentre logueado. |
| **Postcondición:**                                           | Calzado registrado en la  base de datos.                     |
| **Importancia:**                                             | Alta-indispensable                                           |
| **Escenarios:**                                              |                                                              |
| **Escenario soleado: Registrar Salida Exitosa.** <br /> ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true) <br />**1**. El propietario captura los campos: código numérico, modelo, color, marca, rango de tallas, cantidad, costo unitario, fecha de ingreso y fecha de salida (venta).<br />**2**. Visualiza el mensaje de confirmación y da clic en <aceptar>. | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)   <br />**1.** El sistema valida los datos ingresados en los campos y realiza persistencia en la Base de Datos.<br />**2**. El sistema envía un mensaje de “¡Registro en inventario exitoso!”. |
| **Escenario Nublado: Registrar Salida incompleta**<br /> ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)   <br />**1**. El propietario no captura uno o más de los siguientes campos: código numérico, modelo, color, marca, rango de tallas, cantidad, costo unitario, fecha de ingreso y fecha de salida (venta).<br />**2**. Visualiza el mensaje y da clic en <aceptar>. | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)   <br />**1.** El sistema envía un mensaje de alerta o error. |

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Interfaces/CU_7.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasSecuencia/CU_7.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasRobustez/CU_7.png?raw=true)

#### CU-8 Eliminar Productos del Inventario

| ID                                                           | CU_8                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Nombre**                                                   | Eliminar Productos del Inventario                            |
| **Actor(es)**                                                | Propietario                                                  |
| **Precondición:**                                            | Propietario logueado e inventario con productos              |
| **Postcondición:**                                           | Producto(s) eliminado(s) del inventario                      |
| **Importancia:**                                             | Media-Alta                                                   |
| **Escenarios:**                                              |                                                              |
| **Escenario soleado: Registrar Salida Exitosa.**<br />  ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)<br />**1.** El propietario inicia sesión en su apartado y selecciona la pestaña inventario.<br />**2.** El propietario selecciona un calzado de la tabla.<br />**3.** El propietario presiona el botón de “Eliminar” que tiene un logo de un bote de basura.<br />**4.** El propietario presiona el botón de “Aceptar”. | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)   <br />**1.** El sistema muestra el apartado inventario.<br />**2.** El sistema completa los campos de texto con los datos que fueron seleccionados en la tabla.<br />**3.** El sistema envía mensaje de confirmación.<br />**4.** El sistema elimina de la BD el calzado y actualiza la tabla. |
| **Escenario Nublado: Registrar Salida incompleta**<br /> ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)<br />**1.** El propietario inicia sesión en su apartado y selecciona la pestaña inventario.<br />**2.** El propietario selecciona un calzado de la tabla.<br />**3.** El propietario presiona el botón de “Eliminar” que tiene un logo de un bote de basura.<br />**4.** El propietario presiona el botón de “Aceptar”. | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)    <br />**1.** El sistema muestra el apartado inventario.<br />**2.** El sistema completa los campos de texto con los datos que fueron seleccionados en la tabla.<br />**3.** El sistema envía mensaje de confirmación.<br />**4.** El sistema no conecta con la BD y no puede eliminar el producto. |

![CU_8.png](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Interfaces/CU_8.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasSecuencia/CU_8.jpg?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasRobustez/CU_8.jpg?raw=true)

#### CU-9 Visualizar Inventario

| ID                                                           | CU_9                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Nombre**                                                   | Visualizar inventario                                        |
| **Actor(es)**                                                | Propietario                                                  |
| **Precondición:**                                            | Calzado registrado en la base de datos del sistema           |
| **Postcondición:**                                           | Venta con los datos del inventario                           |
| **Importancia:**                                             | Media-Deseable                                               |
| **Escenarios:**                                              |                                                              |
| **Escenario soleado: Registrar Salida Exitosa.** <br /> ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true) <br />**1.** El propietario visualiza que todos los datos del inventario sean correctos y se actualice. | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)    <br />**1.** El sistema muestra la tabla de contenido del inventario. |
| **Escenario Nublado: Registrar Salida incompleta** <br />![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)<br />**1.** El propietario visualiza los datos del inventario y observa que algunos están incompletos o con datos erróneos. | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)    <br />**1.** El sistema muestra la tabla de contenido del inventario. |

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Interfaces/CU_9.png?raw=true)

![CU_9.png](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasRobustez/CU_9.png?raw=true)



#### CU-10 Visualizar Ventas del Dia

| ID                                                           | CU_10                                                        |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Nombre**                                                   | Visualizar Ventas del dia                                    |
| **Actor(es)**                                                | Propietario                                                  |
| **Precondición:**                                            | Ventas registradas en la base de datos del sistema           |
| **Postcondición:**                                           | Ventana de las ventas registradas                            |
| **Importancia:**                                             | Media-Deseable                                               |
| **Escenarios:**                                              |                                                              |
| **Escenario soleado: Registrar Salida Exitosa.**<br />  ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)  <br />**1.** El propietario visualiza que todos los datos de las ventas registradas sean correctos. | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)    <br />**1.** El sistema muestra la tabla de ventas de acuerdo con la consulta del día. |
| **Escenario Nublado: Registrar Salida incompleta** <br /> ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)<br />**1.** El propietario visualiza que no todas las ventas están registradas o tienen datos incorrectos. | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)     <br />**1.** El sistema muestra la tabla de ventas de acuerdo con la consulta del día. |

![CU_10.png](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasRobustez/CU_10.png?raw=true)

#### CU-12 Registrar Empleado

| **ID**                                                       | CU_12                                                        |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Nombre:**                                                  | Registrar empleado                                           |
| **Actor(es):**                                               | Propietario                                                  |
| **Precondición:**                                            | Sistema operando y que el  propietario se encuentre logueado. |
| **Postcondición:**                                           | Empleado registrado en la  base de datos.                    |
| **Importancia:**                                             | Alta-indispensable                                           |
| **Escenarios:**                                              |                                                              |
| **Escenario soleado: Registro de  empleado exitoso** <br />                         ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)                   <br />**1**. El propietario captura los campos: id del  trabajador, nombre completo, cargo, dirección, y edad del empleado.   <br />**2**. Visualiza el mensaje de confirmación y da  clic en <aceptar>. | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)                   <br />**1.** El sistema valida los datos ingresados en los  campos y realiza persistencia en la Base de Datos.   **2**. El sistema envía un mensaje de “¡Registro  en inventario exitoso!”. |
| **Escenario nublado: Registro de  empleado incompleto** <br />                      ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true) <br /> **1**. El  propietario no captura alguno de los siguientes campos: id del trabajador,  nombre completo, cargo, dirección, y edad del empleado.  <br /> **2**. Visualiza el mensaje y da clic en <aceptar>. | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)<br /> **1.** El sistema envía un mensaje de alerta o  error. |

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Interfaces/CU_12.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasSecuencia/CU_8.jpg?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasRobustez/CU_12.png?raw=true)

#### CU-13 Eliminar Empleado

| **ID**                                                       | CU_13                                                        |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Nombre:**                                                  | Eliminar empleado                                            |
| **Actor(es):**                                               | Propietario                                                  |
| **Precondición:**                                            | Sistema operando y que el  propietario se encuentre logueado. |
| **Postcondición:**                                           | Empleado eliminado de la  base de datos.                     |
| **Importancia:**                                             | Alta-indispensable                                           |
| **Escenarios:**                                              |                                                              |
| **Escenario soleado: Eliminación de empleado  exitoso**<br />![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true) <br />**1**. El propietario selecciona con doble clic uno  de los empleados ya registrados. El sistema automáticamente llena los campos:  id del trabajador, nombre completo, cargo, dirección, y edad del empleado.<br />**2.** El propietario da clic en botón eliminar <br />**3.**  Visualiza el mensaje de confirmación y da clic en <aceptar>. | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)<br />**1.** El sistema valida los datos ingresados en los  campos y realiza persistencia en la Base de Datos.<br />   **2**. El sistema envía un mensaje de “¡Eliminación  en la base de datos correcta!”. |
| **Escenario nublado: Registro de  empleado incompleto**<br /> ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)<br />**1**. El  propietario no selecciona ningún empleado de la tabla de empleados y da clic  en el botón eliminar  <br />**2**. Visualiza el mensaje y da clic en  <aceptar>. | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)<br /> **1.** El sistema envía un mensaje de alerta o  error. |

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Interfaces/CU_13.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasSecuencia/CU_13.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasRobustez/CU_13.jpg?raw=true)

#### CU-14 Visualizar Lista de Empleados

| **ID**                                                       | CU_14                                                        |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Nombre:**                                                  | Visualizar lista de empleados                                |
| **Actor(es):**                                               | Propietario                                                  |
| **Precondición:**                                            | Empleado registrado en la base de datos del sistema          |
| **Postcondición:**                                           | Ventana de los empleados                                     |
| **Importancia:**                                             | Media-Deseable                                               |
| **Escenarios:**                                              |                                                              |
| **Escenario soleado: Vista empleados satisfactoria** <br /> ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)<br />**1.** El propietario visualiza que  todos los datos de los empleados registrados sean correctos. | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)**<br />1.** El sistema muestra la tabla  de empleados. |
| **Escenario nublado: Eliminar Producto incompleto**<br /> ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)**<br />1.** El propietario visualiza que  no aparecen todos los empleados o alguno tiene datos incorrectos. | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)<br />**1.** El sistema muestra la tabla  de empleados. |

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasRobustez/CU_14.png?raw=true)

#### CU-15 Cerrar Sesión

| **ID**                                                       | CU_15                                                        |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Nombre:**                                                  | Cerrar Sesión                                                |
| **Actor(es):**                                               | Propietario                                                  |
| **Precondición:**                                            | Estar registrado en el  sistema y estar logueado.            |
| **Postcondición:**                                           | El usuario ha cerrado la  sesión en el sistema.              |
| **Importancia:**                                             | Media.                                                       |
| **Escenarios:**                                              |                                                              |
| **Escenario soleado: Cerrar sesión  exitosamente** <br /> ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)<br /> **1.** El usuario da clic en Salir, o presiona la  tecla Esc.  <br />**2.** Visualiza el mensaje de confirmación y da  clic en *.* | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)<br /> **1.** El sistema muestra una pantalla emergente de  confirmación. |
| **Escenario nublado: Cerrar sesión erróneo** <br />![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Actor.png?raw=true)<br />**1.** El usuario da clic en Salir, o presiona la  tecla Esc.  **2.** Visualiza el mensaje y da clic en <Cancelar>. | ![img](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/icon_Mensaje.png?raw=true)<br />**1.** El sistema envía una pantalla emergente de confirmación. |

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Interfaces/CU_15.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasSecuencia/CU_15.png?raw=true)

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramasRobustez/CU_15.jpg?raw=true)

### Modelo de Datos

#### Empleado

| **VARIABLE** | **TIPO DE DATO** | **DESCRIPCIÓN**                              |
| ------------ | ---------------- | -------------------------------------------- |
| idEmpleado   | Varchar (6)      | Primary Key  Foreign Key Empledado  Not Null |
| nomCompleto  | Varchar(50)      | Not Null                                     |
| cargo        | Varchar(25)      | Not Null                                     |
| Direccion    | Varchar(50)      | Not Null                                     |
| Edad         | Int(2)           | Not Null                                     |

#### Venta

| **VARIABLE** | **TIPO DE  DATO** | **DESCRIPCIÓN**                |
| ------------ | ----------------- | ------------------------------ |
| idVenta      | Int(11)           | Primary Key  Not Null          |
| idTrabajador | Varchar(6)        | Foreign Key Empleado  Not Null |
| codigo       | Int(5)            | Foreign Key Calzado  Not Null  |
| FechaCompra  | Varchar(30)       | Not Null                       |

#### Calzado

| **VARIABLE** | **TIPO DE  DATO** | **DESCRIPCIÓN**       |
| ------------ | ----------------- | --------------------- |
| Codigo       | Int(5)            | Primary Key  Not Null |
| Categoria    | Varchar(50)       | Not Null              |
| Marca        | Varchar(50)       | Not Null              |
| Modelo       | Varchar(50)       | Not Null              |
| Color        | Varchar(50)       | Not Null              |
| Numero       | Float             | Not Null              |
| Precio       | Float             | Not Null              |
| FechaRegInv  | Varchar(30)       | Not Null              |
| Status       | Varchar(20)       | Default Null          |

#### Check Entrada

| **VARIABLE** | **TIPO DE  DATO** | **DESCRIPCIÓN**       |
| ------------ | ----------------- | --------------------- |
| IdCheck      | Int(11)           | Primary Key  Not Null |
| IdTrabajador | Varchar(6)        | Foreign Key Not Null  |
| Hora         | Varchar(15)       | Not null              |
| Fecha        | Varchar(15)       | Not Null              |
| Retardos     | Int(11)           | Default 0             |

#### Check Salida

| **VARIABLE** | **TIPO DE  DATO** | **DESCRIPCIÓN**       |
| ------------ | ----------------- | --------------------- |
| IdCheck      | Int(11)           | Primary Key  Not Null |
| IdTrabajador | Varchar(6)        | Foreign Key Not Null  |
| Hora         | Varchar(15)       | Not null              |
| Fecha        | Varchar(15)       | Not Null              |
| Retardos     | Int(11)           | Default 0             |

### Diagrama de Clases

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramaDeClases.png?raw=true)

### Modelo Arquitectura

| ![Gluon supports Scene Builder - Gluon](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/Sb.png?raw=true)**Presentación**  <br />Para el maquetado de la aplicación de  utilizo Scene Builder la cual genera un archivo FXML donde se encuentra la  descripción de toda   la  interfaz, esta se comunica a la capa de negocios a través de la librería javafx.fxml.FXML |
| ------------------------------------------------------------ |
| ![Icono de lenguaje de programación Java - Descargar PNG/SVG ...](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/java.png?raw=true)**Negocio**  <br />Para la creación y manejo de la lógica  de negocio se utilizó lenguaje java conectándose a los componentes de la  pantalla con la librería anterior. |
| ![Tutorial de JPA](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/jpa.jpg?raw=true)**Datos**  <br />En la conexión y manejo de datos se utilizó  el FrameWork JPA esta permite interactuar con la base de datos por medio de  objetos.<br />   <img src="https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/mysql.png?raw=true" alt="Logo MySQL Texto PNG transparente - StickPNG" style="zoom: 25%;" /><br />Para  la gestión de datos se utilizo MySQL el cual se conectó a través de JPA. |

## Construcción

### Diagrama de Despliegue

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/DiagramaDeDespliegue.png?raw=true)

### Arquitectura Empleada

Modelo Vista Controlador (MVC) es un estilo de arquitectura de software que separa los datos de una aplicación, la interfaz de usuario, y la lógica de control en tres componentes distintos.

El Modelo que contiene una representación de los datos que maneja el sistema, su lógica de negocio, y sus mecanismos de persistencia.

La Vista, o interfaz de usuario, que compone la información que se envía al cliente y los mecanismos interacción con éste.

El Controlador, que actúa como intermediario entre el Modelo y la Vista, gestionando el flujo de información entre ellos y las transformaciones para adaptar los datos a las necesidades de cada uno.

Optamos por elegir esta arquitectura, debido a que nos permite tener una separación clara de donde tiene que ir cada tipo de lógica y a su vez nos facilita el mantenimiento y escalabilidad de nuestra aplicación.

![](https://github.com/PrimalAngel/CachorrosApp/blob/master/Resources/PatronDise%C3%B1oMVC.png?raw=true)

### Código por cada Caso de Uso

#### CU-1 Registrar Venta de Calzado

```java
@FXML
    private void vender() throws ParseException, NonexistentEntityException, Exception{
       Venta venta=new Venta();
        
        Alert boxAlert=new Alert(AlertType.CONFIRMATION);
        boxAlert.setTitle("Confirmar Venta");
        boxAlert.setHeaderText(null);
        boxAlert.initStyle(StageStyle.UTILITY);
        boxAlert.setContentText("Confirmar Venta");
        Optional<ButtonType> result= boxAlert.showAndWait();
        
        if(result.get()==ButtonType.OK){
            String modelo, marca, talla, precio, monto;
            modelo=txtModelo.getText();
            marca=txtMarca.getText();
            talla=txtTalla.getText();
            precio=txtPrecio.getText();
            monto = txtMonto.getText();
            monto=monto+".00";
            String prec=precio.substring(1);
            double pre =Double.parseDouble(prec);
            double mont=Double.parseDouble(monto);
            
            if (modelo.equals("") || marca.equals("") || talla.equals("") || precio.equals("") || monto.equals("")) {
                Alert boxAlertCampos= new Alert(AlertType.INFORMATION);
                boxAlertCampos.setTitle("Completa Todos los datos");
                boxAlertCampos.setHeaderText(null);
                boxAlertCampos.initStyle(StageStyle.UTILITY);
                boxAlertCampos.setContentText("Completa todos los campos para poder realizar la venta");
                boxAlertCampos.showAndWait();
            }else if(pre > mont){
                Alert boxAlertCampos= new Alert(AlertType.INFORMATION);
                boxAlertCampos.setTitle("Efectivo Insuficiente");
                boxAlertCampos.setHeaderText(null);
                boxAlertCampos.initStyle(StageStyle.UTILITY);
                boxAlertCampos.setContentText("Efectivo insuficiente...");
                boxAlertCampos.showAndWait();
            }else{
                //double cambio;
                Calendar calendar= new GregorianCalendar();
                
                int dia = calendar.get(Calendar.DATE);
                int mes = calendar.get(Calendar.MONTH);
                int año = calendar.get(Calendar.YEAR);
                mes++;
                String fecha=dia+"/"+mes+"/"+año;
                
                venta.setCodigo(calzado);
                venta.setFechaVenta(fecha);
                
                venta.setIdTrabajador("ABC003");
                calzado.setStatus("Vendido");
                ControlCalzado.edit(calzado);            
                controlVenta.create(venta);
                Alert boxVentaOk = new Alert(AlertType.INFORMATION);
                boxVentaOk.setTitle("Venta Exitosa");
                boxVentaOk.setHeaderText(null);
                boxVentaOk.initStyle(StageStyle.UTILITY);
                boxVentaOk.setContentText("Venta Realizada Con Exito. Su cambio es : $"+(mont-pre));
                boxVentaOk.showAndWait();
            }
        }
    }
```

#### CU-2 Realizar Cambio de Calzado

```java
@FXML
    public void realizarCambio(){
        Alert boxAlert=new Alert(AlertType.CONFIRMATION);
        boxAlert.setTitle("Confirmar Cambio");
        boxAlert.setHeaderText(null);
        boxAlert.initStyle(StageStyle.UTILITY);
        boxAlert.setContentText("solo se permite un solo cambio, esta seguro de hacerlo");
        Optional<ButtonType> result= boxAlert.showAndWait();
        
        if(result.get()==ButtonType.OK){
            if(calzado != null && calzadoCambio != null){
                Alert boxVentaOk = new Alert(AlertType.INFORMATION);
                boxVentaOk.setTitle("Venta Exitosa");
                boxVentaOk.setHeaderText(null);
                boxVentaOk.initStyle(StageStyle.UTILITY);
                boxVentaOk.setContentText("Cambio Realizado Con Exito");
                boxVentaOk.showAndWait();
            }else{
                Alert boxAlertCampos= new Alert(AlertType.INFORMATION);
                boxAlertCampos.setTitle("Completa Todos los datos");
                boxAlertCampos.setHeaderText(null);
                boxAlertCampos.initStyle(StageStyle.UTILITY);
                boxAlertCampos.setContentText("Completa todos los campos para poder realizar la venta");
                boxAlertCampos.showAndWait();
            }
        }
    }
```

#### CU-3 Generar Ticket

```java
void imprimirTicket(Calzado calzado, String monto){
    try {
        Date date = new Date();
        String formatoFecha = "dd/MM/yyyy - hh:mm:ss"; // El formato de fecha está especificado
        SimpleDateFormat sdf = new SimpleDateFormat(formatoFecha); // La cadena de formato de fecha se pasa como un argumento al objeto
        String fechaSistema = sdf.format(date);

        
        double pre2 =calzado.getPrecio();
        double mont=Double.parseDouble(monto);
        String cambio = String.valueOf(mont-pre2);
        
        PrinterMatrix printer = new PrinterMatrix();
        Extenso e = new Extenso();
        
        e.setNumber(8);
        //Definir el tamanho del papel para la impresion de dinamico y 32 columnas
        //int filas = jtbl_venta.getRowCount();
        int tamaño = 22;
        printer.setOutSize(tamaño, 35);
       
        //Imprimir = 1ra linea de la columa de 1 a 32
        
        printer.printTextWrap(0, 1, 2, 35,  "========================");
        printer.printTextWrap(1, 1, 5, 35, "Zapateria Cachorros"); //Nombre establecimiento
        printer.printTextWrap(2, 1, 5, 35, "Colonia Revolucion"); //Barrio
        printer.printTextWrap(3, 1, 5, 35, "Av. Atenas Veracruzana"); //Direccion
        printer.printTextWrap(4, 1, 6, 35, "CP. 91100"); //Codigo Postal
        printer.printTextWrap(5, 1, 3, 35, fechaSistema); //Aqui va la fecha de recibo
        //printer.printTextWrap(6, 1, 38,80, "Hora: "+hora); //Aqui va la hora de recibo
        //printer.printTextWrap(7, 1, 3, 80, "Numero "); //Numero del recibo - FACTURA O PEDIDO
        //printer.printTextWrap(8, 1, 3, 80, "Atiende"); //Nombre Cajero
        //printer.printTextWrap(9, 1, 3, 80, "Cliente");//Nombre del Cliente
        printer.printTextWrap(6,1, 2, 35,   "=========================");
        //printer.printTextWrap(9,1, 7, 80, "ID   DESCRIPCION                        CANT           PRECIO");
        
        //for (int i = 0; i < filas; i++) {
          //  int p = 13+i; //Fila

            printer.printTextWrap(7 , 1, 4, 35 , "Marca:   "+calzado.getMarca());
            printer.printTextWrap(8 , 1, 4, 35 , "Modelo:  "+calzado.getModelo());
            printer.printTextWrap(9, 1, 4, 35 , "Talla:   "+calzado.getNumero());
            printer.printTextWrap(10 , 1, 4, 35 , "Color:   "+calzado.getColor());

            //String pre= printer.alinharADireita(10, String.valueOf(calzado.getPrecio()));
            //printer.printTextWrap(14 , 1, 30, 80, pre);

            //String inp= printer.alinharADireita(7,punto_Venta.jtbl_venta.getValueAt(i,6).toString());
            //printer.printTextWrap(p , 1, 25, 32, inp);
        //}
        DecimalFormat formateador = new DecimalFormat("#.###");

        /*String sub= printer.alinharADireita(10, subTotal);
        printer.printTextWrap(17, 1, 5, 80, "Subtotal: ");
        printer.printTextWrap(17, 1, 20, 80, "$"+sub);*/

        String tot= printer.alinharADireita(10, String.valueOf(calzado.getPrecio()));
        printer.printTextWrap(11, 1, 5, 35, "Total a pagar: ");
        printer.printTextWrap(11, 1, 20, 35, "$"+tot);

        String efe= printer.alinharADireita(10,monto);
        printer.printTextWrap(12, 1, 5, 35, "Efectivo : ");
        printer.printTextWrap(12, 1, 20, 35, "$"+efe);

        String cam= printer.alinharADireita(10,cambio);
        printer.printTextWrap(13, 1, 5, 35, "Cambio : ");
        printer.printTextWrap(13, 1, 20, 35, "$"+ cam);

        printer.printTextWrap(14, 1, 5, 35, "=========================");
        printer.printTextWrap(15, 1, 3, 35, "!Gracias por su preferencia!");
        printer.printTextWrap(16, 1, 3, 35, "***Revice su Mercancia***");
        printer.printTextWrap(17, 1, 1, 35, "<No Hay Cambios Ni Devoluciones");
        printer.printTextWrap(18, 1, 2, 35, "Despues de Ocho Dias");
        printer.printTextWrap(19, 1, 2, 35, "Y En Ofertas>");
        printer.printTextWrap(20, 1, 1, 35, "cachorroszapateria@gmail.com");
        printer.printTextWrap(21, 1, 2, 35, "==========================");
        

        ///CREAR ARCHIVO EN CARPETA DEL PROYECTO PARA PEDIDOS
        printer.toFile("impresion.txt");
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("impresion.txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
        if (inputStream == null) {
            return;
        }

        DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
        Doc document = new SimpleDoc(inputStream, docFormat, null);
        PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();
        PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();

        if (defaultPrintService != null) {
            DocPrintJob printJob = defaultPrintService.createPrintJob();
            try {
                printJob.print(document, attributeSet);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            System.err.println("No existen impresoras instaladas");
        }

        inputStream.close();
        //imprimirFin(subTotal, total, dineroR, devolucion); //ESTE METODO NO SE UTILIZARA

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al imprimir "+e);
        }
    }
```

#### CU-3 Ticket Correo

```java
public void crearTicketPdf() throws FileNotFoundException, DocumentException, BadElementException, IOException{

        //Recupero los datos de los TextField...
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String talla = txtTalla.getText();
        String color = calzado.getColor();
        String precio = txtPrecio.getText();
        String monto = txtMonto.getText();
        monto=monto+".00";
        String prec=precio.substring(1);
        double pre =Double.parseDouble(prec);
        double mont=Double.parseDouble(monto);
        String cambio = String.valueOf(mont-pre);

        //Esto es para generar el formato de la fecha y hora...
        Date date = new Date();
        String formatoFecha = "dd/MM/yyyy - hh:mm:ss"; // El formato de fecha está especificado
        SimpleDateFormat sdf = new SimpleDateFormat(formatoFecha); // La cadena de formato de fecha se pasa como un argumento al objeto
        String fechaSistema = sdf.format(date);

        //Creo una variable de tipo Document...
        Document doc = new Document();
        //Asigno donde se guardaran los datos...
        FileOutputStream ficheroPdf = new FileOutputStream("Ticket.pdf");
        //Creamos el pdf...
        PdfWriter.getInstance(doc, ficheroPdf);
        //Abrimos el pdf...
        doc.open();

        //Agregar fecha de compra...
        Paragraph fechaCompra = new Paragraph("Xalapa, Ver a " + fechaSistema, FontFactory.getFont("comic sans", 15, Font.ITALIC, BaseColor.BLACK));
        fechaCompra.setAlignment(Element.ALIGN_RIGHT);

        //Agregamos el logo de la empresa...
        Image imagen = Image.getInstance("logoPV.png");
        imagen.setAlignment(Element.ALIGN_CENTER);
        imagen.scalePercent(25f);

        //Creamos las variables de los datos de la compra...
        Paragraph marcaZap = new Paragraph("\nMARCA:        " + marca, FontFactory.getFont("comic sans", 19, Font.BOLD, BaseColor.BLACK));
        marcaZap.setIndentationLeft(160);
        marcaZap.setAlignment(Element.ALIGN_MIDDLE);

        Paragraph modeloZap = new Paragraph("MODELO:      " + modelo, FontFactory.getFont("comic sans", 19, Font.BOLD, BaseColor.BLACK));
        modeloZap.setIndentationLeft(160);
        modeloZap.setAlignment(Element.ALIGN_MIDDLE);

        Paragraph tallaZap = new Paragraph("TALLA:          " + talla, FontFactory.getFont("comic sans", 19, Font.BOLD, BaseColor.BLACK));
        tallaZap.setIndentationLeft(160);
        tallaZap.setAlignment(Element.ALIGN_MIDDLE);

        Paragraph colorZap = new Paragraph("COLOR:         " + color, FontFactory.getFont("comic sans", 19, Font.BOLD, BaseColor.BLACK));
        colorZap.setIndentationLeft(160);
        colorZap.setAlignment(Element.ALIGN_MIDDLE);

        Paragraph precioZap = new Paragraph("PRECIO:        " + precio, FontFactory.getFont("comic sans", 19, Font.BOLD, BaseColor.BLACK));
        precioZap.setIndentationLeft(160);
        precioZap.setAlignment(Element.ALIGN_MIDDLE);

        Paragraph efectivoZap = new Paragraph("EFECTIVO:    $" + monto, FontFactory.getFont("comic sans", 19, Font.BOLD, BaseColor.BLACK));
        efectivoZap.setIndentationLeft(160);
        efectivoZap.setAlignment(Element.ALIGN_MIDDLE);

        Paragraph cambioZap = new Paragraph("CAMBIO:       $" + cambio, FontFactory.getFont("comic sans", 19, Font.BOLD, BaseColor.BLACK));
        cambioZap.setIndentationLeft(160);
        cambioZap.setAlignment(Element.ALIGN_MIDDLE);

        //Creamos las variables de los datos de la empresa...
        Paragraph direccion = new Paragraph("\n\nDirección: AV. Atenas Veracruzana S/N", FontFactory.getFont("comic sans", 15, Font.BOLD, BaseColor.BLACK));
        direccion.setAlignment(Element.ALIGN_LEFT);

        Paragraph colonia = new Paragraph("Colonia: Revolución", FontFactory.getFont("comic sans", 15, Font.BOLD, BaseColor.BLACK));
        colonia.setAlignment(Element.ALIGN_LEFT);

        Paragraph codPostal = new Paragraph("Código Postal: 91100", FontFactory.getFont("comic sans", 15, Font.BOLD, BaseColor.BLACK));
        codPostal.setAlignment(Element.ALIGN_LEFT);

        Paragraph telefono = new Paragraph("Teléfono: 8152305", FontFactory.getFont("comic sans", 15, Font.BOLD, BaseColor.BLACK));
        telefono.setAlignment(Element.ALIGN_LEFT);

        Paragraph correo = new Paragraph("Correo: cachorroszapateria@gmail.com\n\n\n", FontFactory.getFont("comic sans", 15, Font.BOLD, BaseColor.BLACK));
        correo.setAlignment(Element.ALIGN_LEFT);

        //Creamos la frase rev...
        Paragraph revise = new Paragraph("******** REVISE SU MERCANCÍA ********", FontFactory.getFont("comic sans", 10, Font.ITALIC, BaseColor.BLACK));
        revise.setAlignment(Element.ALIGN_CENTER);

        //Creamos la frase dev...
        Paragraph devolucion = new Paragraph("***No Hay Cambios Ni Devoluciones Después De Ocho Días Y En Ofertas***", FontFactory.getFont("comic sans", 10, Font.ITALIC, BaseColor.BLACK));
        devolucion.setAlignment(Element.ALIGN_CENTER);

        //Creamos la frase thanks...
        Paragraph gracias = new Paragraph("\n\n¡ GRACIAS POR SU COMPRA !", FontFactory.getFont("comic sans", 15, Font.BOLDITALIC, BaseColor.BLACK));
        gracias.setAlignment(Element.ALIGN_CENTER);

        //Agregamos los elementos al pdf...
        doc.add(fechaCompra);
        doc.add(imagen);
        doc.add(marcaZap);
        doc.add(modeloZap);
        doc.add(tallaZap);
        doc.add(colorZap);
        doc.add(precioZap);
        doc.add(efectivoZap);
        doc.add(cambioZap);
        doc.add(direccion);
        doc.add(colonia);
        doc.add(codPostal);
        doc.add(telefono);
        doc.add(correo);
        doc.add(revise);
        doc.add(devolucion);
        doc.add(gracias);

        //Cerramos el pdf...
        doc.close();
    }

    public void enviarCorreo(){

          try {
              //Establecemos las propiedades de conexion...
              Properties props = new Properties();
              props.put("mail.smtp.host", "smtp.gmail.com");  //Hosting o dominio desde donde enviamos los correos...
              props.setProperty("mail.smtp.starttls.enable", "true");    //Si vamos a utilizar tls
              props.setProperty("mail.smtp.port", "587"); //Puerto...
              props.setProperty("mail.smtp.user", "");
              props.setProperty("mail.smtp.auth", "true");    //Indicar si se va autentificar directamente a gmail...

              Session sesion = Session.getDefaultInstance(props);

              String correoRem = "cachorroszapateria@gmail.com";
              String passwordRem = "TeamCachorros";
              String correoDes = txtCorreo.getText();
              String asunto = "¡ Envío De Su Ticket !";
              String mensajeCorreo = "¡ Muchas Gracias Por Su Compra, Vuelva Pronto !";

              BodyPart texto = new MimeBodyPart();
              texto.setText(mensajeCorreo);

              BodyPart adjunto = new MimeBodyPart();
              adjunto.setDataHandler(new DataHandler(new FileDataSource("Ticket.pdf")));
              adjunto.setFileName("Ticket.pdf");

              MimeMultipart multiparte = new MimeMultipart();
              multiparte.addBodyPart(texto);
              multiparte.addBodyPart(adjunto);

              MimeMessage mensaje = new MimeMessage(sesion);
              mensaje.setFrom(new InternetAddress(correoRem));    //Correo del cual enviamos...
              mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDes)); //Opcion para el destinatario principal...
              mensaje.setSubject(asunto);
              mensaje.setContent(multiparte);

              Transport t = sesion.getTransport("smtp");
              t.connect(correoRem, passwordRem);
              t.sendMessage(mensaje, mensaje.getRecipients(Message.RecipientType.TO));
              t.close();

          } catch (AddressException ex) {
              Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
          } catch (MessagingException ex) {
              Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
```



#### CU-4 Registrar Entrada

```java
@FXML
    public void registrarEntrada() {
        calendar= Calendar.getInstance();
        
        int hor=calendar.get(Calendar.HOUR);
        int minute=calendar.get(Calendar.MINUTE);
        int seconds=calendar.get(Calendar.SECOND);
        
        int dia = calendar.get(Calendar.DATE);
        int mes = calendar.get(Calendar.MONTH);
        int año = calendar.get(Calendar.YEAR);
        mes++;
        String codEmp = txtCodEmp.getText();
        System.out.println(codEmp);
        try {
            empleado = ControlEmpleado.findTrabajador(codEmp);
            System.out.println(empleado.getNomCompleto());
            
            entrada.setIdTrabajador(empleado);
            System.out.println(hor+":"+minute+":"+seconds);
            entrada.setHora(hor+":"+minute+":"+seconds);
            
            
            entrada.setFecha(dia+"-"+mes+"-"+año);           
            
            System.out.println(dia+"-"+mes+"-"+año);
            if(hor <= 9 && minute <= 15){
                entrada.setRetardos(0);
            }else{
                entrada.setRetardos(1);
            }
            
            ControlEntrada.create(entrada);
            
            Alert boxVentaOk = new Alert(AlertType.INFORMATION);
            boxVentaOk.setTitle("Registro Exitoso");
            boxVentaOk.setHeaderText(null);
            boxVentaOk.initStyle(StageStyle.UTILITY);
            boxVentaOk.setContentText("Tu entrada se a registrado exitosamente.");
            boxVentaOk.showAndWait();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            Alert boxVentaOk = new Alert(AlertType.INFORMATION);
            boxVentaOk.setTitle("Usuario no encontrado");
            boxVentaOk.setHeaderText(null);
            boxVentaOk.initStyle(StageStyle.UTILITY);
            boxVentaOk.setContentText("Usuario no encontrado.");
            boxVentaOk.showAndWait();
        }
        
        try{
            int numRetardos=ControlEntrada.BuscarRetardoEmpleado(codEmp);
            System.out.println(numRetardos);
            if(numRetardos >= 3){
                Alert boxVentaOk = new Alert(AlertType.INFORMATION);
                boxVentaOk.setTitle("Alerta de retardo");
                boxVentaOk.setHeaderText(null);
                boxVentaOk.initStyle(StageStyle.UTILITY);
                boxVentaOk.setContentText("Tienes mas de 3 retardos acumulados Total de retardos: "+numRetardos);
                boxVentaOk.showAndWait();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
```

#### CU-5 Registrar Salida

```java
@FXML
    public void registrarSalida(){
        calendar= Calendar.getInstance();
        
        int hor=calendar.get(Calendar.HOUR);
        int minute=calendar.get(Calendar.MINUTE);
        int seconds=calendar.get(Calendar.SECOND);
        
        int dia = calendar.get(Calendar.DATE);
        int mes = calendar.get(Calendar.MONTH);
        int año = calendar.get(Calendar.YEAR);
        mes++;
        String codEmp = txtCodEmp.getText();
        System.out.println(codEmp);
        
        try {
            empleado = ControlEmpleado.findTrabajador(codEmp);
            System.out.println(empleado.getNomCompleto());
            
            salida.setIdTrabajador(empleado);
            System.out.println(hor+":"+minute+":"+seconds);
            salida.setHora(hor+":"+minute+":"+seconds);
            salida.setFecha(dia+"-"+mes+"-"+año);
            System.out.println(dia+"-"+mes+"-"+año);
            ControlSalida.create(salida);
            
            Alert boxVentaOk = new Alert(AlertType.INFORMATION);
            boxVentaOk.setTitle("Registro Exitoso");
            boxVentaOk.setHeaderText(null);
            boxVentaOk.initStyle(StageStyle.UTILITY);
            boxVentaOk.setContentText("Tu salida se a registrado exitosamente.");
            boxVentaOk.showAndWait();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Alert boxVentaOk = new Alert(AlertType.INFORMATION);
            boxVentaOk.setTitle("Usuario no encontrado");
            boxVentaOk.setHeaderText(null);
            boxVentaOk.initStyle(StageStyle.UTILITY);
            boxVentaOk.setContentText("Usuario no encontrado.");
            boxVentaOk.showAndWait();
        }
    }
```

#### CU-6 Realizar Logueo

```java
@FXML
    public void iniciar(){
        Trabajador empleado=new Trabajador();
        empleado=controlEmpleado.findTrabajador("SLV100");
       
        String user=txtUser.getText();
        String pass=txtPass.getText();
        
        if(empleado.getNomCompleto().equals(user) && empleado.getIdTrabajador().equals(pass)){
            ventana.propietario();
        } else {
            Alert boxAlertCampos = new Alert(AlertType.INFORMATION);
            boxAlertCampos.setTitle("Datos Incorrectos");
            boxAlertCampos.setHeaderText(null);
            boxAlertCampos.initStyle(StageStyle.UTILITY);
            boxAlertCampos.setContentText("Verifique Usuario Y Contraseña");
            boxAlertCampos.showAndWait();
        }
    }
```

#### CU-7 Registrar Producto en Inventario

```java
@FXML
    public void guardar() throws Exception{
        String categoria=txtCategoria.getText();
        String marca=txtMarca.getText();
        String modelo=txtModelo.getText();
        String color=txtColor.getText();
        String precio=txtPrecio.getText();
        float prec=Float.parseFloat(precio);
        System.out.println(date.get(i).getEditor().getText());
        for(int i=0; i<= text.size()-1;i++){
            //String fecha=date.get(i).getEditor().getText();
            String codigo=String.valueOf(prec)+Math.floor(Math.random()*6+1);
            System.out.println(codigo);
            String id=codigo.replace(".", "");
            System.out.println(id);
            int cod=Integer.parseInt(id);
            
            Calzado calzado=new Calzado();
            calzado.setCodigo(cod);
            calzado.setCategoria(categoria);
            calzado.setMarca(marca);
            calzado.setModelo(modelo);
            calzado.setColor(color);
            calzado.setPrecio(prec);
            Float talla=Float.parseFloat(text.get(i).getText());
            calzado.setNumero(talla);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            calzado.setFechaRegInv(String.valueOf(formatter.parse(date.get(i).getEditor().getText())));
            calzadoControl.create(calzado);
            mostrarTabla();
        }  
        Alert boxAlert = new Alert(Alert.AlertType.INFORMATION);
            boxAlert.setTitle("Exito");
            boxAlert.setHeaderText(null);
            boxAlert.initStyle(StageStyle.UTILITY);
            boxAlert.setContentText("Se agregaron con exito");
            Optional<ButtonType> result = boxAlert.showAndWait();
    }
```

#### CU-8 Eliminar Productos del Inventario

```java
   @FXML
    public void eliminarCalzado() throws IllegalOrphanException, NonexistentEntityException{
        
        Alert boxAlert=new Alert(Alert.AlertType.CONFIRMATION);
        boxAlert.setTitle("Eliminar Calzado");
        boxAlert.setHeaderText(null);
        boxAlert.initStyle(StageStyle.UTILITY);
        boxAlert.setContentText("Esta seguro de eliminar calzado");
        Optional<ButtonType> result= boxAlert.showAndWait();
        
        if(result.get()==ButtonType.OK){
            calzadoControl.destroy(calzadoDel.getCodigo());
            mostrarTabla();
        }
    }
```

#### CU-9 Visualizar Inventario

```java
public void mostrarTabla(){
        listCalzado = FXCollections.observableArrayList(calzadoControl.findCalzadoEntities());
        System.out.println(listCalzado.get(1).getFechaRegInv());
        tlbInv.setItems(listCalzado);

        clmnCategoria.setCellValueFactory(new PropertyValueFactory<Calzado, String>("Categoria"));
        clmnMarca.setCellValueFactory(new PropertyValueFactory<Calzado, String>("Marca"));
        clmnModelo.setCellValueFactory(new PropertyValueFactory<Calzado, String>("Modelo"));
        clmnNumero.setCellValueFactory(new PropertyValueFactory<Calzado, Number>("Numero"));
        clmnColor.setCellValueFactory(new PropertyValueFactory<Calzado, String>("Color"));
        clmnPrecio.setCellValueFactory(new PropertyValueFactory<Calzado, Number>("Precio"));
        clmnFecha.setCellValueFactory(new PropertyValueFactory<Calzado, String>("FechaRegInv"));
        clmnStatus.setCellValueFactory(new PropertyValueFactory<Calzado, String>("status"));
    }
```

#### CU-10 Visualizar Ventas Del Dia

```java
@FXML
    public void mostrarTablaVentas() { 
        Calendar c2 = new GregorianCalendar();
        int dia = c2.get(Calendar.DATE);
        int mes = c2.get(Calendar.MONTH);
        int annio = c2.get(Calendar.YEAR);
        mes++;
        String Dia="";
        if(dia<10){
            Dia="0"+dia;
        }else{
            Dia=String.valueOf(dia);
        }
        String Mes="";
        if(mes<10){
            Mes="0"+mes;
        }else{
            Mes=String.valueOf(mes);
        }
                
        String fecha=annio+"-"+Mes+"-"+Dia;
        
        String respuesta=cbOpciones.getSelectionModel().getSelectedItem().toString();
        if(respuesta=="Hoy"){
            listVenta = FXCollections.observableArrayList(controlVenta.findVentaByFecha(fecha));
            for(int i=0;i<listVenta.size();i++){
                calzadotb=new CalzadoTB();
                calzadotb.setCodigo(listVenta.get(i).getCodigo().getCodigo());
                calzadotb.setMarca(listVenta.get(i).getCodigo().getMarca());
                calzadotb.setModelo(listVenta.get(i).getCodigo().getModelo());
                calzadotb.setNumero(listVenta.get(i).getCodigo().getNumero());
                calzadotb.setColor(listVenta.get(i).getCodigo().getColor());
                calzadotb.setPrecio(listVenta.get(i).getCodigo().getPrecio());
                calzadotb.setFechaRegInv(listVenta.get(i).getCodigo().getFechaRegInv());
                calzadotb.setFechaVenta(listVenta.get(i).getFechaVenta());
                calzadotb.setCategoria(listVenta.get(i).getCodigo().getCategoria());
                
                listFinal.add(calzadotb);
            }
            
        }else if(respuesta=="Última Semana"){
            String fecha2=obtenerFecha(7);
            listVenta = FXCollections.observableArrayList(controlVenta.findByBetwen(fecha2, fecha));
            System.out.println("Tamaño listVenta = "+listVenta.size());
            System.out.println("Contenido de la misma= "+listVenta.get(0).getFechaVenta());
            for(int i=0;i<listVenta.size();i++){
                calzadotb=new CalzadoTB();
                calzadotb.setCodigo(listVenta.get(i).getCodigo().getCodigo());
                calzadotb.setMarca(listVenta.get(i).getCodigo().getMarca());
                calzadotb.setModelo(listVenta.get(i).getCodigo().getModelo());
                calzadotb.setNumero(listVenta.get(i).getCodigo().getNumero());
                calzadotb.setColor(listVenta.get(i).getCodigo().getColor());
                calzadotb.setPrecio(listVenta.get(i).getCodigo().getPrecio());
                calzadotb.setFechaRegInv(listVenta.get(i).getCodigo().getFechaRegInv());
                calzadotb.setFechaVenta(listVenta.get(i).getFechaVenta());
                calzadotb.setCategoria(listVenta.get(i).getCodigo().getCategoria());
                
                listFinal.add(calzadotb);
            }
        }else if(respuesta=="Último Mes"){
            String fecha2=obtenerFecha(30);
            listVenta = FXCollections.observableArrayList(controlVenta.findByBetwen(fecha2, fecha));
            for(int i=0;i<listVenta.size();i++){
                calzadotb=new CalzadoTB();
                calzadotb.setCodigo(listVenta.get(i).getCodigo().getCodigo());
                calzadotb.setMarca(listVenta.get(i).getCodigo().getMarca());
                calzadotb.setModelo(listVenta.get(i).getCodigo().getModelo());
                calzadotb.setNumero(listVenta.get(i).getCodigo().getNumero());
                calzadotb.setColor(listVenta.get(i).getCodigo().getColor());
                calzadotb.setPrecio(listVenta.get(i).getCodigo().getPrecio());
                calzadotb.setFechaRegInv(listVenta.get(i).getCodigo().getFechaRegInv());
                calzadotb.setFechaVenta(listVenta.get(i).getFechaVenta());
                calzadotb.setCategoria(listVenta.get(i).getCodigo().getCategoria());
                
                listFinal.add(calzadotb);
            }
        }else if(respuesta=="Desde Siempre"){
            listVenta = FXCollections.observableArrayList(controlVenta.findVentaEntities());
            System.out.println("Tamaño listVenta = "+listVenta);
            for(int i=0;i<listVenta.size();i++){
                calzadotb=new CalzadoTB();
                calzadotb.setCodigo(listVenta.get(i).getCodigo().getCodigo());
                calzadotb.setMarca(listVenta.get(i).getCodigo().getMarca());
                calzadotb.setModelo(listVenta.get(i).getCodigo().getModelo());
                calzadotb.setNumero(listVenta.get(i).getCodigo().getNumero());
                calzadotb.setColor(listVenta.get(i).getCodigo().getColor());
                calzadotb.setPrecio(listVenta.get(i).getCodigo().getPrecio());
                calzadotb.setFechaRegInv(listVenta.get(i).getCodigo().getFechaRegInv());
                calzadotb.setFechaVenta(listVenta.get(i).getFechaVenta());
                calzadotb.setCategoria(listVenta.get(i).getCodigo().getCategoria());
                
                listFinal.add(calzadotb);
            }
        }else{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            dtFechaVenta.setConverter(new LocalDateStringConverter(formatter, null));
            
            String fechaVenta=dtFechaVenta.getEditor().getText();
            System.out.println(fechaVenta);
            listVenta = FXCollections.observableArrayList(controlVenta.findVentaByFecha(fechaVenta));
            for(int i=0;i<listVenta.size();i++){
                calzadotb=new CalzadoTB();
                calzadotb.setCodigo(listVenta.get(i).getCodigo().getCodigo());
                calzadotb.setMarca(listVenta.get(i).getCodigo().getMarca());
                calzadotb.setModelo(listVenta.get(i).getCodigo().getModelo());
                calzadotb.setNumero(listVenta.get(i).getCodigo().getNumero());
                calzadotb.setColor(listVenta.get(i).getCodigo().getColor());
                calzadotb.setPrecio(listVenta.get(i).getCodigo().getPrecio());
                calzadotb.setFechaRegInv(listVenta.get(i).getCodigo().getFechaRegInv());
                calzadotb.setFechaVenta(listVenta.get(i).getFechaVenta());
                calzadotb.setCategoria(listVenta.get(i).getCodigo().getCategoria());
                
                listFinal.add(calzadotb);
            }
        }
        
        listCalzadoVenta=FXCollections.observableArrayList(listFinal);
        listFinal.clear();
        listVenta.clear();
        tlbVenta.setItems(listCalzadoVenta);

        clmnMarcaVenta.setCellValueFactory(new PropertyValueFactory<CalzadoTB, String>("marca"));
        clmnEstiloVenta.setCellValueFactory(new PropertyValueFactory<CalzadoTB, String>("modelo"));
        clmnTallaVenta.setCellValueFactory(new PropertyValueFactory<CalzadoTB, String>("numero"));
        clmnColorVenta.setCellValueFactory(new PropertyValueFactory<CalzadoTB, String>("color"));
        clmnPrecioVenta.setCellValueFactory(new PropertyValueFactory<CalzadoTB, String>("precio"));
        clmnFechaVenta.setCellValueFactory(new PropertyValueFactory<CalzadoTB, String>("fechaVenta"));
    }
```

#### CU-11 Realizar Corte De Caja

```java
public void hacerCorte(){
        float fondoCaja=0;
        if(txtFondoDeCaja.getText().equals("")){
            fondoCaja=0;
        }else{
            fondoCaja=Float.valueOf(txtFondoDeCaja.getText());
        }
        float gastos=0;
        float totalEnCaja;
        if(text.size()==0){
            totalEnCaja=totalVenta-gastos;
            ptCorte.imprimirCorte(fondoCaja, totalVenta, gastos, totalEnCaja, listGastos);
            Alert boxAlert=new Alert(Alert.AlertType.CONFIRMATION);
            boxAlert.setTitle("Corte de Caja Realizado");
            boxAlert.setHeaderText(null);
            boxAlert.initStyle(StageStyle.UTILITY);
            boxAlert.setContentText("Fondo de Caja= "+fondoCaja+"\n"+"Ventas Totales= "+totalVenta+"\n"+"Total de Gastos= "+gastos+"\n"+"Total en Caja= "+totalEnCaja);
            Optional<ButtonType> result= boxAlert.showAndWait();
        }else{
            System.out.println("Hola "+text.size());
            boolean sigue=false;
            for(int i=0;i<text.size();i++){
                if(text.get(i).getText().equals("") || contexto.get(i).getText().equals("")){
                    Alert boxAlert=new Alert(Alert.AlertType.INFORMATION);
                    boxAlert.setTitle("Completa todos los campos");
                    boxAlert.setHeaderText(null);
                    boxAlert.initStyle(StageStyle.UTILITY);
                    boxAlert.setContentText("Por favor no dejes ningun campo de gasto vacio.\n"
                            + "si no es necesario ese campo eliminalo");
                    boxAlert.showAndWait();
                    sigue=false;
                    break;
                }else{
                    objGastos=new Gastos(contexto.get(i).getText(), Float.valueOf(text.get(i).getText()));
                    listGastos.add(objGastos);
                    gastos=gastos+Float.valueOf(text.get(i).getText());
                    sigue=true;
                }
                
            }
            
            if(sigue==true){
                totalEnCaja=totalVenta-gastos;
                ptCorte.imprimirCorte(fondoCaja, totalVenta, gastos, totalEnCaja, listGastos);
                listGastos.clear();
                Alert boxAlert=new Alert(Alert.AlertType.CONFIRMATION);
                boxAlert.setTitle("Corte de Caja Realizado");
                boxAlert.setHeaderText(null);
                boxAlert.initStyle(StageStyle.UTILITY);
                boxAlert.setContentText("Fondo de Caja= "+fondoCaja+"\n"+"Ventas Totales= "+totalVenta+"\n"+"Total de Gastos= "+gastos+"\n"+"Total en Caja= "+totalEnCaja);
                Optional<ButtonType> result= boxAlert.showAndWait();
                if(result.get()==ButtonType.OK){
                    ventana.inicio();
                }
            }
        }  
    }
```



#### CU-12 Registrar Empleado

```java
Trabajador empleado=new Trabajador();
    @FXML
    private void guardarEmpleado() throws Exception{
        Trabajador empleado=new Trabajador();
        if (Integer.parseInt(edad.getText()) > 18) {
            String id = idEmp.getText();
            String nombreEmp = nombre.getText();
            String cargoEmp = cargo.getText();
            String dir = direccion.getText();
            String age = edad.getText();

            empleado.setIdTrabajador(id);
            empleado.setNomCompleto(nombreEmp);
            empleado.setCargo(cargoEmp);
            empleado.setDireccion(dir);
            empleado.setEdad(Integer.parseInt(age));
            empleadoControl.create(empleado);
            mostrarTablaEmpleados();
            vBoxAdd.setVisible(false);
            Alert boxAlert = new Alert(Alert.AlertType.INFORMATION);
            boxAlert.setTitle("Exito");
            boxAlert.setHeaderText(null);
            boxAlert.initStyle(StageStyle.UTILITY);
            boxAlert.setContentText("Se agrego con exito");
            Optional<ButtonType> result = boxAlert.showAndWait();
        } else {
            Alert boxAlert = new Alert(Alert.AlertType.INFORMATION);
            boxAlert.setTitle("");
            boxAlert.setHeaderText(null);
            boxAlert.initStyle(StageStyle.UTILITY);
            boxAlert.setContentText("No puedes Registrar a menores de edad, debido a la ley federal de trabajo");
            Optional<ButtonType> result = boxAlert.showAndWait();
        }

    }
```

#### CU-13 Eliminar Empleado

```java
@FXML
    public void eliminarEmpleado() throws IllegalOrphanException, NonexistentEntityException{
        Alert boxAlert=new Alert(Alert.AlertType.CONFIRMATION);
        boxAlert.setTitle("Eliminar Empleado");
        boxAlert.setHeaderText(null);
        boxAlert.initStyle(StageStyle.UTILITY);
        boxAlert.setContentText("Esta seguro de eliminar el empleado");
        Optional<ButtonType> result= boxAlert.showAndWait();
        
        if(result.get()==ButtonType.OK){
            empleadoControl.destroy(idEmp.getText());
            mostrarTablaEmpleados();
            cancelar();
        }
    }
```

#### CU-14 Visualizar Lista Empleados

```java
public void mostrarTablaEmpleados() {
        listEmpleado = FXCollections.observableArrayList(empleadoControl.findEmpleado());
        tlbEmpleado.setItems(listEmpleado);

        clmnId.setCellValueFactory(new PropertyValueFactory<Calzado, String>("idTrabajador"));
        clmnNombre.setCellValueFactory(new PropertyValueFactory<Calzado, String>("nomCompleto"));
        clmnCargo.setCellValueFactory(new PropertyValueFactory<Calzado, String>("cargo"));
        clmnDireccion.setCellValueFactory(new PropertyValueFactory<Calzado, String>("direccion"));
        clmnEdad.setCellValueFactory(new PropertyValueFactory<Calzado, Number>("edad"));
    }
```

#### CU-15 Cerrar Sesión

```java
private Ventanas ventana=new Ventanas();
    @FXML
    public void close(){
        Alert boxAlert=new Alert(Alert.AlertType.CONFIRMATION);
        boxAlert.setTitle("Cerrar Sesión");
        boxAlert.setHeaderText(null);
        boxAlert.initStyle(StageStyle.UTILITY);
        boxAlert.setContentText("Esta seguro se cerrar sesión");
        Optional<ButtonType> result= boxAlert.showAndWait();
        
        if(result.get()==ButtonType.OK){
            ventana.inicio();
        }
    }
```

#### CU-16 Registrar Propietario

```java
@FXML
    private void guardarEmpleado() throws Exception{
        Trabajador empleado=new Trabajador();
        if (Integer.parseInt(edad.getText()) > 18) {
            String id = idEmp.getText();
            String nombreEmp = nombre.getText();
            String cargoEmp = cargo.getSelectionModel().getSelectedItem().toString();
            String dir = direccion.getText();
            String age = edad.getText();
            empleado.setCargo(cargoEmp);
            empleado.setIdTrabajador(id);
            empleado.setNomCompleto(nombreEmp);
            //empleado.setCargo(cargoEmp);
            empleado.setDireccion(dir);
            empleado.setEdad(Integer.parseInt(age));
            if(cargoEmp=="Propietario"){
                TextInputDialog dialogoTextual=new TextInputDialog();
                dialogoTextual.setTitle("Confimación de Usuario");
                dialogoTextual.setHeaderText("Para confirmar el registro del usuario");
                dialogoTextual.setContentText("Ingrese su Clave");
                dialogoTextual.initStyle(StageStyle.UTILITY);
                
                Optional<String> respuesta=dialogoTextual.showAndWait();
                boolean resp=false;
                if(respuesta.isPresent()){
                    resp=verificarClave(respuesta.get());
                    System.out.println(resp);
                    if(resp==true){
                        System.out.println("Entro a 551");
                        empleadoControl.create(empleado);
                        mostrarTablaEmpleados();
                        Alert boxAlert = new Alert(Alert.AlertType.INFORMATION);
                        boxAlert.setTitle("Exito");
                        boxAlert.setHeaderText(null);
                        boxAlert.initStyle(StageStyle.UTILITY);
                        boxAlert.setContentText("Se agrego con exito");
                        Optional<ButtonType> result = boxAlert.showAndWait();
                    }else{
                        Alert boxAlert = new Alert(Alert.AlertType.INFORMATION);
                        boxAlert.setTitle("Contraseña Incorrecta");
                        boxAlert.setHeaderText(null);
                        boxAlert.initStyle(StageStyle.UTILITY);
                        boxAlert.setContentText("ingresa una contraseña correcta");
                        Optional<ButtonType> result = boxAlert.showAndWait();
                    }
                }          
                
            }else if(empleado.getCargo()!="Propietario"){
                System.out.println("Entro a 571");
                empleadoControl.create(empleado);
                mostrarTablaEmpleados();
                Alert boxAlert = new Alert(Alert.AlertType.INFORMATION);
                boxAlert.setTitle("Exito");
                boxAlert.setHeaderText(null);
                boxAlert.initStyle(StageStyle.UTILITY);
                boxAlert.setContentText("Se agrego con exito");
                Optional<ButtonType> result = boxAlert.showAndWait();
            }
            
            
        } else {
            Alert boxAlert = new Alert(Alert.AlertType.INFORMATION);
            boxAlert.setTitle("");
            boxAlert.setHeaderText(null);
            boxAlert.initStyle(StageStyle.UTILITY);
            boxAlert.setContentText("No puedes Registrar a menores de edad, debido a la ley federal de trabajo");
            Optional<ButtonType> result = boxAlert.showAndWait();
        }

    }
```

