package PrimeiroProjetoBD.BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private Integer idCategoria;
    private String descricao;

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void inserirCategoria() {
        Connection con = bd_oracle.obterConexao();
        PreparedStatement stmt;

        String sql = "INSERT INTO CATEGORIA (IDCATEGORIA,DESCRICAO) VALUES (?, ?) ";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, this.idCategoria);
            stmt.setString(2, this.descricao);
            stmt.executeUpdate();
            System.out.println("Categoria inserida com sucesso! ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterarCategoria() {
        Connection con = bd_oracle.obterConexao();
        PreparedStatement stmt;
        try {
            String sql = "UPDATE CATEGORIA SET DESCRICAO = ? WHERE IDCATEGORIA = ? ";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, this.descricao);
            stmt.setInt(2, this.idCategoria);
            stmt.executeUpdate();
            System.out.println("Categoria atualizada com sucesso! ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void excluirCategoria() {
        Connection con = bd_oracle.obterConexao();
        PreparedStatement stmt;
        String sql = "DELETE FROM CATEGORIA WHERE IDCATEGORIA = ?";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, this.idCategoria);
            stmt.executeUpdate();
            System.out.println("Categoria excluída com sucesso !");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Categoria> pesquisarCategoria(){
        Connection con = bd_oracle.obterConexao();
        PreparedStatement stmt;

        String sql = "SELECT * FROM CATEGORIA";

        List<Categoria> listCategorias = new ArrayList<>();

        try{
        stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery(sql);

        if(!result.next()){
            System.out.println("Não há linhas para exibir! ");
        }
            System.out.println("---CATEGORIAS---");
        while (result.next()){
            Categoria c = new Categoria();
            c.idCategoria = result.getInt(("IDCATEGORIA"));
            c.descricao = result.getString("DESCRICAO");
            listCategorias.add(c);
        }
    } catch (SQLException e) {
            throw new RuntimeException(e);
    }
        return listCategorias;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "idCategoria=" + idCategoria +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}

