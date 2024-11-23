import { Component, OnInit } from '@angular/core';
import { ControladorTarefaService } from '../../controller/controlador-tarefa.service';
import { ListaTarefa } from '../../model/lista-tarefa';
import { EntradaComponent } from '../entrada/entrada.component';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { TarefaComponent } from '../tarefa/tarefa.component';

@Component({
  selector: 'app-lista-tarefas',
  standalone: true,
  imports: [EntradaComponent, FormsModule, CommonModule, TarefaComponent],
  templateUrl: './lista-tarefas.component.html',
  styleUrl: './lista-tarefas.component.css'
})
export class ListaTarefasComponent implements OnInit{

  public lista: ListaTarefa = {_id: 0, _nome: "", _tarefas: []}
  public descricao = "descricao da tarefa"
  constructor(private controladorTarefas: ControladorTarefaService){
      this.lista = controladorTarefas.listaAtual
    
  }

  ngOnInit(): void {
      
  }

  
  public adicionaTarefa(){  
    this.controladorTarefas.adicionaTarefa(this.descricao)
  }
}
