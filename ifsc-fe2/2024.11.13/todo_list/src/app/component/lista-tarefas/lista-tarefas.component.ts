import { Component } from '@angular/core';
import { ControladorTarefaService } from '../../controller/controlador-tarefa.service';
import { ListaTarefa } from '../../model/lista-tarefa';
import { EntradaComponent } from '../entrada/entrada.component';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-lista-tarefas',
  standalone: true,
  imports: [EntradaComponent, FormsModule],
  templateUrl: './lista-tarefas.component.html',
  styleUrl: './lista-tarefas.component.css'
})
export class ListaTarefasComponent {

  lista: ListaTarefa = {
    _id: 4,
    _nome: "Tarefas ADS",
    _tarefas: []
  }

  public descricao = "descricao da tarefa"
  constructor(private controladorTarefas: ControladorTarefaService){


  }
}
