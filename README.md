# TECNICAS-DE-PROGRAMA-O-EM-JAVA-2020.2
TÉCNICAS DE PROGRAMAÇÃO EM JAVA – 2020.2 TRABALHO – VERIFICAÇÃO 1

Este trabalho servirá como pontuação para a Verificação 1 de nossa disciplina de Técnicas de Programação. Para
tanto, o aluno deve considerar as seguintes observações:
 As questões devem ser enviadas exclusivamente pelo portal INADIAVELMENTE até o dia 29/09. Caso
isso não ocorra, o aluno ficará SEM NOTA de V1, precisando da VS para substituir a nota;
 As questões devem ser enviadas em um ÚNICO arquivo com todas as classes criadas;
 Todos os atributos de todas as classes devem ser privados e todos os métodos devem ser públicos.
 Os métodos referentes aos itens 3(a), 4(a), 4(b) e 4(c) devem ser COMENTADOS com suas próprias
palavras descrevendo como desenvolveram cada um desses métodos. Sem os comentários os itens
não serão considerados na pontuação;
 Caso seja percebida cópia de qualquer natureza em qualquer uma das questões, todos os alunos
envolvidos receberão nota ZERO na Verificação 1, sem direito a qualquer apelação. Isto serve até
mesmo para cópias parciais de questões.
PROJETO
Implemente em Java um sistema de delivery com os seguintes requisitos. Em todas as classes, implemente um
construtor sem argumentos e outro construtor com argumentos para todos os atributos, criados ou
herdados (exceto para o array), e métodos set/get para todos os atributos criados na classe (exceto para o
array).
1. Cada produto possui código, nome e peso.
2. Cada cliente possui código, nome e endereço.
3. Cada entrega possui código, data (use String), cliente, preço e uma relação de produtos a serem
entregues (use array). O preço é calculado de acordo com a distância em quilômetros até o local de
entrega.
a) Para o cálculo do preço da entrega, o método getPreco deve receber a distância em
quilômetros e multiplicar o valor do atributo preço pela distância recebida. Por exemplo, se
uma entrega tem preço R$ 4,00 por quilômetro e recebe como distância 4,50 km, o método
getPreco deve retornar R$ 18,00 (4,00 * 4,50).
4. A entrega expressa é um tipo de entrega que possui ainda um adicional de urgência, o qual é um valor a
ser adicionado ao atributo preço para diminuir o tempo de entrega, mas que aumenta o valor da entrega.
a) Sobrescreva o método getPreco para calcular o valor da entrega expressa sabendo que o
novo preço de entrega deve agora levar em consideração o adicional de urgência. Por
exemplo, se uma entrega tem preço R$ 4,00 por quilômetro com um adicional de R$ 2,00 e
recebe como distância 4,50 km, o método getPreco deve retornar R$ 27,00 ((4,00 + 2,00) * 4,50
= 6,00 * 4,50).
b) Implemente um método para incluir produtos no array e outro método para retornar um
produto do arrray a partir do índice.
c) Implemente um método para calcular e retornar o peso total dos produtos inseridos no array.
5. Crie uma classe principal para instanciar um cliente, três produtos, uma entrega e uma entrega expressa.
Inicialize os valores de todos os atributos de todos os objetos criados. Inclua os três produtos e o cliente
em ambas as entregas. Imprima na tela o resultado dos métodos 3(a), 4(a) e 4(c)
