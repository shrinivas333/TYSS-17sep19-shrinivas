import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-health',
  templateUrl: './health.component.html',
  styleUrls: ['./health.component.css']
})
export class HealthComponent implements OnInit {
  newshealth;
  constructor(private http: HttpClient) {
    this.healthnews();
   }

  healthnews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=health&apiKey=c514a69bcf0d461ebe29a759f9404680').subscribe(data => {
        this.newshealth = data.articles ;

    }, err => {
        console.log(err);
    }, () => {
        console.log('news of India got successfully');
    });
}



  ngOnInit() {
  }

}
