import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-bussiness',
  templateUrl: './bussiness.component.html',
  styleUrls: ['./bussiness.component.css']
})
export class BussinessComponent implements OnInit {
  newsbussiness;
  constructor(private http: HttpClient) {
    this.bussinessnews();
   }


  bussinessnews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=business&apiKey=c514a69bcf0d461ebe29a759f9404680').subscribe(data => {
        this.newsbussiness = data.articles ;

    }, err => {
        console.log(err);
    }, () => {
        console.log('news of India got successfully');
    });
}
  ngOnInit() {
  }

}
