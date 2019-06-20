
package com.example.teatrosalvador.teatrosalvador.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.teatrosalvador.teatrosalvador.Outros.AdaptadorNewTeatro;
import com.example.teatrosalvador.teatrosalvador.Outros.HistoriaTeatroActivity;
import com.example.teatrosalvador.teatrosalvador.R;

public class TeatroActivity extends AppCompatActivity {


    ListView lista;



    String[][] datos ={
            {" Teatro Jorge Amado ", "Av. Manoel Dias da Silva, 2177 - Pituba, Salvador - BA, 41830-000",
                    "Telefone: (71) 3525-9720}",   "O Teatro Jorge Amado foi aberto em 09 de agosto de 1997 pelo Curso de Inglês UEC. Um espaço completo, " +
                    "pensado e construído com as condições exemplares para abrigar as mais diversas linguagens artísticas, eventos educacionais e festivos. Em 20 anos de atuação no cenário cultural de Salvador, " +
                    "o Teatro Jorge Amado trouxe ao público a possibilidade de assistir grandes espetáculos nacionais como Três Dias de Chuva, Gonzagão, a lenda, Doce de Leite, A cabra ou quem é Sylvia?, Caixa de Areia, entre outras. Além de espetáculos locais como: Cafajestes, O Vôo da Asa Branca, " +
                    "Vixe Maria Deus e Diabo na Bahia, O Indignado, Bolero, Bodas de Sangue, Dom Casmurro, Esperando Godot, " +
                    "Mulher Popular Brasileira, Renato Piaba, 7 Conto,  entre outras produções. Usar a arte como ferramenta de transformação social é, também, a missão do Teatro Jorge Amado. Por isso, sua equipe visa à formação novos apreciadores da arte" +
                    " e frequentadores dos espaços culturais da cidade, que sofrem com desvalorização e esvaziamento simultâneo. Por isso, tornou-se referência entre as escolas de ensino fundamental e médio que passaram a investir mais nos espetáculos amadores de seus alunos, " +
                    "desenvolvendo neles o gosto pelas artes cênicas e a criatividade. Possibilitou a retomada dos projetos a Escola Vai ao Teatro ampliando o mercado para as produções de espetáculos infantis locais e formando entre crianças da pré-escola os futuros fruidores de arte dramática."
                    },

            {" Teatro Vila Velha ", "  Av. Sete de Setembro, s/n - Passeio Público - Campo Grande, BA, 40080-110", " Telefone:(71) 3083-4600",    "O Teatro Vila Velha foi criado em 1964 pela Sociedade Teatro dos Novos, formada por Echio Reis, Sônia Robatto, Carlos Petrovich, Othon Bastos, Thereza Sá e Carmem Bittencourt, " +
                    "alunos dissidentes da Escola de Teatro da UFBA, liderados pelo professor João Augusto. Juntos," +
                    " eles fundaram um dos mais importantes teatros da Bahia, inaugurado com um show de estréia de nomes que logo viriam tornar-se famosos: Caetano Veloso, Gilberto Gil, Tom Zé, Gal Costa e Maria Bethânia - intitulado Nós, Por Exemplo  que foi um grande sucesso"
                    + "Fruto da contracultura, do Tropicalismo e da contestação que marcou o momento cultural brasileiro durante a Ditadura militar de 1964, o Vila albergou movimentos sociais, como as lutas estudantis da década de 1970." +
                           "O Vila também abrigou e foi mantido por diversos artistas (como o Grupo Teatro Livre da Bahia), realizou eventos de notoriedade para a cultura baiana (tais como os Shows do Improviso e o Baile das Atrizes, com a irreverente e marcante presença de Baby Consuelo)"+
   " Além disso, seguiu lançando nomes para o cenário artístico-cultural brasileiro, como Lázaro Ramos, Virgínia Rodrigues, Gustavo Melo, entre outros."
                    },

            {" Teatro Castro Alves ","Praça 2 de Julho, S/n - Campo Grande, Salvador - BA, 40080-121","Telefone: (71) 3535-0600",  "Fruto das ideias desenvolvimentistas do governador Antônio Balbino, a história do Teatro Castro Alves, que homenageia o \"Poeta dos Escravos\", possui momentos de grandes espetáculos e tragédias, como os dois incêndios que motivaram sua reforma. " +
                    "O primeiro deles ocorreu antes mesmo de sua inauguração. Era a madrugada do dia 9 de julho de 1958 - cinco dias antes da abertura ao público " +
                    "e a versão apurada oficialmente foi de que um curto-circuito havia destruído aquele que deveria ser o mais novo espaço cultural de uma cidade que jazia estagnada economicamente - o chamado Enigma Baiano" +
                    " que se estendia desde o início do século e nos anos 50 preocupava estudiosos e economistas."
                  },


            {" Teatro Martin Gonçalves ","Av. Araújo Pinho, 292 - Canela, Salvador - BA, 40110-150","Telefone: (71) 3283-7862",   "A história do teatro baiano pode ser delimitada pelo antes e depois da criação da Escola de Teatro da Universidade Federal da Bahia (1956). O trabalho de Martim Gonçalves com o grupo A Barca (1956-1963) " +
                    "renovou a cena teatral com uma política de intercâmbio que transformou a escola numa referência para o ensaio de teatro na América Latina e, atualmente, mantém intercâmbio com instituições em âmbito internacional." +
                    "O teatro Martim Gonçalves (nome atual do original Teatro Santo Antônio criado por Martim no casarão homônimo em 1958) teve ao longo desses anos um papel importante como renovador da cena teatral.Criado para ser reestruturado em dois anos, o teatro Martim Gonçalves manteve-se com pequenas reformas durante mais de 40 anos e, agora, reconstruído, é devolvido à cidade como um de seus melhores equipamentos."
                   },

            {" Teatro Gregorio de Mattos ","Praça Castro Alves, s/n - Centro, Salvador - BA, 40020-160","Telefone: (71) 3202-7888",  "Teatro parte de complexo cultural apresenta peças teatrais e musicais populares com bilheteria convencional."},

            {" Teatro Gamboa Nova ","R. Gamboa de Cima, 3 - Aflitos, Salvador - BA, 40060-008","telefone:(71)3329-2418",  "Nasce em 2007, com o intuito de reanimar um espaço cultural muito querido e peculiar de Salvador, que já foi administrado e ocupado " +
                    "por grandes artistas de dentro e fora da soterópolis, desde 1974. Um lugar de intimidade, de troca, de parcerias e amizades, que faz com que muitos criadores possam iniciar seus processos de apresentação e divulgação de espetáculos, shows, exposições, filmes, performances, entre outras obras importantes para a dinâmica artística local. " +
                    "Aqui, cada projeto é avaliado para proporcionar a formação de novas plateias, com ingressos a preços populares, misturando linguagens, lançando novos talentos, abrindo espaço também ao longo destes anos para oficinas de formação. A ideia é construir uma estrutura coletiva, democrática desde sua administração.",
                    },

            {" Teatro Sesc Pelourinho ","Largo do Pelourinho, 19 - Pelourinho, Salvador - BA, 40026-280","(71) 3324-4520","\n" +
                    "Inaugurado em 1975, ano de restauração dos casarões que formam o Complexo Turístico Sesc-Senac Pelourinho, o Teatro possui duas salas: um palco italiano e um semi-arena.Após ampla reforma em parceria com o Governo do Estado, o espaço foi reinaugurado em 1998," +
                    " com uma nova infraestrutura, que inclui hall, bilheteria, área administrativa, foyer, café bar, camarins e iluminação cênica; e desde então possui uma programação ininterrupta." +
                    " Importante espaço cultural de Salvador, o Teatro já recebeu ao longo de sua trajetória diversos artistas nacionais e internacionais do teatro, do circo, da dança e da música. É um dos espaços mais intensos da cidade, " +
                    "com atrações sempre a preços populares para atender aos comerciários, seus dependentes e público em geral, além contribuir para a formação e fidelização de novos públicos culturais."
                   },

            {" Teatro Eva Hertz ",": Av. Tancredo Neves, 2915 - Caminho das Árvores, Salvador - BA, 41820-910"," (71) 3505-9050",  "Peças teatrais, música ao vivo e outros eventos culturais, em espaço moderno e acolhedor no Salvador Shopping."
                   },

            {" Teatro Salesiano ","Praça Conselheiro Almeida Couto, 347 - Nazaré, Salvador - BA, 40050-405"," Telefone: (71) 3327-0166",  " O Teatro Salesiano dispõe de 482 lugares, central de ar-condicionado, equipe técnica, palco de 11m X 11m, projetor, além de sistema profissional de som e iluminação. O imóvel é, prioritariamente, destinado às atividades dos alunos do Colégio Salesiano Salvador, podendo também ser locado para produções culturais e eventos em geral." +
                    "Inaugurado em 1961 como Cine Teatro Nazaré, o espaço interrompeu as atividades, em 1994, para ampla reforma, sendo reinaugurado como Teatro Salesiano, em 2000. O local já foi palco de importantes peças e projetos de artistas de peso da dramaturgia nacional, a exemplo do saudoso Paulo Autran. " +
                    "Espetáculos baianos de sucesso também já passaram por aqui: Noviças Rebeldes, da Companhia Baiana de Patifaria com direção de Wolf Maia; “1,99”, com o ator Ricardo Castro, e Flics, dirigido por Fernando Guerreiro. O espaço também é requisitado para eventos empresariais, palestras, formaturas e/ou similares."
                   },

            {" Teatro Isba "," Av. Oceânica, 2717 - Ondina, Salvador - BA, 41950-000 ","Telefone: (71) 4009-3622","Em outubro de 2001, nasce o Projeto Teatro ISBA, para atender ao Curso de Artes Cênicas, lançado pela FSBA e também atuar como mais um equipamento cultural na Cidade. Nossa trajetória acumula grandes desafios e uma busca constante pela excelência; o que certamente contribuiu " +
                    "para o crescimento e o fortalecimento do nosso negócio. Como resultado hoje oferecemos aos clientes uma Instituição consolidada com um portfólio de produtos diversificados, além de contar com colaboradores qualificados, que são parte essencial da qualidade dos serviços prestados. " +
                    "A qualidade do nosso equipamento chama atenção de produtores locais e de nível nacional, que vêm trazendo ao Teatro, ao longo desses 15 anos, importantes espetáculos da cena baiana e do eixo Rio/São Paulo, como as peças: O Vôo da Asa Branca (que inaugurou o espaço); Corações Encaixotados; Manifesto – com Eva Vilma e Otton Bastos; Comida dos Astros; " +
                    "Hoje é Dia de Circo; Não Falem Mal da Rotina – com Elisa Lucinda; Alto de Anjicos; Alzira Power – com Cristina Pereira; Eri e Johnson – com Eri Johnson; Intenções Perigosas – com Samara Filippo e Guilerme Trajano; Ora Bolas – com Valéria Franco e Dalga Larrondo; Ensina-me a Viver, com Nilda Spencer; Vidas Divididas – com Antônia Fantonelle," +
                    " Fernanda Vasconcelos e Henri Castelli; Raul Seixas: A Metamorfose Ambulante – Com Nelito Reis; Sete Contos, com Luiz Miranda; apresentações do Ballet do Teatro de Munique, da Alemanha, dentre outros.Com a Companhia Baiana de Patifaria, parceira histórica, apresentamos: Capitães de Areia, A Vaca Lelé, Noviças Rebeldes, A Bofetada, Sricotico – Uma Comédia do Balacobaco, ABAFABANCA e mais recentemente, Fora da Ordem, com Lelo Filho."
                    },

            {" Teatro Casa do Comercio "," Edifício Casa do Comércio - Av. Tancredo Neves, 1109 - Pituba, Salvador - BA, 41820-021","Telefone: (71) 3273-8765","\n" +
                    "O Cine Teatro se constitui em um dos mais nobres espaços culturais da capital baiana, e está localizado na mais nova área comercial de Salvador: a Avenida Tancredo Neves, no bairro da Pituba. Com capacidade para 546 pessoas, dispõe de três foyers," +
                    " um american bar e infraestrutura necessária para atender a realização de programações culturais diversas, congressos, fóruns etc."
                   },

            {" Teatro Xisto Bahia "," Rua General Labatut, 27 – Barris, Salvador - BA, 40070-100","Telefone: (71) 3117-6155",     "Inaugurado em 1988, o Espaço Xisto Bahia está localizado no complexo da Biblioteca Pública dos Barris, que também " +
                    "abriga galeria a Pierre Verger e as salas de exibição Alexandre Robatto e Walter da Silveira. O Espaço Xisto Bahia recebe principalmente espetáculos de teatro e dança, mas comporta também shows de música e exposições de artes visuais.\n" +
                    "As apresentações podem ocorrer na sala principal ou no foyer do espaço. As salas de ensaio funcionam nos três turnos e são ocupadas com ensaios de artistas e grupos, oficinas e também algumas apresentações.\n" +
                    "O Xisto conta ainda com um grande acervo de teatro, composto por fotos, textos, jornais, revistas, cartazes, programas entre outros materiais que fazem parte da memória das artes cênicas baianas, desde 1940."
                    },

            {" Teatro A Outra "," R. Politeama de Cima, 114 - Politeama, Salvador - BA, 40080-130","Telefone: (71) 3565-4623",    "Grupo teatral de Salvador, criado em 2004 e que desenvolve atividades múltiplas nas artes cênicas."
                 },

            {" Teatro Modulo "," Av. Prof. Magalhães Neto, 1177 - Pituba, Salvador - BA, 41810-011","Telefone: (71) 2102-1350",   "O Teatro Módulo construído há 15 anos, a partir de uma iniciativa pioneira e inovadora do Colégio Módulo, com o objetivo de incentivar a Cultura e as Artes. " +
                    "Com uma infra-estrutura moderna, conforto e segurança para seu público, aliado ao profissionalismo da sua equipe técnica, o Teatro possibilita abrigar os mais diversos tipos de espetáculo, produções e eventos.\n" +
                    "Localizado na Av. Magalhães Neto,1177-Pituba o Módulo dispõe,tecnicamente, do que há de melhor para uma casa de espetáculo. Com capacidade para 282 lugares, podendo chegar, confortavelmente, até 300 lugares, " +
                    "acesso para deficiente físico, 3 camarins, ar-condicionado central, vagas para estacionamento, além de contar com a Sala Carlos Bastos, anexa ao Teatro, onde podem ser realizadas exposições, palestras, seminários, etc."},

    };

    int[] datosImg = {R.drawable.teatrojorgeamado,R.drawable.vilavelha,R.drawable.tca,
            R.drawable.martingoncalves,R.drawable.gregoriomattos,R.drawable.teatrogamboanova,R.drawable.teatropelourinho,
            R.drawable.teatroevahertz,R.drawable.teatrosalesiano,R.drawable.teatroisba,R.drawable.teatrocasacomercio,R.drawable.teatroxisto,
            R.drawable.teatrooutra,R.drawable.teatromodulo};






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teatro);


        lista = (ListView)findViewById(R.id.lsNewTeatro);

        lista.setAdapter(new AdaptadorNewTeatro(this,datos,datosImg));





        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent  VisualImageActivity = new Intent(view.getContext(), HistoriaTeatroActivity.class);
                VisualImageActivity.putExtra("TAT",datos[position][0]);
                VisualImageActivity.putExtra("TIT",datos[position][3]);
                VisualImageActivity.putExtra("IMG2",datosImg[position]);

                startActivity(VisualImageActivity);
            }
        });
    }
}
