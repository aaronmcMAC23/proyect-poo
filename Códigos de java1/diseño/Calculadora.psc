Algoritmo Calculadora
	Definir num1, num2, resultado Como Real
	Definir operacion Como Cadena
	Escribir 'Ingrese el primer valor:'
	Leer num1
	Escribir 'Ingrese el segundo valor'
	Leer num2
	Escribir 'Ingrese la operacion a ealizar ( +, -, * , /)'
	Leer operacion
	Según operacion Hacer
		'+':
			resultado <- num1+num2
		'-':
			resultado <- num1-num2
		'*':
			resultado <- num1*num2
		'/':
			Si num2<>0 Entonces
				resultado <- num1/num2
			SiNo
				Escribir 'no valido compañero :('
			FinSi
	FinSegún
	Escribir 'El resultado de ', num1, '', operacion, '', num2, ' es: ', resultado
FinAlgoritmo
