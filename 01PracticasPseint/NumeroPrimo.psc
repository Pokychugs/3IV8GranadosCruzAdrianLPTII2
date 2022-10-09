Algoritmo NumeroPrimo
	Repetir
		Escribir "Conocer que números son primos"
		Escribir "Comienza ingresando un número"
		Leer num1
		num3<-0
		
		
		Para num2<-1 Hasta num1 Hacer
			Si num1%num2=0 Entonces
				num3<-num3+1
			Fin Si
		FinPara
		
		Si num3=2 Entonces
			Escribir "El número es primo"
		SiNo
			Escribir "El número no es primo"
		Fin Si
		Escribir "Desea repetir si/no"
		Leer respuesta
	Hasta Que respuesta= "no"
FinAlgoritmo
