# Questão 10 – Verdadeiro ou Falso

1. **O caso default é requerido na instrução de seleção switch.**  
   **Falso.**  
   O caso `default` é opcional no `switch`. Ele serve para tratar valores não previstos nos casos, mas não é obrigatório.

2. **A instrução break é requerida no último caso de uma instrução de seleção switch.**  
   **Falso.**  
   O `break` não é obrigatório no último caso. Se não for usado, a execução apenas sai do `switch` normalmente.

3. **A expressão ((x > y)&&(a < b)) é verdadeira se (x > y) for verdadeiro ou (a < b) for verdadeira.**  
   **Falso.**  
   O operador `&&` (E lógico) só retorna verdadeiro se **ambas** as condições forem verdadeiras, não apenas uma delas.

4. **Uma expressão contendo o operador || é verdadeira se um ou ambos de seus operandos forem verdadeiros.**  
   **Verdadeiro.**  
   O operador `||` (OU lógico) retorna verdadeiro se pelo menos um dos operandos for verdadeiro.

5. **Para testar para uma série de valores em uma instrução switch, pode-se utilizar um hífen ( - ) entre os valores inicial e final da série em um rótulo case.**  
   **Falso.**  
   Não é possível usar hífen para intervalos em `case`. É necessário listar cada valor separadamente.

6. **Listar casos consecutivamente sem instruções entre eles permite aos casos executar o mesmo conjunto de instruções.**  
   **Verdadeiro.**  
   Isso é chamado de "fall-through": vários `case` podem executar o mesmo bloco de código se não houver instruções (como `break`) entre eles.