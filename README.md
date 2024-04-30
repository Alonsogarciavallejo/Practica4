# Practica4
Esta práctica esta realizada por Alonso García Vallejo 
En la que podemos ver la distancia de edición entre dos palabras según lo expuesto en las diapositivas de Dan Jurafsky a traves de un algoritmo en la clase de calculadorasdedistancias.
La clase Principal:
Public class principal {: Esto define una clase llamada principal. En Java, por convención, los nombres de las clases comienzan con mayúscula.
Public static void main(String[] args) {: Este es el método principal (main) que se ejecuta cuando ejecutas el programa. Toma un argumento de matriz de cadenas args, que es una convención en Java para pasar argumentos desde la línea de comandos. Es estático (static), lo que significa que pertenece a la clase en lugar de a una instancia específica de la clase.
String s1 = "casa";: Declara una variable s1 de tipo String y le asigna el valor "casa". Esto crea una cadena de texto con el contenido "casa".
String s2 = "calle";: Declara una variable s2 de tipo String y le asigna el valor "calle". Esto crea otra cadena de texto con el contenido "calle".
System.out.println("La distancia de edición entre \"" + s1 + "\" y \"" + s2 + "\" es: " + CalculadorDistancias.CalcularDistancias(s1, s2));: Imprime en la consola un mensaje que incluye las cadenas s1 y s2, y la distancia de edición entre ellas. Utiliza el método CalcularDistancias de la clase CalculadorDistancias para calcular esta distancia.
La clase Calculadoradedistancias:
Public class CalculadoraDistancias {: Define una clase llamada CalculadoraDistancias.
Public static int calcularDistancia(String s1, String s2) {: Declara un método público y estático llamado calcularDistancia, que toma dos cadenas de texto s1 y s2 como entrada y devuelve un valor entero. Este método actúa como un punto de entrada para calcular la distancia de edición entre las dos cadenas.
Return calcularDistanciaRecursiva(s1, s2, s1.length(), s2.length());: Dentro del método calcularDistancia, se llama a un método privado y recursivo llamado calcularDistanciaRecursiva con las cadenas s1 y s2, así como sus longitudes s1.length() y s2.length() respectivamente.
Private static int calcularDistanciaRecursiva(String s1, String s2, int m, int n) {: Este método privado y estático es el núcleo del cálculo de la distancia de edición. Toma dos cadenas s1 y s2, junto con dos enteros m y n que representan las longitudes actuales de las cadenas.
En la implementación de calcularDistanciaRecursiva, se manejan tres casos principales:
Si una de las cadenas es vacía, la distancia es simplemente la longitud de la otra cadena.
Si los últimos caracteres de ambas cadenas son iguales, ignoramos esos caracteres y procesamos las cadenas restantes.
Si los últimos caracteres son diferentes, consideramos las tres operaciones posibles: eliminar un carácter, insertar un carácter o reemplazar un carácter.
Se calcula la distancia de edición recurriendo a las tres operaciones posibles (eliminar, insertar y reemplazar) y se devuelve el mínimo de estas distancias.
