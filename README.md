Microservicio 5: Gateway
<br>
Tecnologías Utilizadas:
<br>
SpringBoot (Versión 3.2.0)
<br>
Java (Versión 17.+.+) Compatible con la version de SpringBoot
<br>
Instrucciones de Ejecución:
<br>
primero abre el proyecto en el ide de java, eso hara que se reconozca el proyecto y maven instale las dependencias.
La ejecucion de los Microservicios en el siguiente orden:
<br>

Config
<br>
Eureka
<br>
Client
<br>
Vehicle
<br>
Gateway (actual)
<br>
<br>
API Endpoint:
Endpoint de Cliente: http://localhost:8090/api/client/
<br>

Endpoint de Vehicle: http://localhost:9090/api/vehicle/
<br>

Endpoint de Eureka: http://localhost:8761/eureka

Endpoint del gateway: http://localhost:8080/

Los links a los otros microservicios seran agregados proximamente en esta seccion:
