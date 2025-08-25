package dev.martins.Encurtador.Links;

import java.time.LocalDateTime;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
public class LinkService {

  private LinkRepository linkRepository;

  public LinkService(LinkRepository linkRepository) {
    this.linkRepository = linkRepository;
  }

  // Gerar uma URL aleatoria

  // TODO: REFATORAR PARA INCLUIR PARTE DA URL ORIGINAL NO AGORITIMO DE GERAÇÃO DE URL.
  public String gerarUrlAleatoria() {
    return RandomStringUtils.randomAlphanumeric(5, 10);
  }

  public Link encurtarUrl(String urlOriginal) {
    Link link = new Link();
    link.setUrlLong(urlOriginal);
    link.setUrlEncurtada(gerarUrlAleatoria());
    link.setUrlCriadaEm(LocalDateTime.now());
    link.setUrlQrCode("URL CODE INDISPONIVEL NO MOMENTO...");

    return linkRepository.save(link);
  }

  public Link obterUrlOriginal(String urlEcurtada) {
    try {
      return linkRepository.findByUrlEncurtada(urlEcurtada);
    } catch (Exception error) {
      throw new RuntimeException(
        "Url não existe nos nossos registros: " + error
      );
    }
  }
}
