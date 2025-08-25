package dev.martins.Encurtador.Links;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "links_dos_otarios")
public class Link {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String urlLong;
  private String urlEncurtada;
  private String urlQrCode;
  private LocalDateTime urlCriadaEm;

  public Link() {}

  public Link(
    Long id,
    String urlLong,
    String urlEcurtada,
    String urlQrCode,
    LocalDateTime urlCriadaEm
  ) {
    this.id = id;
    this.urlLong = urlLong;
    this.urlEncurtada = urlEcurtada;
    this.urlQrCode = urlQrCode;
    this.urlCriadaEm = urlCriadaEm;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public String getUrlLong() {
    return urlLong;
  }

  public void setUrlLong(String urlLong) {
    this.urlLong = urlLong;
  }

  public String getUrlEncurtada() {
    return urlEncurtada;
  }

  public void setUrlEncurtada(String urlEncurtada) {
    this.urlEncurtada = urlEncurtada;
  }

  public String getUrlQrCode() {
    return urlQrCode;
  }

  public void setUrlQrCode(String urlQrCode) {
    this.urlQrCode = urlQrCode;
  }

  public LocalDateTime getUrlCriadaEm() {
    return urlCriadaEm;
  }

  public void setUrlCriadaEm(LocalDateTime urlCriadaEm) {
    this.urlCriadaEm = urlCriadaEm;
  }
}
