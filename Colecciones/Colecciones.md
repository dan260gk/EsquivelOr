# Java Collection Framework (marco de colecciones de java)

## ¿Qué es una colección en Java?
Una colección representa una sola unidad de objetos, es decir, un grupo.

## ¿Qué es un framework en Java?
* Proporciona arquitectura prefabricada.
* Representa un conjunto de clases e interfaces.
* Es opcional.

## ¿Qué es el Collection Framework?
El Collection Framework es una arquitectura unificada para representar y manipular colecciones, lo que permite que las colecciones se manipulen independientemente de los detalles de implementación. 
Proporciona muchas interfaces (Set, List, Queue, Deque) y clases (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

Las principales ventajas de un marco de colecciones son que:

* **Reduce el esfuerzo de programación** al proporcionar estructuras de datos y algoritmos asi que no es necesario escribirlos.
* **Aumenta el rendimiento al proporcionar** implementaciones de alto rendimiento de estructuras de datos y algoritmos. Debido a que las diversas implementaciones de cada interfaz son intercambiables, los programas se pueden ajustar cambiando implementaciones.
* **Proporciona interoperabilidad entre APIs no relacionadas** mediante el establecimiento de un lenguaje común para pasar colecciones de un lado a otro.
* **Reduce el esfuerzo necesario para aprender las APIs** al no requerir que aprenda multiples APIs.
* **Reduce el esfuerzo requerido para diseñar e implementar APIs** al no requerir que programe las APIs.
* **Fomenta la reutilización del software** al proporcionar una interfaz estándar para colecciones y algoritmos con los que manipularlos.

### El Java Collection Framework consta de:

#### Interfaces de colección (*Collection interfaces*)
Representa diferentes tipos de colecciones, como conjuntos, listas y mapas. Estas interfaces forman la base del *framework*.

#### Implementaciones de propósito general (*General-purpose implementations*)
Implementaciones primarias de las interfaces de colección.

#### Implementaciones heredadas (*Legacy implementations*)
Las clases de colección de versiones anteriores, Vector y Hashtable, se actualizaron para implementar las interfaces de colección.

#### Implementaciones para propósitos especiales (*Special-purpose implementations*)
Implementaciones diseñadas para su uso en situaciones especiales. Estas implementaciones muestran características de rendimiento, restricciones de uso o comportamiento especiales.

#### Implementaciones concurrentes (*Concurrent implementations*)
Implementaciones diseñadas para uso altamente concurrente.

#### Implementaciones de wrapper. (*Wrapper implementations*)
Agrega funcionalidad, como sincronización, a otras implementaciones.

#### Implementaciones de conveniencia (*Convenience implementations*)
"Mini-implementaciones" de alto rendimiento de las interfaces de colección.

#### Implementaciones abstractas (*Abstract implementations*)
Implementaciones parciales de las interfaces de colección para facilitar implementaciones personalizadas.

#### Algoritmos (*Algorithms*)
Métodos estáticos que realizan funciones útiles en colecciones, como ordenar una lista.

#### Infraestructura (*Infrastructure*)
Interfaces que brindan soporte esencial para las interfaces de colección.

#### Utilidades de matriz (*Array Utilities*)
Funciones de utilidad para matrices de tipos primitivas y objetos de referencia. No es, estrictamente hablando, una parte del marco de colecciones, esta característica se agregó a la plataforma Java al mismo tiempo que el marco de colecciones y se basa en parte de la misma infraestructura.


##### Referencias: 

* _https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html_
* _https://www.javatpoint.com/collections-in-java_
