# LABORATORIO 2 (ARSW) 📚

## INTEGRANTES:📋
* Johan Stiven Guerrero Pineda
* Jonathan Fabian Paez Torres


## Parte I - Introducción a Hilos en Java 📌

### 1. Creación, puesta en marcha y coordinación de hilos

Una vez ejecutado el programa podemos ver que para la ejecucion de los numeros primos entre 0 y 30.000.000 esta usando **12 nucleos**

![](https://github.com/Johannes26/ARSW-LAB02/blob/master/img/putno1.PNG)

### 2. 

### 3.

## Parte II 📜

Otro problema que se identifico es que no se esta generando bloqueo en el momento de registrar la llegada por lo tanto todos los hilos pueden acceder y reportar
varios galgos en posiciones iguales

![](https://github.com/Johannes26/ARSW-LAB02/blob/master/img/Parte2.PNG)


## Parte III 📐

### 1.

Con la implementacion del join() se muestra el resultado una vez todos los hilos finalicen su ejecucion

![](https://github.com/Johannes26/ARSW-LAB02/blob/master/img/Parte3-1.PNG)

### 2 .

Una region critica que se pudo identificar es que todos los hilos acceden al mismo tiempo para registrar la llegada, por este motivo 
varios galgos pueden aparecer en la misma posicion, para corregir esto se uso el metodo synchronized.

![](https://github.com/Johannes26/ARSW-LAB02/blob/master/img/parte3-2.PNG)

### 3.
![](https://github.com/Johannes26/ARSW-LAB02/blob/master/img/parte3-3.PNG)
