# Transformación Digital y a Arquitectura Empresarial.
## Laboratorio 

### Librería 

Programa desarrollado en Java que haya la media y la desviación estandar de una lista de números utilizando una linked list.

### Prerequisitos

* Java 1.8
* Maven 3.6.0 

### Arquitectura

![](https://github.com/CrkJohn/firstWorkshopAREP/blob/master/Imagenes/arquitectura.png)


## Descripción
### LinkedList
El proyecto contiene una LinkedList esta conformada varios nodos y un puntero que es que determina la cabeza de la estructura. La cabeza tiene referencias al primer y último nodo.

![image](https://user-images.githubusercontent.com/13685178/63139762-0a9bc300-bfa5-11e9-8d54-96cef4462b79.png)

Cada nodo de la lista tiene el dato que le corresponde y una referencia al siguiente nodo, en caso de que la referencia sea nula este es cola de linked list

![image](https://user-images.githubusercontent.com/13685178/63139832-5484a900-bfa5-11e9-92b6-af3128de431d.png)


## Ejecutar
### Descagar proyecto y descargar sus dependencias y compilar
```console
arep@arep:~$ git clone https://github.com/CrkJohn/firstWorkshopAREP.git
arep@arep:~$ cd firstWorkshopAREP 
arep@arep:~$ mvn package
```
### Ejecutar test de unidad
```console
arep@arep:~$ mvn test
```
### Generar documentación
```console
arep@arep:~$ mvn javadoc:jar
```


### Licence 

firstWorkshopAREP está licenciado  por GNU General Public License v3.0, ver [licencia](https://github.com/CrkJohn/firstWorkshopAREP/blob/master/LICENSE) para más detalles.

### Autor

John David Ibañez - [CrkJohn](https://github.com/CrkJohn)

Escuela colombina de ingenieria Julio Garavito. 
