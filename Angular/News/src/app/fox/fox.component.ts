import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-fox',
  templateUrl: './fox.component.html',
  styleUrls: ['./fox.component.css']
})
export class FoxComponent implements OnInit {
  newsfox;
  constructor(private http: HttpClient) {
    this.foxnews();
  }

  foxnews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=fox-news&apiKey=c514a69bcf0d461ebe29a759f9404680').subscribe(data => {
        this.newsfox = data.articles ;

    }, err => {
        console.log(err);
    }, () => {
        console.log('news of India got successfully');
    });
}


  ngOnInit() {
  }

}
