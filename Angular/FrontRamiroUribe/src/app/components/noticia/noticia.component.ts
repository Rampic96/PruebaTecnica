import { Component, OnInit } from '@angular/core';
import { Noticia } from 'src/app/models/noticia.interface';
import { NoticiasService } from 'src/app/services/noticias.service';

@Component({
  selector: 'app-noticia',
  templateUrl: './noticia.component.html',
  styleUrls: ['./noticia.component.scss']
})
export class NoticiaComponent implements OnInit {
  noticias: Noticia[] = [];
  
  constructor(private noticiasService: NoticiasService){
  }

  ngOnInit(){
    this.noticiasService.getNoticias().subscribe(data => {this.noticias = data.results});
  }
}
