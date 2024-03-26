# Meu Manual de Java

## Qual a diferença de "==" e ".equals()"?
Em Java, "==" e ".equals()" são usados para comparar objetos, mas eles têm propósitos diferentes:

"==" (igual igual): Este operador é usado para verificar se duas referências de objeto apontam para o mesmo local de memória, ou seja, se estão se referindo ao mesmo objeto na memória. Ele compara os valores dos endereços de memória, não os valores dos objetos em si.

Exemplo:

```
String str1 = "hello";
String str2 = "hello";
String str3 = new String("hello");

System.out.println(str1 == str2); // true (ambos apontam para o mesmo objeto na pool de strings)
System.out.println(str1 == str3); // false (str1 está na pool de strings, str3 está em outro local da memória)
```

".equals()": Este método é usado para verificar se o conteúdo dos objetos é o mesmo, ou seja, se eles são "semanticamente" iguais, de acordo com a implementação do método equals() para o tipo de objeto específico. Por padrão, a implementação de equals() na classe Object compara se duas referências se referem ao mesmo objeto (o mesmo que "=="). No entanto, muitas classes sobrescrevem o método equals() para fornecer uma lógica de comparação personalizada.

Exemplo:

```
String str1 = "hello";
String str2 = "hello";
String str3 = new String("hello");

System.out.println(str1.equals(str2)); // true (o conteúdo é o mesmo)
System.out.println(str1.equals(str3)); // true (o conteúdo é o mesmo, apesar de ocuparem locais diferentes na memória)
```

Em resumo, "==" verifica se duas referências apontam para o mesmo objeto na memória, enquanto ".equals()" verifica se o conteúdo dos objetos é igual de acordo com a implementação do método equals() para o tipo de objeto específico.