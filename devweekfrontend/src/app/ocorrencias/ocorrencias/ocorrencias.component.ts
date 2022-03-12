import { Component, OnInit } from '@angular/core';

import { Regiao } from '../model/regiao';
import { RegiaoService } from '../service/regiao.service';
import { Faixaetaria } from './../model/faixaetaria';
import { Incidencia } from './../model/incidencia';
import { FaixaetariaService } from './../service/faixaetaria.service';
import { IncidenciaService } from './../service/incidencia.service';

@Component({
  selector: 'app-ocorrencias',
  templateUrl: './ocorrencias.component.html',
  styleUrls: ['./ocorrencias.component.css']
})
export class OcorrenciasComponent implements OnInit {

  regioes: Regiao[] = [];
  faixaEtarias: Faixaetaria[] = [];
  incidencias: Incidencia[] = [];

  constructor(
    private regiaoService: RegiaoService,
    private faixaEtariaService: FaixaetariaService,
    private incidenciaService: IncidenciaService
    ) { }

  ngOnInit(): void {
    this.regiaoService.listRegioes().subscribe((regioes) => {
      this.regioes = regioes;
    });
    this.faixaEtariaService.listFaixasEtaria().subscribe((faixaEtarias) => {
      this.faixaEtarias = faixaEtarias;
    });
    this.incidenciaService.listIncidencias().subscribe((incidencias) => {
      this.incidencias = incidencias;
    });
  }

}
