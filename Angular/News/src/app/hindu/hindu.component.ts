import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-hindu',
  templateUrl: './hindu.component.html',
  styleUrls: ['./hindu.component.css']
})
export class HinduComponent implements OnInit {
  newshindu;
  constructor(private http: HttpClient) {
    this.hindunews();
   }

  hindunews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=the-hindu&apiKey=c514a69bcf0d461ebe29a759f9404680').subscribe(data => {
        this.newshindu = data.articles ;

    }, err => {
        console.log(err);
    }, () => {
        console.log('news of India got successfully');
    });
}

  ngOnInit() {
  }

}
