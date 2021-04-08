# Clima API

[![danielrincon-m](https://circleci.com/gh/danielrincon-m/RINCON-ARSW-T2.svg?style=svg)](https://app.circleci.com/pipelines/github/danielrincon-m/RINCON-ARSW-T2)
[![Heroku](img/heroku_long.png)](https://rincon-arsw-t2.herokuapp.com/)

## Descripción 🆒

Se desarrolló una aplicación de trata de una interfaz entre el cliente y dos API externas: la primera es la API de OpenWeather para obtener el clima de un lugar, mostrándonos varios datos del clima actual de esa ubicación, la seguna es la API de Google Maps para visualizar el sitio en un mapa global.

La arquitectura de los servicios se muestra a continuación:

![Arquitectura](img/WeatherDiagrams.svg)


## Implementación ⌨️

Para la implementación, contamos con un front-end, que nos mostrará todos los datos necesarios para dar un vistazo al clima de una ubicación, junto a un mapa de esta ubicación, este front-end se conectará a una API funcionando en Heroku, la cual se comunicará a su vez con la API correspondiente en OpenWeather, y que cuenta con un sistema de caché en memoria que guarda durante 5 minutos las peticiones realizadas para evitar la sobrecarga en el API externo.

## Extensibilidad 

El proyecto puede ser extendido colocando una capa de clima sobre el mapa mostrado, también podría actualizarse en tiempo real el clima de las ubicaciones, y poder mostrar múltiples ubicaciones a al vez.

## Descarga del proyecto ⬇️

Clone el proyecto utilizando el siguiente comando:

```
git clone https://github.com/danielrincon-m/AREP_LAB7.git
```

## Ejecución del proyecto ▶️

Para ejecutar el proyecto deberá contar con una instalación de Maven en su sistema, puede obtenerlo desde la [página oficial.][mvnLink]

Luego de tener el proyecto, debe navegar al directorio principal y ejecutar el comando:

```
mvn spring-boot:run
```
<!--
## Reporte de pruebas ⭕

Se utilizó el framework [REST Assured](#herramientas-utilizadas-%EF%B8%8F) para realizar pruebas sobre la API REST desarrollada, se comprobó que las peticiones estuviesen siendo procesadas y que las respuestas fuesen válidas.

-->

## Correr las pruebas unitarias 🧪

### Prerrequisitos

Un IDE que soporte proyectos Java, o una instalación de Maven en su sistema, puede obtenerlo desde
la [página oficial.][mvnLink]

### Ejecución de pruebas

Las pruebas pueden ser ejecutadas desde la sección de pruebas de su IDE o si tiene maven puede navegar a la carpeta principal del proyecto y ejecutar el comando

```
mvn test
```

## Documentación del código fuente 🌎

La documentación del proyecto puede ser encontrada en la carpeta [docs](/docs).

También puede ser generada con Maven, clonando el proyecto y ejecutando el siguiente comando en la carpeta TempConverter:

```
mvn javadoc:javadoc
```

## Herramientas utilizadas 🛠️

* [Visual Studio Code](https://code.visualstudio.com/) - IDE de desarrollo
* [Maven](https://maven.apache.org/) - Manejo de Dependencias
* [JUnit](https://junit.org/junit4/) - Pruebas unitarias
* [GitHub](https://github.com/) - Repositorio de código
* [Spring-boot](https://spring.io/projects/spring-boot) - Framework web
* [REST Assured](https://rest-assured.io/) - Herramienta de pruebas para el API REST

## Autor 🧔

**Daniel Felipe Rincón Muñoz:** *Planeación y desarrollo del proyecto* -
[Perfil de GitHub](https://github.com/danielrincon-m)

## Licencia 🚀

Este proyecto se encuentra licenciado bajo **GNU General Public License** - consulte el archivo [LICENSE.md](LICENSE.md)
para más detalles.

<!-- 
## Acknowledgments 

* Hat tip to anyone whose code was used
* Inspiration
* etc
-->

[gitLink]: https://git-scm.com/downloads
[mvnLink]: https://maven.apache.org/download.cgi
