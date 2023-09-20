import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Staff } from '../models/staff.model';

@Injectable({
  providedIn: 'root'
})
export class StaffService {
  private apiUrl = 'http://localhost:4000/events/staff';
  constructor(private http: HttpClient) { }


  getStaffs(): Observable<Staff[]> {
    return this.http.get<Staff[]>(this.apiUrl);
  }

  getStaff(staffId: string): Observable<Staff> {
    const url = `${this.apiUrl}/${staffId}`; 
    return this.http.get<Staff>(url);
  }

  saveStaff(staffData: Staff): Observable<Staff> {
    return this.http.post<Staff>(`${this.apiUrl}/create`, staffData);
  }

  deleteStaff(staffId: string): Observable<Staff> {
    return this.http.delete<Staff>(`${this.apiUrl}/delete/${staffId}`);
  }

}








  

  


