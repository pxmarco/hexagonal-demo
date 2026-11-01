# Demo: Arquitetura Hexagonal (Ports & Adapters)

Exemplo simples em Java puro: criar um pedido de delivery com regra de frete gratis.

## Estrutura
- `domain/`: entidade e regras (sem dependencias externas)
- `application/`: casos de uso e portas (interfaces)
- `adapters/in/`: quem chama a aplicacao (Main)
- `adapters/out/`: quem a aplicacao chama (memoria, arquivo)

## Como rodar
    javac -d out src/domain/*.java src/application/*.java src/adapters/out/*.java src/adapters/in/*.java
    java -cp out adapters.in.Main memoria
    java -cp out adapters.in.Main arquivo

## Ideia principal
Trocar o adaptador de saida (memoria para arquivo) nao exige mudar o dominio nem o caso de uso.
