# Caso 2: Métodos, Static y Excepciones
- Crear clase CuentaBancaria con saldo privado. 
- Métodos depositar y retirar con validación. 
- Usar static para contador. 
- Manejar excepciones. 
- Análisis: uso de static y manejo de errores. 

## Requerimientos implementados
1. Clase `CuentaBancaria` con atributo `saldo` privado.
2. Metodo `depositar(double monto)` con validación.
3. Metodo `retirar(double monto)` con validación.
4. Uso de atributo `static` para contar cuentas creadas.
5. Manejo de errores con excepciones personalizadas.

## Estructura del proyecto
- `Main.java`: clase de prueba donde se crean cuentas, se ejecutan operaciones y se muestran las excepciones.
- `CuentaBancaria.java`: clase principal que representa la cuenta bancaria y contiene la lógica de saldo, depósitos, retiros y contador static.
- `MontoInvalidoException.java`: excepción personalizada para validar montos incorrectos.
- `SaldoInsuficienteException.java`: excepción personalizada para indicar que no hay saldo suficiente.

## Análisis del caso

### 1) Uso de encapsulamiento
El atributo `saldo` es privado, por lo tanto no puede ser modificado directamente desde fuera de la clase.
Esto protege la integridad del objeto y obliga a que los cambios se realicen mediante métodos controlados.

### 2) Validación en métodos
- `depositar`: solo acepta montos mayores que 0.
- `retirar`: solo acepta montos mayores que 0 y verifica saldo disponible.

Este enfoque evita estados inválidos (por ejemplo, depositos negativos o saldos en negativo por retiros indebidos).

### 3) Uso de `static`
El atributo `contadorCuentas` es `static`, lo que significa que pertenece a la clase y no a cada objeto.
Cada vez que se crea una cuenta, el contador se incrementa y permite conocer cuantas cuentas existen en total.
Esto demuestra el uso correcto de miembros compartidos entre instancias.

### 4) Manejo de excepciones
Se implementan dos excepciones:
- `MontoInvalidoException`: para montos no permitidos.
- `SaldoInsuficienteException`: para retiros que exceden el saldo.

El uso de `try-catch` en `Main` permite capturar errores y mostrar mensajes claros sin detener abruptamente la ejecución del programa.

## Conclusion
La solución cumple con los conceptos pedidos y muestra un uso correcto de encapsulamiento, `static` y manejo de excepciones. Además, permite entender cómo se controlan las operaciones de una cuenta bancaria de forma segura, evitando errores en los montos y protegiendo la integridad del saldo. Por ello, el caso presenta una implementación clara, funcional y alineada con los requerimientos solicitados.