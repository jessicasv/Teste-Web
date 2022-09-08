#language: pt
Funcionalidade: Comprar produto
	#Fluxo de compras no site Petz
	#Envolve as páginas Home, Resultado da Consulta e Detalhes Páginas

Cenario: Compra a partir de uma Busca
Dado que acesso o site Petz
Quando busco por "coleira" e pressiono Enter
Então exibe uma lista de produtos relacionados a "coleira"
Quando escolho o produto "Coleira Zee.Dog NeoPro Bubblegum Rosa para Cães"
Então exibe para "tamanho P" o preço de "R$ 89,99"




