package Nevermore;

import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {
                Scanner input = new Scanner(System.in);
                Personagens wandinha = new Personagens(" Wandinha ", " Excluído ", 50);
                Personagens tyler = new Personagens(" Tyler ", " Padrão ", 50);
                Personagens xavier = new Personagens(" Xavier ", " Excluído ", 50);
                Personagens bianca = new Personagens(" Bianca ", " Excluído ", 50);
                Personagens enid = new Personagens(" Enid ", " Excluído ", 50);
                Personagens ajax = new Personagens(" Ajax ", " Excluído ", 50);

                System.out.println("A" + wandinha.nome
                                + "parece ter um dom especial para se envolver em problemas, mas tudo é aceitável quando se está a procura da verdade.");
                System.out.println("Então como ela poderia deixar que sua melhor amiga e colega de quarto" + enid.nome
                                + "fosse acusada de envenenar" + xavier.nome
                                + "injustamente, durante uma viagem com os seus amigos"
                                + tyler.nome + "," + bianca.nome + "e" + ajax.nome);
                System.out.println(
                                "De volta a Nevermore ela começa a sua investigação para saber quem é o verdadeiro culpado pelo envenenamento de"
                                                + xavier.nome + "por onde ela deveria começar a sua investigação ?");

                System.out.println("1- Identificar o veneno utilizado\n2- Refazer os passos de Xavier");
                int first = input.nextInt();

                if (first == 1) {
                        System.out.println("Após olhar os documentos da autopsia" + wandinha.nome
                                        + "descobre que o veneno utilizado veio de uma planta rara que a escola mantem na estufa, a estufa é vijiada por cameras mas as filmagens se encontram na sala da diretora que está sempre fechada.");

                        System.out.println(
                                        "1- Invadir a sala e correr o risco de ser expulsa. \n2- Não invadir a sala e procurar outra solução.");
                        int second = input.nextInt();

                        if (second == 1) {
                                System.out.println(wandinha.nome + "Foi expulsa após invadir a sala da diretora e"
                                                + enid.nome
                                                + "foi julgada culpada.");
                        }

                        if (second == 2) {
                                System.out.println(wandinha.nome + "decide então conversar com" + xavier.nome
                                                + "que confirma que"
                                                + enid.nome
                                                + "estava com ele na hora do envenenamento, com um novo halibi,"
                                                + enid.nome
                                                + "é inocentada");
                        }
                }

                if (first == 2) {
                        wandinha.alterarpontos(-50);
                        System.out.println("Ao refazer os passos do" + xavier.nome + "," + wandinha.nome
                                        + "encontra uma pulseira amaldiçoada e morre");

                        input.close();

                }
        }
}
