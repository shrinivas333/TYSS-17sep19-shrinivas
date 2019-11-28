import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
    selector : 'app-home',
        templateUrl : './home.component.html',
        styleUrls : ['./home.component.css']
})


export class HomeComponent {
    news;
    constructor(private http: HttpClient) {  
        this.getnews();
      }

        getnews() {
            // tslint:disable-next-line: max-line-length
            this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=c514a69bcf0d461ebe29a759f9404680').subscribe(data => {
                this.news = data.articles ;
             
            }, err => {
                console.log(err);
            }, () => {
                console.log('news got successfully');
            });
        }


}
