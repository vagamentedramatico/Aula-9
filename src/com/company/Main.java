package com.company;

/*

Considere as seguintes classes: Automóvel, Mota, Barco, Ferry, Avião, F16, Autocarro. Organize as classes utilizando os
conhecimentos de herança e polimorfismo de acordo com as caraterísticas de cada:

• Todos os veículos possuem uma lotação de lugares, representada por um vetor. A lotação é diferente dependendo do tipo
  de veículo
• Os veículos possuem um consumo de combustível de base 5L/km sendo que:

o Os veículos náuticos consomem 2x mais.o Os veículos aéreos consomem 3x mais.
o Em caso de missão de resgate,
o F16 consome 4x mais.
o O autocarro consome 2x mais caso a sua lotação seja superior a 50%.

• Deve ser possível saber o consumo de um veículo.
• Implemente a classe Pessoa.
• Implemente os métodos que permitem adicionar, remover e listar os passageiros de um veículo.

o Só é permitido adicionar Pessoas ao F16 caso estas pertençam à Força Aérea.
o A primeira pessoa a entrar e a sair de um veículo deve ser sempre alguém com carta de condução (exceto nos F16).

 */

public class Main {

    public static void main(String[] args) {

    F16 f16 = new F16(2,false);
    System.out.println(f16);

    }
}
