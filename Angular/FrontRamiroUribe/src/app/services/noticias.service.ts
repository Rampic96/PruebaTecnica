import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { RespuestaAPI } from '../models/noticia.interface';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class NoticiasService {

  constructor(private http:HttpClient) { }

  getNoticias(): Observable<RespuestaAPI>{
    return this.http.get<RespuestaAPI>('https://api.spaceflightnewsapi.net/v4/articles/')
  }
}
