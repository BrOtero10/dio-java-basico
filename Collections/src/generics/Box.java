package generics;

// Exemplo de generics type

// public class Box {
//     private Object object;
//     public void set(Object object) {
//         this.object = object;
//     }
//     public Object get() {
//         return this.object;
//     }
// }


// <> (diamond operator) -> inferir automaticamente o tipo com base no contexto

public class Box<T> {
    // T representa o Type
    // Pode ser qualquer tipo não primitivo
    private T t; 

    public void set(T t) {
        this.t = t;
    }
    public Object get() {
        return this.t;
    }
}

// Convenções de parâmetros:
// E - Elemento
// K - Chave
// N - Número
// V - Valor