import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  constructor(private httpClient: HttpClient) { }

  getAllUsers(): Observable<any> {
    return this.httpClient.get('http://localhost:8080/getAll');
  }

  saveUser(model): Observable<any> {
    return this.httpClient.post('http://localhost:8080/create', model, {
      headers: new HttpHeaders().set('Content-Type', 'application/json')
    });
  }

  deleteUser(id) {
    return this.httpClient.delete('http://localhost:8080/user/' + id);
  }

  updateUser(id, user) {
    return this.httpClient.put('http://localhost:8080/update/' + id , user);
  }
}
