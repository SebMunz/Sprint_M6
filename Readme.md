***
## Tabla de contenidos

1. [Integrantes del Equipo](#Integrantes-del-Equipo)
2. [Información General](#Información-General)
3. [Problema de la Empresa](#Problema-de-la-Empresa)
4. [Planteamiento de la Solución](#Planteamiento-de-la-Solución)
5. [Entorno](#Entorno)

***
### 1. Integrantes del Equipo <a name="Integrantes-del-Equipo"></a>

Equipo 2: El Piero tiene sueño.

Integrantes:
* [Nelson Medel](https://github.com/chinomedel/Sprint_M6)
* [Sebastián Muñoz](https://github.com/SebMunz/Sprint_M6)
* [Pamela Correa](https://github.com/Pame-b182/Sprint_M6)


***
### 2. Información General <a name="Información-General"></a>

Nombre del proyecto:
<br> Sprint Módulo 6: Desarrollo de aplicaciones JEE con SpringBoot.

El proyecto consiste en la creación de un sitio web dinámico, delineado bajo el patrón de diseño Modelo Vista Controlador,
compuesta por los siguientes elementos:
#### Model
1. Domain
- **dto**: Data Transfer Object, permiten entregar la información requerida por los Request.
- **repository**: Interfaces que son conocidas por Service.
- **service**: Servicios que satisfacen los requerimientos de los Controladores.
2. Persistence
- **crud**: Interfaces que heredan de CrudRepository.
- **entity**: Clases que implementan el estereotipo @Entity y que mapean las tablas de la base de datos.
- **mapper**: Interfaces que trabajan con MapStruct y que gestionan el mapeo entre la clase Entity y el DTO.
- **repository**: Implementan las interfaces de domain.repository y utilizan las interfaces crud para realizar el CRUD 
- a la Base de Datos.
#### Web
- **controller**: Implementan el estereotipo @Controller, para la interacción con las vistas.
- **restcontroller**: Implementa el estereotipo @RestController, para la interacción vía Rest.
- **security**: Permite gestionar todo lo relativo a la seguridad de la aplicación web.
#### View
- **html**: HyperText Markup Language, permite estructurar y desplegar la página web y sus contenidos.
- **css**: Cascading Style Sheets, permite manejar el diseño y presentación de la página web.
- **js**: JavaScript, permite añadir características interactivas al sitio web.

***
### 3. Problema de la Empresa <a name="Problema-de-la-Empresa"></a>

Una Compañía de Asesorías en Prevención de Riesgos carece de un sistema de información que le permita administrar toda
la información que se genera, además de controlar las actividades y el recurso humano.
Posee problemas con la planificación de las visitas a terreno, ya que generalmente los profesionales no están
disponibles para informar sus actividades futuras. Además, estas visitas a veces no tienen el efecto esperado por la
falta de coordinación con el cliente.
Respecto a las capacitaciones, a veces asisten trabajadores que no tienen que ver con la charla, o bien, no se coordina
la ejecución de la capacitación, lo que trae consigo multas para la empresa.
No existen registros del profesional que ha estado con mayor actividad ni se sabe dónde está cada uno.
No se tiene un control de los clientes que pagan y los que no, lo que hace que muchas actividades de los profesionales
corran por cuenta de la empresa, generando desbalances financieros.
Las actividades se registran en carpetas, lo que dificulta el seguimiento de las asesorías y el resumen de resultados
por empresa. Además, generalmente no se cumplen ciertas actividades de control de implementación de soluciones y a veces
no se ha cumplido con la dirección del trabajo, lo que genera multas para los clientes, bajando la calidad del servicio.
Los profesionales que han atendido la empresa esporádicamente han variado, no existiendo un registro de la totalidad de
actividades preventivas realizadas y no se tiene certeza de los avances.

***
### 4. Planteamiento de la Solución <a name="Planteamiento-de-la-solución"></a>

Se presenta como solución tecnológica un sitio web dinámico desarrollado en SpringBoot, que cubre los procesos de negocio
descritos y como propuesta para una mejora en la gestión, el control, la seguridad, y disponibilidad de información
para la empresa y sus clientes.
El sitio web permite el ingreso al sistema a través de un inicio de sesión, el registro de usuarios de acuerdo a su tipo
(cliente, administrativo o profesional), la incorporación de un nuevo usuario, la modificación de sus datos, el
almacenamiento de estos usuarios y su edición en una base de datos relacional. Además permite listar las visitas realizadas
a cada uno de los clientes, responder Checklist (listar los chequeos de una visita), listar los pagos realizados
por los clientes y crear o agregar un pago al sistema.

***
### 5. Entorno <a name="Entorno"></a>
Para este proyecto, utilizamos la siguiente configuración:
- IntelliJ IDEA Community Edition
- Maven
- Java
- SpringBoot
- Spring Framework
- Spring Security
- HTML
- CSS
- JavaScript
- MySql
- Tomcat
- Java Persistence API (JPA)