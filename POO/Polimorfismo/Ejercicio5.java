/*
Ejercicio 5 — Polimorfismo y gestión de flotas de vehículos

Enunciado:
Diseña una jerarquía de vehículos con una clase base `Vehiculo` que tenga métodos como
`public void mover()` y `public double consumirCombustible(double distancia)`. Implementa subclases
`Coche`, `Moto` y `Camion` que sobrescriban los métodos para reflejar comportamientos distintos (consumo,
velocidad, capacidad de carga).

Tareas:
- Definir `Vehiculo` y las subclases `Coche`, `Moto` y `Camion` con atributos y métodos apropiados.
- Implementar una clase `GestorFlota` que mantenga una lista de `Vehiculo` y tenga operaciones como
	`recorrerTodos(double distancia)` que llame a `mover()` y acumule combustible consumido usando
	`consumirCombustible(...)`, demostrando polimorfismo.
- (Reto) Añadir un comportamiento específico por tipo (por ejemplo, `Camion` puede cargar/descargar) y mostrar
	cómo usar `instanceof` o casting cuando sea estrictamente necesario.

Nota: Mantén las implementaciones abiertas para que puedas resolverlo tú mismo.
*/

