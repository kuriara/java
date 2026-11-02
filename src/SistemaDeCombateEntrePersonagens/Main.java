package SistemaDeCombateEntrePersonagens;

public class Main {

    public static void main(String[] args) {

        Arma arma1 = new Arma("Excalibur", 2, 2);
        Arma arma2 = new Arma("Excalibu", 2, 2);
        Arma arma3 = new Arma("Excalib", 2, 2);
        Arma arma4 = new Arma("Excali", 2, 2);
        Guerreiro guerreiro1 = new Guerreiro(100, "Punpun", 10, arma1, 8);
        Guardiao guardiao1 = new Guardiao(100, "Aiko", 10, arma2, 5);
        Mago mago1 = new Mago(100, "Sachi", 10, arma3, 15, 10);
        Arqueiro arqueiro1 = new Arqueiro(100, "Afro", 10, arma4, 6, 1);

        Personagem personagem1 = new Personagem(300, "Treino", 10, arma1);

        Equipe equipeA = new Equipe ("Cão", 2);
        Equipe equipeB = new Equipe ("Treino", 2);

//        equipeA.adicionar(guerreiro1);
//        equipeA.adicionar(guardiao1);
//        equipeA.adicionar(mago1);
//        equipeA.adicionar(arqueiro1);

//        equipeB.adicionar(personagem1);

        Arena arena1 = new Arena(equipeA, equipeB);

//        arena1.executarTurno(guerreiro1, personagem1);
//        arena1.executarTurno(guardiao1, personagem1);
//        arena1.executarTurno(mago1, personagem1);
//        arena1.executarTurno(arqueiro1, personagem1);

//        System.out.println("---VIDA DO BOSS---");
//        System.out.println(personagem1.getVida());
//
//        System.out.println("---DURABILIDADE DA ARMA DO GUERREIRO---");
//        System.out.println(arma1.getDurabilidade());
//
//        System.out.println("---MANA DO MAGO---");
//        System.out.println(mago1.getMana());
//
//        System.out.println("---FLECHAS DO ARQUEIRO---");
//        System.out.println(arqueiro1.getFlechas());
//
//        arena1.executarTurno(mago1, personagem1);
//        arena1.executarTurno(mago1, personagem1);
//
//        System.out.println("---VIDA DO BOSS---");
//        System.out.println(personagem1.getVida());

//        System.out.println("VIDA DO GUARDIÃO ANTES");
//        System.out.println(guardiao1.getVida());
//
//        guardiao1.receberDano(20);
//
//        System.out.println("VIDA DO GUARDIÃO DEPOIS");
//        System.out.println(guardiao1.getVida());

        equipeA.adicionar(guerreiro1);
        equipeA.adicionar(mago1);
        equipeB.adicionar(arqueiro1);
        equipeB.adicionar(guardiao1);

        arena1.executarTurno(guerreiro1, mago1);

        System.out.println(mago1.getVida());

        System.out.println(arena1.isTurnoA());

        arena1.executarTurno(arqueiro1, guerreiro1);

        System.out.println(guerreiro1.getVida());

        arena1.executarTurno(arqueiro1, guerreiro1);

        System.out.println(guerreiro1.getVida());

    }

}
