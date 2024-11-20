package ecohome.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_USUARIO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyAppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    @Column(name = "nome_usuario")
    private String username;

    @Column(name = "email_usuario")
    private String email;

    @Column(name = "senha_usuario")
    private String password;

    @Column(name = "telefone_usuario")
    private String phone;

}