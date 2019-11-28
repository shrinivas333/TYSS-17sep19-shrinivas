import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-espn',
  templateUrl: './espn.component.html',
  styleUrls: ['./espn.component.css']
})
export class EspnComponent implements OnInit {
  newsespn;
  constructor(private http: HttpClient) {
    this.espnnews();
  }


  espnnews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=espn&apiKey=c514a69bcf0d461ebe29a759f9404680').subscribe(data => {
        this.newsespn = data.articles ;

    }, err => {
        console.log(err);
    }, () => {
        console.log('news of India got successfully');
    });
}
  ngOnInit() {
  }

}
