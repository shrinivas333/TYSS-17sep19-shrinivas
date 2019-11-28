import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
// tslint:disable-next-line: import-spacing
import {map}  from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {

firebaseurl = 'https://ty-shree.firebaseio.com/';

  constructor(public http: HttpClient) { }
  postuser(data) {
    console.log('services', data);
    return this.http.post(`${this.firebaseurl}/users.json`, data);
  }
  getusers() {
    return this.http.get(`${this.firebaseurl}/users.json`).pipe(
      map(data => {
        const newArray = [];
        // tslint:disable-next-line: forin
        for (const key in data) {
            newArray.push({...data[key], id : key});
        }
        return newArray;
      })

    );
  }
  updateuser(id, data) {
    return this.http.put(`${this.firebaseurl}/users/${id}.json`, data);
  }

  deleteuser(id) {
    return this.http.delete(`${this.firebaseurl}/users/${id}.json`);
  }
}
