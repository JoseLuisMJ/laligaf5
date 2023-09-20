import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Teams } from '../models/teams.model';

@Injectable({
  providedIn: 'root'
})
export class TeamsService {
  private apiUrl = 'http://localhost:4000/events/teams';
  constructor(private http: HttpClient) { }


  getTeams(): Observable<Teams[]> {
    return this.http.get<Teams[]>(this.apiUrl);
  }

  getTeam(TeamsId: string): Observable<Teams> {
    const url = `${this.apiUrl}/${TeamsId}`; 
    return this.http.get<Teams>(url);
  }

  saveTeams(teamsData: Teams): Observable<Teams> {
    return this.http.post<Teams>(`${this.apiUrl}/create`, teamsData);
  }

  deleteTeams(teamsId: string): Observable<Teams> {
    return this.http.delete<Teams>(`${this.apiUrl}/delete/${teamsId}`);
  }
  
}

