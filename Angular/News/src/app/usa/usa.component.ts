import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-usa',
  templateUrl: './usa.component.html',
  styleUrls: ['./usa.component.css']
})
export class UsaComponent implements OnInit {
  newsusa;
  constructor(private http: HttpClient) { 
    this.usanews();
  }

  usanews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=c514a69bcf0d461ebe29a759f9404680').subscribe(data => {
        this.newsusa = data.articles ;
     
    }, err => {
        console.log(err);
    }, () => {
        console.log('news of India got successfully');
    });
}


  ngOnInit() {
  }

}
