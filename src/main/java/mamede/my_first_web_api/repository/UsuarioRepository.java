package mamede.my_first_web_api.repository;

import mamede.my_first_web_api.handler.BusinessException;
import mamede.my_first_web_api.handler.CampoObrigatorioException;
import mamede.my_first_web_api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){

        if(usuario.getLogin()==null)
            throw new CampoObrigatorioException("login");

        if(usuario.getPassword()==null)
            throw new CampoObrigatorioException("password");

        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.printf("DELETE/ID - Recebendo o id: %d para excluir um usuário", id);
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson", "password"));
        usuarios.add(new Usuario("frank", "masterpass"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.printf("FIND/id - Recebendo o id: %d para localizar um usuário", id);
        return new Usuario("gleyson", "password");
    }
    public Usuario findByUsername(String username){
        System.out.printf("FIND/username - Recebendo o username: %s para ser localizado", username);
        return new Usuario("gleyson", "password");
    }
}
