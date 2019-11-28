import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-bbc',
  templateUrl: './bbc.component.html',
  styleUrls: ['./bbc.component.css']
})
export class BBCComponent implements OnInit {
  newsbbc;
  constructor(private http: HttpClient) {
    this.bbcnews();
   }

  bbcnews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=c514a69bcf0d461ebe29a759f9404680').subscribe(data => {
        this.newsbbc = data.articles ;

    }, err => {
        console.log(err);
    }, () => {
        console.log('news of India got successfully');
    });
}
  ngOnInit() {
  }

}
