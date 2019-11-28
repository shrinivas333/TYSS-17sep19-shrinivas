import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-technology',
  templateUrl: './technology.component.html',
  styleUrls: ['./technology.component.css']
})
export class TechnologyComponent implements OnInit {
  newstechnology;
  constructor(private http: HttpClient) {
    this.technologynews();
   }

  technologynews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=technology&apiKey=c514a69bcf0d461ebe29a759f9404680').subscribe(data => {
        this.newstechnology = data.articles ;

    }, err => {
        console.log(err);
    }, () => {
        console.log('news of India got successfully');
    });
}

  ngOnInit() {
  }

}
