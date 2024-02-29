Dentro de la carpeta docker tienes dos ficheros, el primero es el docker-compose en el que esta una BBDD de postgres y el segundo un dockerfile para crear una imagen
con la mini app de java para desplegarla. Lo primero que tienes que hacer es ejecutar este comando dentro de la carpeta para que se genere la imagen docker en si

docker build -t myorg/myapp .

Cuando ejecutes eso si no te casca seras ya una maldita bestia, asi que el siguiente paso es ejecutar el docker-compose para levantar todo

docker-compose up

Esto te deberia de arrancar la app de java y la BBDD.

Aqui tienes para probar unos servicios basicos para añadir eliminar y listar tus colorcitos

GET http://localhost:8080/color -> todos los colores guardados
GET http://localhost:8080/color/{color} -> busca el color que le pases sustituyendo {color}
GET http://localhost:8080/color/{color} -> elimina el color que le pases sustituyendo {color}
POST http://localhost:8080/color -> crea el color que le indiques pasandole el siguiente body

{
    "name" : "rojo",
    "pigmentation" : "pigmentacion rojo",
    "description" : "primerito color"
}
