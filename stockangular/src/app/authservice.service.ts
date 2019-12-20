import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthserviceService {
products;
orderlist: [] =[];
  constructor(private http: HttpClient) { }

  addproducts(product): Observable<any> {
    return this.http.post('http://localhost:8080/product/add', product);
  }
  searchproduct(name): Observable<any> {
    // tslint:disable-next-line: max-line-length
    return this.http.get <any> (`http://localhost:8080/product/get/${name}`, {headers: new HttpHeaders({'Content-Type': 'application/json'})});
  }
  search(category) {
    return this.http.get <any> (`http://localhost:8080/product/getcategory/${category}`, {headers: new HttpHeaders({'Content-Type': 'application/json'})});
  }
  modifyProduct(product): Observable<any> {
    return this.http.post('http://localhost:8080/product/modify', product);
  }
}
