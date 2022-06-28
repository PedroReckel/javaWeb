/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3adda;

/**
 *
 * @author pedro
 */
public class CarBean {
        private int codCarrinho;
        private int quantidade, produtos_codProduto, cliente_codCliente;

        public int getCodCarrinho() {
            return codCarrinho;
        }

        public void setCodCarrinho(int cod) {
            this.codCarrinho = cod;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setCategoria(int quantidade) {
            this.quantidade = quantidade;
        }

        public int getProduto() {
            return produtos_codProduto;
        }

        public void setProduto(int produto) {
            this.produtos_codProduto = produto;
        }

        public int getCliente() {
            return cliente_codCliente;
        }

        public void setCodImagem(int cliente) {
            this.cliente_codCliente = cliente;
        }
            
    }