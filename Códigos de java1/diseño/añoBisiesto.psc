Algoritmo AñoBisiesto
	Definir año Como Real
	Escribir "Ingresa el año compañero: "
	Leer año
	Si año %4 == 0 Entonces
		Si año % 100 <> 0 Entonces
			Si anio % 400 == 0 Entonces
				Escribir "Es un año bisisesto"
			SiNo
				Escribir"No es un año bisisesto"
			Fin Si
		SiNo
			Escribir "No es un año bisisesto"
		Fin Si
	SiNo
		Escribir "No es un año bisisesto"
	Fin Si
	
FinAlgoritmo
