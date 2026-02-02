package com.alura.pratica.praticandocursos.lambdasstreamsspring.capituloum.generics;

 // Classe genérica Avaliacao
public class Avaliacao<T> {
     private final T item;        // item genérico avaliado (Produto, Servico, Assinatura, etc.)
     private final double nota;   // nota da avaliação (ex: 0.0 - 5.0)
     private final String comentario;

     public Avaliacao(T item, double nota, String comentario) {
         if (item == null) {
             throw new IllegalArgumentException("Item da avaliação não pode ser null.");
         }
         if (nota < 0.0 || nota > 5.0) {
             throw new IllegalArgumentException("Nota deve estar entre 0.0 e 5.0 (inclusive).");
         }
         this.item = item;
         this.nota = nota;
         this.comentario = comentario == null ? "" : comentario;
     }

     // getter e setter
     public T getItem() {
         return item;
     }

     public double getNota() {
         return nota;
     }

     public String getComentario() {
         return comentario;
     }

     @Override
     public String toString() {
         return "Avaliacao{" +
                 "item=" + item +
                 ", nota=" + nota +
                 ", comentario='" + comentario + '\'' +
                 '}';
     }

     // equals e hashCode baseados em item + nota + comentário (boa prática)
     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof Avaliacao)) return false;

         Avaliacao<?> avaliacao = (Avaliacao<?>) o;

         if (Double.compare(avaliacao.nota, nota) != 0) return false;
         if (!item.equals(avaliacao.item)) return false;
         return comentario.equals(avaliacao.comentario);
     }

     @Override
     public int hashCode() {
         int result;
         long temp;
         result = item.hashCode();
         temp = Double.doubleToLongBits(nota);
         result = 31 * result + (int) (temp ^ (temp >>> 32));
         result = 31 * result + comentario.hashCode();
         return result;
     }
 }
