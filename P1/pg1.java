##crear una calse llamda fraccion con atributos correspondientes a numerador y denominador aplicar encapsulamiento y almenos un metodo set y get 
para manipular objetos de esa clase.

class Fraccion:
    def __init__(self, numerador, denominador):
        self.__numerador = numerador
        self.__denominador = denominador
    def get_numerador(self):
        return self.__numerador

    def get_denominador(self):
        return self.__denominador

 
    def set_numerador(self, numerador):
        self.__numerador = numerador

    def set_denominador(self, denominador):
        if denominador != 0:  # Para evitar división por cero
            self.__denominador = denominador
        else:
            raise ValueError("El denominador no puede ser cero.")

    def __str__(self):
        return f"{self.__numerador}/{self.__denominador}"
