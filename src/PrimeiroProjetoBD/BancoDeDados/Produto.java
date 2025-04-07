package PrimeiroProjetoBD.BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Produto {
    private int idProduto;
    private String descricao;
    private double preco;
    private Categoria categoria;

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", categoria=" + categoria +
                '}';
    }

    public void inserirProduto() {
        Connection cnx = bd_oracle.obterConexao();
        PreparedStatement stmt;
        String sql = "INSERT INTO CATEGORIA (IDPRODUTO, DESCRICAO, PRECO, IDCATEGORIA) "+" VALUES (?,?,?,?)";

        try{
            stmt = cnx.prepareStatement(sql);
            stmt.setInt(1,this.idProduto);
            stmt.setString(2, this.descricao);
            stmt.setDouble(3, this.idProduto);
            stmt.setInt(4, this.categoria.getIdCategoria());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
