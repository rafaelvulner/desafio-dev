package br.com.bycoders.desafio.entity;

import br.com.bycoders.desafio.enuns.TipoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private TipoEnum tipo;

    private LocalDate data;

    private BigDecimal valor;

    private String cpf;

    private String cartao;

    private LocalDateTime hora;

    private String donoDaLoja;

    private String nomeDaLoja;
}
