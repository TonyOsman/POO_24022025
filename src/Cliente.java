import BancoDeDados.bd_oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cliente {
    private int idCliente;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

    //getters and setters
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public void insereCliente(){
        Connection cnx = bd_oracle.obterConexao();
        String sql = "Insert into Cliente (idCliente, nome, email, telefone, cpf) values (?,?,?,?,?)";
        PreparedStatement pstmt;
        try{
            pstmt = cnx.prepareStatement(sql);
            pstmt.setInt(1,this.idCliente);
            pstmt.setString(2,this.nome);
            pstmt.setString(3,this.email);
            pstmt.setString(4,this.telefone);
            pstmt.setString(5,this.cpf);
            pstmt.executeUpdate();
            System.out.println("Cliente inserido com SUCESSO!");

        }catch (SQLException e){
            e.printStackTrace();
        }
        }
    }


