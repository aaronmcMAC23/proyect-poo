Algoritmo Calif2
	Definir calf Como Real
	Escribir 'Ingresa la calificación obtenida:'
	Leer calf
	Si calf<6 Entonces
		Escribir 'No lo lograste :('
	SiNo
		Si calf>=6 Y calf<8 Entonces
			Escribir 'Puedes hacerlo mejor'
		SiNo
			Si calf>=8 Y calf<9 Entonces
				Escribir 'Bien hecho'
			SiNo
				Si calf>=9 Y calf<10 Entonces
					Escribir 'Muy bien'
				SiNo
					Si calf=10 Entonces
						Escribir 'Excelente'
					SiNo
						Escribir 'Datos mal ingresados'
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
