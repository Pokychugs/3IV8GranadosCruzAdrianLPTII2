Algoritmo Fibonacci
	Definir num1, num2, num3, num4, num5	Como Real
		Escribir "Conocer la Sucesión de Fibonacci"
		Escribir "Ingrese cantidad de términos de su sucesión:  "
		Leer num5
		num1 <- 0
		num2 <- 1
		num3 <- 0
		Mientras num4<num5 Hacer
			num4 <- num4+1
			Escribir num1
			num3 <- num1+num2
			num1 <- num2
			num2 <- num3
		FinMientras
		Escribir "Da click en Reiniciar para comenzar de nuevo"
FinAlgoritmo
