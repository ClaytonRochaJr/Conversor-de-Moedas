
# Sobre 

É um programa feito em Java que permite aos usuários converter valores entre diferentes moedas, utilizando a API ExchangeRate-API para obter as taxas de câmbio em tempo real.
- **Funcionalidades:** O programa solicida ao usuário a moeda base e a moeda alvo (para conversão), utilizando a API ExchangeRate-API realiza a conversão, pergunta ao usuário se quer
  fazer outra conversão, após mostra os registros de conversões e a data hora e local do registro e as salva em um arquivo .txt 
  
# Tecnologias utilizadas
## Back end
- Java 
- Biblioteca Gson
- Maven

# Como executar o projeto

```bash
# clonar repositório
git clone https://github.com/ClaytonRochaJr/Conversor-de-Moedas.git
```
Abra o IntelliJ IDEA e selecione Open.

Navegue até o diretório do projeto clonado e clique em OK.

Aguarde o IntelliJ IDEA importar e indexar o projeto.

No painel do Projeto, navegue até src e encontre o arquivo Principal

Clique com o botão direito no arquivo Main.java e selecione Run 'Principal.main()'.

Siga as instruções do programa no console:

# Exemplo de uso
````
Seja bem vindo ao conversor de modedas!
Digite o código da moeda exemplos de moedas: 
AUD:Dólar Australiano
BRL:Real Brasileiro
CAD:Dólar Canadense
CHF:Franco Suíço
CNY:Yuan Chinês
EUR:Euro
GBP:Libra Esterlina
HKD:Dólar de Hong Kong
INR:Rúpia Indiana
JPY:Iene Japonês
Insira o código da moeda base (exepmlo: USD ou BRL)
usd
Insira o código da moeda Alvo
brl
Insira o valor a ser convertido
1
Valor convertido: 5.14
Digite continuar para continuar ou sair para sair ou 1 para ver mais moedas
continuar
Insira o código da moeda base (exepmlo: USD ou BRL)
cad
Insira o código da moeda Alvo
brl
Insira o valor a ser convertido
1
Valor convertido: 3.75
Digite continuar para continuar ou sair para sair ou 1 para ver mais moedas
sair
Os registros das conversões:
Registro número 1: Moeda Base para a conversão: [USD] Moeda a ser convertida: [BRL] Resultado da conversão: 5.14
Registro número 2: Moeda Base para a conversão: [CAD] Moeda a ser convertida: [BRL] Resultado da conversão: 3.75
Programa finalizado!
````
Após isto será salvo em um arquivo .txt
````
Moeda Base para a conversão: [USD] Moeda a ser convertida: [BRL] Resultado da conversão: 5.14
Moeda Base para a conversão: [CAD] Moeda a ser convertida: [BRL] Resultado da conversão: 3.75
Data: 2024-05-26 Hora: 19:40 (America/Sao_Paulo)
````
