import java.util.Collection;// Paquete 
import java.util.Arrays;// Paquete  
import java.util.List;// Paquete 
import java.util.ArrayList;// Paquete 

class Test{ // inicio de la clase
    static TestInterno resumir(Collection<TestInterno> c){//llama al arreglo test interno
        String ans = "";//Declaracion de variable (tipo cadena)
        int total = 0;// Declaracion variable tipo entero
        for(TestInterno t : c){// para  TestInerno t hacer 
            total += t.a;// suma uno aL total
            ans += t.b;// Suma uno aL total
        }
        return new TestInterno(total, ans);// Devuelve total y ans 
    }

    public static void main(String[] args){// metodo
        List<TestInterno> lista = new ArrayList<TestInterno>();// Declaracion del arraylist 
        while(true){// condicional "mientras que sea verdadero haga 
            int i = Integer.parseInt(System.console().readLine());//dato digitado por el usario convertido en entero
            String j = System.console().readLine();// dato digitado por el usuario tipo cadena 
            lista.add(new TestInterno(i,j));// añade elementos digitados por el usuario 
            lista.get(lista.size()-1).calcular((int)(3*Math.random()));//  tamaño del arraylist -1 ,calcula y devuelve un numero aletrotio que
            // Ya estaba definido y  lo va multipilicandolo por 3
            TestInterno a = resumir(lista);//Inicacion y asignacion de testinerno a 
            System.out.println(">"+a.a);// Imprimir mayores a.a
            System.out.println(">"+a.b);// Imptimir valores mayores que a.b

            TestInterno total = new TestInterno(0, "");// Declaracion y asignacion de testinterno total
            for(TestInterno t : lista){// Para testinterno con paso por el arraylist hacer
                TestInterno actual = resumir(Arrays.asList(t.c));// Asigancion de testinterno actual como el arraylist
                total.a += actual.a; // Total a suamdo de uno en uno actual.a
                total.b += actual.b;// Total a sumado de uno en uno actual.b
            }

            System.out.println("->"+total.a);//Imprime total a
            System.out.println("->"+total.b);//Imprime total b  
        }
    }
}
