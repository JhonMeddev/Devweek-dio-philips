import { Observable } from 'rxjs';
import { Regiao } from '../model/regiao';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RegiaoService {

  constructor(
    private http: HttpClient
  ) { }

  listRegioes(): Observable<Regiao[]> {
    const url = 'api/regioes';
    return this.http.get<Regiao[]>(url);
  }
}
