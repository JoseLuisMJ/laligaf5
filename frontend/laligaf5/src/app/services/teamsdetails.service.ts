import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { TeamsDetails } from '../models/teamsdetails.model';

@Injectable({
  providedIn: 'root'
})
export class TeamsDetailsService {
  private apiUrl = 'http://localhost:4000/events/teamsdetails';
  constructor(private http: HttpClient) { }


  getTeamsDetails(): Observable<TeamsDetails[]> {
    return this.http.get<TeamsDetails[]>(this.apiUrl);
  }

  getTeamDetail(TeamsId: string): Observable<TeamsDetails> {
    const url = `${this.apiUrl}/${TeamsId}`; 
    return this.http.get<TeamsDetails>(url);
  }

  saveTeamsDetails(teamsdetailsData: TeamsDetails): Observable<TeamsDetails> {
    return this.http.post<TeamsDetails>(`${this.apiUrl}/create`, teamsdetailsData);
  }

  deleteTeamsDetails(teamsdetailsId: string): Observable<TeamsDetails> {
    return this.http.delete<TeamsDetails>(`${this.apiUrl}/delete/${teamsdetailsId}`);
  }
  
}

