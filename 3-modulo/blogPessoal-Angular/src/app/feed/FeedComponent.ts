import { Component, OnInit } from '@angular/core';
import { Postagem } from '../model/Postagem';
import { Tema } from '../model/Tema';
import { PostagemService } from '../service/postagem.service';
import { TemaService } from '../service/tema.service';


@Component({
  selector: 'app-feed',
  templateUrl: './feed.component.html',
  styleUrls: ['./feed.component.css']
})
export class FeedComponent implements OnInit {

  key = 'data';
  reverse = true;

  postagem: Postagem = new Postagem();
  listaPostagem: Postagem[];

  tema: Tema = new Tema();
  listaTemas: Tema[];
  idTema: number;

  constructor(
    private postagemService: PostagemService,
    private temaService: TemaService
  ) { }

  ngOnInit() {
    window.scroll(0, 0);
    this.findALLPostagens();
    this.findALLTemas();
  }



  findALLPostagens() {
    this.postagemService.getALLPostagens().subscribe((resp: Postagem[]) => {
      this.listaPostagem = resp;
    });

  }

  publicar() {
    this.tema.id = this.idTema;
    this.postagem.tema = this.tema;

    if (this.postagem.titulo == null || this.postagem.texto == null || this.postagem.tema == null) {
      alert('Prencha todos os campos antes de publicar! ');
    } else {
      this.postagemService.postPostagem(this.postagem).subscribe((resp: Postagem) => {
        this.postagem = resp;
        this.postagem = new Postagem();
        alert('Postagem realizada com sucesso :)');
        this.findALLPostagens;
      });
    }
  }


  findALLTemas() {
    this.temaService.getALLTemas().subscribe((resp: Tema[]) => {
      this.listaTemas;
    });
  }

  findByIdTema() {
    this.temaService.getByIdTema(this.idTema).subscribe((resp: Tema) => {
      this.tema = resp;
    });


  }



}
