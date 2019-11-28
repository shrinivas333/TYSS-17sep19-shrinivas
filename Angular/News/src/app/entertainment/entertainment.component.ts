import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-entertainment',
  templateUrl: './entertainment.component.html',
  styleUrls: ['./entertainment.component.css']
})
export class EntertainmentComponent implements OnInit {
  newsentertainment;
  constructor(private http: HttpClient) {
    this.entertainmentnews();
  }

  entertainmentnews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=c514a69bcf0d461ebe29a759f9404680').subscribe(data => {
        this.newsentertainment = data.articles ;

    }, err => {
        console.log(err);
    }, () => {
        console.log('news of India got successfully');
    });
}
  ngOnInit() {
  }

}
