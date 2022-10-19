""""# lista = Ariel , Liliana, Natalia , Osvaldo

nombres = ["Naty", "Osvaldo", "Lily", "Ariel"]
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[3])
print(nombres[-1])
print(nombres[-2])
print(nombres[0:2])# solo muestra el indice 1 y 0 pero no el 2
print(nombres[ :3])
print(nombres[1: ])
#modificamos un valor
nombres[2] ="Liliana"
nombres[0] = "Natalia"
print(nombres)

#Iterar una lista
for nombre in nombres:# nombre es singular, la lista es plural
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

#Preguntamos cuantos elementos tiene
print(len(nombres))#le pasamos como parametro la lista

#Agregamos un elemento
nombres.append('Camila')
print(nombres)

#Insertar un elemento en un indice especifico
nombres.insert(1,'Juan')
print(nombres)
nombres.insert(3,'Debora')
print(nombres)
#Eliminamos un elemento de la lista
nombres.remove('Debora')
print(nombres)
#Eliminar el ultimo elemento
nombres.pop()
print(nombres)

#eliminar un indice especifico
del nombres[2]
print(nombres)

#Eliminar,borrar o limpiar todos los elementos
nombres.clear()
print(nombres)

#Eliminar lista
del nombres()
"""
"""Sintaxis de range(inicio<opcional>, incremento<opcional>, fin<requerido>)"""


"""Ejercicio 3: Crear un rango de 3 a 10 pero con incremento de 2 en 2, en lugar de 1 en 1
Ejemplo de ejecucion: 3,5,7,9

Ejercicio 1: Iterar un rango de 0 a 10 e imprimir numeros divisibles entre 3
 Ejemplo de ejecucion: 0,3,6,9
numero= 3,4,5,6,7,8,9,10
for numero in range (11):
    if numero % 3 == 0:
        print(numero)
         
 # Ejercicio 2: Crear un rango de numeros de 2 a 6 e imprimelos
 Ejemplo de ejecucion: 2,3,4,5,6
 print("Rango con valores de inicio = 2 y fin = 7")
rango =range(2,7)
for i in rango:
    print(i)"""

print("Rango con valores de inicio = 3 y fin = 10, incremento= 2")
for i in range(3,11,2):
    print(i)

"""



#Ejercicio 7: Juego adivina el numero
#Realizar un juego para adivinar un número. Para ello se debe
#generar un número aleatorio entre - y luego ir pidiendo
#números indicando "es mayor" o "es menor"según sea mayor o menor
#con respecto a N. El proceso termina cuando el usuario acierta
# y allí se debe mostrar el número de intentos

import random
aleatorio = random.randint(0,100) #toma de  a literal, generamos un número aleatorio
contador = 0
while True:
    numero = int(input("Digite un número: "))
    contador += 1
    if numero > aleatorio:
        print("\tNo es el número, digite un numero menor")
    elif numero < aleatorio:
        print("\tNo es el numero digite un número mayor")
    else:
        print(f"FELICIDADES, acabas de adivinar el número {aleatorio}")
        break #rompe el ciclo y el bucle
    print(f"\nNúmero de intentos: {contador}")"""