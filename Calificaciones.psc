Algoritmo Calificaciones
	Definir n, promedio, calf, suma Como Real
	Escribir 'Ingrese el numero de calificaciones a registrar: '
	Leer n
	suma <- 0
	Para i<-1 Hasta n Con Paso 1 Hacer
		Escribir 'Ingrese calificacion: ', i, ':'
		Leer calf
		suma <- suma+calf
	FinPara
	promedio <- suma/n
	Escribir 'El promedio de las ', n, ' calificaciones es: ', promedio
FinAlgoritmo
