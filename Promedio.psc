Algoritmo Promedio
	Definir n, promedio1, calf, suma Como Real
	Definir opcion Como Entero
	Definir calificacionMasBaja, calificacionMasAlta Como Real
	Escribir 'Ingrese el n�mero de calificaciones a registrar: '
	Leer n
	suma <- 0
	calificacionMasBaja <- 5
	calificacionMasAlta <- 10
	Para i<-1 Hasta n Con Paso 1 Hacer
		Escribir 'Ingrese calificaci�n ', i, ':'
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
	Escribir 'Selecciona una opci�n:'
	Escribir '1. Ver la calificaci�n m�s baja :('
	Escribir '2. Ver la calificaci�n m�s alta :)'
	Escribir '3. Ver el promedio de las calificaciones'
	Leer opcion
	// Realizar la operaci�n seleccionada
	Seg�n opcion Hacer
		1:
			Escribir 'La calificaci�n m�s baja es: ', calificacionMasBaja
		2:
			Escribir 'La calificaci�n m�s alta es: ', calificacionMasAlta
		3:
			Escribir 'El promedio de las calificaciones es: ', promedio1
		De Otro Modo:
			Escribir 'Opci�n no v�lida.'
	FinSeg�n
FinAlgoritmo
