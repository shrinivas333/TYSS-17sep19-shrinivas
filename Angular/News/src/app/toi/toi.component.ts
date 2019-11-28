import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-toi',
  templateUrl: './toi.component.html',
  styleUrls: ['./toi.component.css']
})
export class TOIComponent implements OnInit {
  newstoi;
  constructor(private http: HttpClient) { 
    this.  toinews();
  }

  toinews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=the-times-of-india&apiKey=c514a69bcf0d461ebe29a759f9404680').subscribe(data => {
        this.newstoi = data.articles ;

    }, err => {
        console.log(err);
    }, () => {
        console.log('news of India got successfully');
    });
}
  ngOnInit() {
  }

}
