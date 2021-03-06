# Clima API

[![danielrincon-m](https://circleci.com/gh/danielrincon-m/RINCON-ARSW-T2.svg?style=svg)](https://app.circleci.com/pipelines/github/danielrincon-m/RINCON-ARSW-T2)
[![Heroku](img/heroku_long.png)](https://rincon-arsw-t2.herokuapp.com/)

## Descripci贸n 馃啋

Se desarroll贸 una aplicaci贸n que trata de una interfaz entre el cliente y dos API externas: la primera es la API de OpenWeather para obtener el clima de un lugar, mostr谩ndonos varios datos del clima actual de esa ubicaci贸n, la seguna es la API de Google Maps para visualizar el sitio en un mapa global.

La arquitectura de los servicios se muestra a continuaci贸n:

![Arquitectura](img/WeatherDiagrams.svg)


## Implementaci贸n 鈱笍

Para la implementaci贸n, contamos con un front-end, que nos mostrar谩 todos los datos necesarios para dar un vistazo al clima de una ubicaci贸n, junto a un mapa de esta ubicaci贸n, este front-end se conectar谩 a una API funcionando en Heroku, la cual se comunicar谩 a su vez con la API correspondiente en OpenWeather, y que cuenta con un sistema de cach茅 en memoria que guarda durante 5 minutos las peticiones realizadas para evitar la sobrecarga en el API externo.

## Extensibilidad 

El proyecto puede ser extendido colocando una capa de clima sobre el mapa mostrado, tambi茅n podr铆a actualizarse en tiempo real el clima de las ubicaciones, y poder mostrar m煤ltiples ubicaciones a al vez.

## Descarga del proyecto 猬囷笍

Clone el proyecto utilizando el siguiente comando:

```
git clone https://github.com/danielrincon-m/RINCON-ARSW-T2.git
```

## Ejecuci贸n del proyecto 鈻讹笍

Para ejecutar el proyecto deber谩 contar con una instalaci贸n de Maven en su sistema, puede obtenerlo desde la [p谩gina oficial.][mvnLink]

Luego de tener el proyecto, debe navegar al directorio principal y ejecutar el comando:

```
mvn spring-boot:run
```
<!--
## Reporte de pruebas 猸?

Se utiliz贸 el framework [REST Assured](#herramientas-utilizadas-%EF%B8%8F) para realizar pruebas sobre la API REST desarrollada, se comprob贸 que las peticiones estuviesen siendo procesadas y que las respuestas fuesen v谩lidas.

-->

## Correr las pruebas unitarias 馃И

### Prerrequisitos

Un IDE que soporte proyectos Java, o una instalaci贸n de Maven en su sistema, puede obtenerlo desde
la [p谩gina oficial.][mvnLink]

### Ejecuci贸n de pruebas

Las pruebas pueden ser ejecutadas desde la secci贸n de pruebas de su IDE o si tiene maven puede navegar a la carpeta principal del proyecto y ejecutar el comando

```
mvn test
```

## Documentaci贸n del c贸digo fuente 馃寧

La documentaci贸n del proyecto puede ser encontrada en la carpeta [docs](/docs).

Tambi茅n puede ser generada con Maven, clonando el proyecto y ejecutando el siguiente comando en la carpeta TempConverter:

```
mvn javadoc:javadoc
```

## Herramientas utilizadas 馃洜锔?

* [Visual Studio Code](https://code.visualstudio.com/) - IDE de desarrollo
* [Maven](https://maven.apache.org/) - Manejo de Dependencias
* [JUnit](https://junit.org/junit4/) - Pruebas unitarias
* [GitHub](https://github.com/) - Repositorio de c贸digo
* [Spring-boot](https://spring.io/projects/spring-boot) - Framework web
* [REST Assured](https://rest-assured.io/) - Herramienta de pruebas para el API REST

## Autor 馃

**Daniel Felipe Rinc贸n Mu帽oz:** *Planeaci贸n y desarrollo del proyecto* -
[Perfil de GitHub](https://github.com/danielrincon-m)

## Licencia 馃殌

Este proyecto se encuentra licenciado bajo **GNU General Public License** - consulte el archivo [LICENSE.md](LICENSE.md)
para m谩s detalles.

<!-- 
## Acknowledgments 

* Hat tip to anyone whose code was used
* Inspiration
* etc
-->

[gitLink]: https://git-scm.com/downloads
[mvnLink]: https://maven.apache.org/download.cgi
