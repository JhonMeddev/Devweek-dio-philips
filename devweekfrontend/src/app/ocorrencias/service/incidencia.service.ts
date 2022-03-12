import { Observable } from 'rxjs';
import { Incidencia } from './../model/incidencia';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class IncidenciaService {

  constructor(private http: HttpClient) { }


  listIncidencias(): Observable<Incidencia[]> {
    const url = '/api/incidencias';
    return this.http.get<Incidencia[]>(url);
  }
}
