# LITERALURA

![Liter-Alura](img/Liter-Alura-Banner.png)


## Descripción

Este proyecto permite al usuario realizar la busqueda de una gran cantidad y gama de Libros a través de una API externa. Toda vez que el Título del libro es encontrado se agrega de forma automática a la base de datos Local.

El sistema:
- Muestra un menú con opciones para la busqueda de los Libros deseados.
- Guarda la relación de los libros con los Autores de los mismos.
- Garantiza que no haya duplicidad tanto de Libros así como de Autores, ya registrados en la base de Datos Local.
- Muestra diferentes opciones de consulta, así como el top 10 de Títulos de Libros mas descargados desde la API Externa.

## Tecnologías Utilizadas

- Mac Os ![OS](https://img.shields.io/badge/mac%20os-000000?style=for-the-badge&logo=apple&logoColor=white)
- Intellij IDEA ver. 2024.1.1 ![IDE](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
- JDK de Java 21.0.2 ![JDK](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
- Servidor Xampp Apache ![Apache](https://img.shields.io/badge/apache-%23D42029.svg?style=for-the-badge&logo=apache&logoColor=white)
- Base de Datos MySql ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)
- Spring Boot ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)


    #### Notas:
    El sistema realiza una busqueda de los Títulos de los libros proporcionados por el usuario a través de una API externa.
    los cuales son instanciados y pasados a guardar en una base de datos Local MySql, con un servidor XAMPP Apache.
    El sistema valida que no se ingresen títulos y autores de manera duplicada, informando al usuario de dicha situación.
    Así mismo realiza la consulta de Libros y Autores ya almacenados en la Base de Datos Local.
    En el caso donde los Autores tienen mas de un Libro resgistrado, estos serán listados junto con el resto de datos de dicho Autor.
    El usuario tiene la posiblidad de consultar los Libros registrados en la Base de Datos por un Idioma determinado.
    Y muestra una estadística del top 10 de los libros mas descargados en la Web.
    Se establece una relación a nivel de Base de Datos entre los Libros y Autores.



## Demostración del Sistema

Menú de inicio al sistema.
![Menu-inicio](img/01-Menu.png)

Busca Libro Solicitado por el usuario.
![Busca-Libro-Solicitado](img/02-Buscar_Libro.png)

Muestra los Libros Registrados en la Base de Datos.
![Muestra-Libros-Registrados](img/03-Libros_Registrados.png)

Muestra los Autores Registrados en la Base de Datos.
![Autores-Registrados](img/04-Autores_Registrados.png)

Muestra los Autores vivos en determinado año.
![Autor-Year](img/05-Autor_Year.png)

Muestra Libros por un determinado Idioma.
![Libros-Idioma](img/06-Idioma.png)

Top 10 Libros mas descargados en la Web.
![Top-10-Libros](img/07-Tpo_10.png)

Opción de Menú no valida.
![Menu-Invalido](img/08-Menu_invalido.png)

Mensaje de libro no encontrado en la base de Datos Externa.
![Libro-No-Encontrado](img/09-Libro_NO_Encontrado.png)

Base de Datos MySql Tabla Libros.
![Tabla-Libros](img/10-Tabla_Libros.png)

Base de Datos MySql Tabla Autores.
![Tabla-Autores](img/11-Tabla_Autores.png)

Salida y fin del sistema
![Salida](img/12-Salida.png)


## Estado del Proyecto

El proyecto se encuentra en su versión 1.0.0.

## Acceso al Proyecto

Puedes acceder al proyecto y obtener el código fuente desde su repositorio en [GitHub LiterAlura](https://github.com/MAValerdi/LiterAlura).

## Instrucciones de Uso

1. Clona el repositorio desde GitHub.
2. Asegurate que el proyecto este en alguna ubicación en tu equipo local.
3. Importa el proyecto desde tu IDE Intellij IDEA o el IDE de tu preferencia.
4. Ejecuta la aplicación y sigue las instrucciones en pantalla.
5. Deberás instalar el servidor XAMPP.
6. Crear la base de datos en MySql desde phpMyAdmin de XAMPP
7. Veriricar y en su caso agregar las dependencias de MySql y Web en el archivo pom.xml


## Autor
Mario Alberto Valerdi Garduño
[Linkedin Mario Valerdi](https://www.linkedin.com/in/mariovalerdi).


#### Anotaciones finales:
Challenge "LITERALURA".
Del curso Java con Spring Boot
de ALURA Latam, Oracle ONE G6
