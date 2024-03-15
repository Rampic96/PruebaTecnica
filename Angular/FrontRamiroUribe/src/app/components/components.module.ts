import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NoticiaComponent } from './noticia/noticia.component';
import { MaterialModule } from '../material.module';



@NgModule({
  declarations: [
    NoticiaComponent
  ],
  imports: [
    CommonModule,
    MaterialModule
  ],
  exports: [
    NoticiaComponent
  ]
})
export class ComponentsModule { }
