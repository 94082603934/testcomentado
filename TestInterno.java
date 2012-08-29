class TestInterno{
    int a;//Declaracion de la variable (tipo entero)
    String b;// Declaracion variable (tipo cadena)
    TestInterno[] c;// arreglo

    TestInterno(int a, String b){//Costructor
        this.a=a;//parametros
        this.b=b;//parametros
    }

    void calcular(int size){//En este linea se calcula el tamaño
        c = new TestInterno[size];// c es un nuevo arreglo
        for(int i = 0; i<size; i++){ // i=0 y menor al tamaño del arreglo  cumpliendo esa condicion se ira sumando de uno en uno
            c[i] = new TestInterno((int)(100*Math.random()), Long.toHexString(Double.doubleToLongBits(Math.random())));//Devuelve un numero aleatorio que es menor  al num de pocisiones del arreglo de tipo doble
        }
    }
}
