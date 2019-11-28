import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  Entrnews;
  topnewsindia;
  sportnews;
    constructor(private http: HttpClient) {  
        this.getEntrnews();
        this.indiatopnews();
        this.sportsnews()
      }

        getEntrnews() {
            // tslint:disable-next-line: max-line-length
            this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=c514a69bcf0d461ebe29a759f9404680').subscribe(data => {
                this.Entrnews = data.articles ;
             
            }, err => {
                console.log(err);
            }, () => {
                console.log(' enteraintment news got successfully');
            });
        }

        
        indiatopnews() {
          // tslint:disable-next-line: max-line-length
          this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=c514a69bcf0d461ebe29a759f9404680').subscribe(data => {
              this.topnewsindia = data.articles ;
           
          }, err => {
              console.log(err);
          }, () => {
              console.log('news of India got successfully');
          });
      }

      
      sportsnews() {
        // tslint:disable-next-line: max-line-length
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=c514a69bcf0d461ebe29a759f9404680').subscribe(data => {
            this.sportnews = data.articles ;
         
        }, err => {
            console.log(err);
        }, () => {
            console.log('spotrs news got successfully');
        });
    }

  ngOnInit() {
  }

}
