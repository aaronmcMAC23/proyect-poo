Algoritmo Promedio
	Definir n, promedio1, calf, suma Como Real
	Definir opcion Como Entero
	Definir calificacionMasBaja, calificacionMasAlta Como Real
	Escribir 'Ingrese el número de calificaciones a registrar: '
	Leer n
	suma <- 0
	calificacionMasBaja <- 5
	calificacionMasAlta <- 10
	Para i<-1 Hasta n Con Paso 1 Hacer
		Escribir 'Ingrese calificación ', i, ':'
		Leer calf
		suma <- suma+calf
		Si calf<calificacionMasBaja Entonces
			calificacionMasBaja <- calf
		FinSi
		Si calf>calificacionMasAlta Entonces
			calificacionMasAlta <- calf
		FinSi
	FinPara
	promedio1 <- suma/n
	Escribir 'Selecciona una opción:'
	Escribir '1. Ver la calificación más baja :('
	Escribir '2. Ver la calificación más alta :)'
	Escribir '3. Ver el promedio de las calificaciones'
	Leer opcion
	// Realizar la operación seleccionada
	Según opcion Hacer
		1:
			Escribir 'La calificación más baja es: ', calificacionMasBaja
		2:
			Escribir 'La calificación más alta es: ', calificacionMasAlta
		3:
			Escribir 'El promedio de las calificaciones es: ', promedio1
		De Otro Modo:
			Escribir 'Opción no válida.'
	FinSegún
FinAlgoritmo
