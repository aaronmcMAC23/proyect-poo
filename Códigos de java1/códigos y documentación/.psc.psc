Algoritmo AñoBisiesto
	Definir ANO Como Real
	Escribir 'Ingresa el año compañero: '
	Leer ANO
	Si ANO MOD 4==0 Entonces
		Si ANO MOD 100<>0 Entonces
			Si anio MOD 400==0 Entonces
				Escribir 'Es un año bisisesto'
			SiNo
				Escribir 'No es un año bisisesto'
			FinSi
		SiNo
			Escribir 'No es un año bisisesto'
		FinSi
	SiNo
		Escribir 'No es un año bisisesto'
	FinSi
FinAlgoritmo
