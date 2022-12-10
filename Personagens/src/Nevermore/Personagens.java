package Nevermore;

public class Personagens {

   public String nome;
   public String tipo;
   int pontos;

   Personagens(
         String nome,
         String tipo,
         int pontos) {
      this.nome = nome;
      this.tipo = tipo;
      this.pontos = pontos;

   }

   void alterarpontos(int alteracao) {
      if (alteracao > 0) {
         this.pontos += alteracao;
         System.out.println(this.nome + "ganhou" + alteracao + " pontos");
      }

      else if (alteracao < 0) {
         (this.pontos) += alteracao;
         System.out.println(this.nome + "perdeu " + alteracao * -1 + " pontos");
      }

      else if (this.pontos > 50) {
         this.pontos = 50;
      }

      else if (this.pontos < 50) {
         this.pontos = 50;
      }

   }

}
