package br.edu.infnet.atjava;


import br.edu.infnet.domain.model.Endereco;
import br.edu.infnet.domain.model.Usuario;
import br.edu.infnet.domain.repository.UsuarioRepository;
import br.edu.infnet.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class UsuarioLoader implements ApplicationRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{

        Endereco endereco = new Endereco();
        endereco.setBairro("Bairro Morada do vale");
        endereco.setCep("94110-100");
        endereco.setLocalidade("Gravatai");
        endereco.setLogradouro("Rua");
        endereco.setUf("RS");

        Usuario usuario = new Usuario();
        usuario.setNome("Aline Souza");
        usuario.setEmail("aline@aline.com");
        usuario.setSenha("123");
        usuario.setEndereco(endereco);
        usuario.setAdmin(true);

        usuarioRepository.save(usuario);

        System.out.println(usuario.getNome());

    }
}
